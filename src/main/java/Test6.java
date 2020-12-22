import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test6 {

    public static void main(String[] args) {
//        int[] arr= new int[1000000];
////
////        for (int i = 0; i <10000000; i++) {
////            arr[i]=1;
////        }
////
////        System.out.println("aaa");

//        Set<Aaa> s1 = new HashSet<>();
//        Aaa aaa = new Aaa();
//        aaa.a = 1;
//        aaa.b = 1;
//        s1.add(aaa);
//        Aaa aaa1 = new Aaa();
//        aaa1.a = 2;
//        aaa1.b = 2;

//        String a = "http://192.168.28.50:8083/bExtendPreview/previewPage.html?gameId=tU3vDRcHwdktpqLtLpiNnQ&autoIndex=oBvgr8cxWJowMeEtDqE3tQ";
//        int start = a.lastIndexOf("gameId=") + 7;
//        int end = a.indexOf("&autoIndex");
//        System.out.println(start + "    " + end);
//        String b = a.substring(start, end);
//        System.out.println(b);
        String a="15346asdasdasdasda53@qq.com";
        System.out.println(hideEmailInfo(a,2));

    }
    public static String hideEmailInfo(String info, int head) {
        //参数过滤
        Assert.hasText(info, "信息隐藏 >> info 参数不能为空！");

        //修正可能错误的参数
        if (head < 0) head = 0;
        int end = info.indexOf("@");
        //计算明文长度
        int plaintextLength = head + end;
        //获取信息长度
        int infoLength = info.length();
        //如果明文长度大于等于信息总长度，则不隐藏信息直接返回
        if (plaintextLength >= infoLength) return info;

        //用户保存隐藏后的信息
        StringBuilder cipherInfo = new StringBuilder();
        //添加不隐藏的信息头
        if (head > 0) cipherInfo.append(info.substring(0, head));
        //添加代表隐藏信息的星号数量
        for (int i = plaintextLength; i < infoLength; i++) cipherInfo.append("*");
        //添加不隐藏的信息尾
        if (end > 0) cipherInfo.append(info.substring(end, infoLength));

        return cipherInfo.toString();
    }

    public static void aaa() {
        for (int i = 0; i < 100000000; i++) {
            AA aa = new AA("a");
        }
    }

    public static class Aaa {
        public Integer a;
        public Integer b;
    }
}
