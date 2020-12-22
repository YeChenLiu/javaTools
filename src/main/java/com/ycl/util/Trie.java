package com.ycl.util;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Trie树
 */
public class Trie implements Serializable {

    //敏感词的替换字符 默认*
    private static final String DEFAULT_REPLACEMENT = "*";

    //节点内部类
    private class Node{
        public boolean isWord;//标识是否是一个单词的结尾
        //暂时默认每个节点都是一个char字符，也可以自定义成泛型
        public HashMap<Character,Node> next;

        public Node(boolean isWord){
            this.isWord = isWord;
            next = new HashMap<Character, Node>();
        }

        public Node(){
            this(false);
        }
    }

    private Node root;
    private int size;

    public Trie(){
        root = new Node();
        size = 0;
    }

    //返回单词数量
    public int getSize(){
        return  size;
    }

    //向Trie中添加一个单词
    public void add(String word){
        Node cur = root;
        for(int i=0;i< word.length();i++){
            char c = word.charAt(i);
            //是否为非法字符
            if(isSymbol(c)) {continue;}
            //判断当前指向的子节点是否包含C，若已包含则不用增加节点
            if(cur.next.get(c) == null){
                cur.next.put(c,new Node());
            }
            //移动到下层对应的字符的节点
            cur = cur.next.get(c);
        }
        if(!cur.isWord){
            //表明是一个新的单词，单词数量+1
            cur.isWord = true;
            size ++ ;
        }
    }

    //查询单词word是否在Trie中
    public boolean contains(String word){
        Node cur = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(cur.next.get(c)==null){
                return  false;
            }
            cur  =  cur.next.get(c);
        }

        return  cur.isWord;
    }

    //查询是否在Trie中有单词以Prefix为前缀
    public boolean isPrefix(String prefix){

        Node cur = root;
        for(int i=0;i<prefix.length();i++){
            char c = prefix.charAt(i);
            if(cur.next.get(c)==null){
                return  false;
            }
            cur  =  cur.next.get(c);
        }
        return  true;
    }

    /**
     * 判断是否是非法字符（即不可能存在敏感词汇的字）
     */
    private boolean isSymbol(Character c){
        int ic = (int)c;
        //东亚文字 0x2e80 —— 0x9fff
        return !((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')|| (c >= 'A' && c <= 'Z')) && (ic < 0x2E80 || ic > 0x9FFF);
    }


    /**
     * 过滤敏感词
     */
    public String filter(String text) {
        if (text.trim().length() == 0) {
            return text;
        }
        String replacement = DEFAULT_REPLACEMENT;
        StringBuilder result = new StringBuilder();

        Node node = root;
        int begin = 0; // 单词起始指针
        int position = 0; // 游标指针

        while (position < text.length()) {
            char c = text.charAt(position);
            // 空格、emoji、其他非法字符等直接跳过
            if (isSymbol(c)) {
                if (node == root) {
                    result.append(c);
                    begin++;
                }
                position++;
                continue;
            }
            //下一个节点
            node  = node.next.get(c);
            // 当前位置的匹配结束
            if (node == null) {
                // 以begin开始的字符串不存在敏感词
                result.append(text.charAt(begin));
                // 跳到下一个字符开始检查
                // 不是postion+1的原因： 兰花草xx，其中兰花草不是敏感词，但是草XX很可能是敏感词，两个词语有重叠字——草
                // 因此不能直接跳到postion+1，要检查文本中每个字符是否存在以其为开头的词语
                // 也是因为这个原因，上面只需要添加一个字符就好了，因为第二个字符到postion的字符还会再检查一遍
                position = begin + 1;
                begin = position;
                // 回到根节点
                node = root;
            } else if (node.isWord) {

                // 发现敏感词， 从begin到position的位置用replacement替换掉
                result.append(replacement);
                //这里是position + 1的原因：兰花草XX，假设兰花草是敏感词，就会被替换成*xx,可以直接跳到整个词语后面的第一个字符
                position = position + 1;
                begin = position;
                node = root;
            } else {
                position++;
            }
        }

        //当倒数第二个字符为敏感词的结尾时会引发一个问题，在最后一次循环中，Begin和postion都会指向最后一个字符
        //而此字符经过   node  = node.next.get(c); 判断不为空 ，只会执行position++退出循环，而不会加入到result中
        //综上所述这里需要对最后遗漏的字符做一个补充
        result.append(text.substring(begin));
        return result.toString();
    }
}
