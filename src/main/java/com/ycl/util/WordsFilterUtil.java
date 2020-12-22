package com.ycl.util;


import java.io.*;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


public class WordsFilterUtil {


    public static void main(String[] args) {
        Runtime runtime =  Runtime.getRuntime();
        long free = runtime.freeMemory()/1024/1024;

//        long start = System.currentTimeMillis();
        Trie trie = new Trie();
        File file = new File("F:\\学习\\关键字排除\\key2.txt");
        if(file.isFile() && file.exists()){
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String text = null;
                while((text = bufferedReader.readLine()) != null){
                    trie.add(text);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }finally {

            }
        }
        long free2 = runtime.freeMemory()/1024/1024;

        System.out.println(free2-free);
        System.out.println(trie.filter("_黑你妈逼" ));
        System.out.println("字典创建耗时：词汇量："+trie.getSize());

//        ConcurrentHashMap
                HashMap hashMap=new HashMap();
    }
}
