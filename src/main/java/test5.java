import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class test5 {
    public static void main(String[] args) {
//        Integer a = 10;
//        Long b = 10L;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(b.equals(b));
//        Hashtable hashtable=new Hashtable();
//        hashtable.containsValue()
//        HashMap hashMap=new HashMap();

//        String a = "a";
//        String b = a;
//        a = "c";
//        System.out.println(b);
//
//        int a1 = 1;
//        int b1 = a1;
//        a1 = 2;
//        System.out.println(b1);
//
//        Integer a2 = 1;
//        Integer b2 = a2;
//        a2 = 2;
//        System.out.println(a2);
//
//        AA aa = new AA();
//        aa.a = "aaa";
//        AA bb = aa;
//        aa.a = "bbbbb";
//        System.out.println(bb.a);
//
//        String casdasdasd = "aaa";
//        aaaa(casdasdasd);
//        System.out.println(casdasdasd);
//
//        Integer bbbbb = 1;
//        bbbbbbb(bbbbb);
//        System.out.println(bbbbb);


        Integer a=1;
        Integer b=2;
        Integer c=a+b;
        Integer d=3;
        System.out.println(a==b);
        System.out.println(c==d);

        String s1 = "123";
        String s2 = "456";
        String s3 = s1 + s2;
        String s4 = "123456";
        String s5 = new String("123456");
        System.out.println(s3 == s4);//s3在堆中，s4在常量池中  false
        System.out.println(s3 == s5);//在堆中的两个不同对象  false

    }

    public static void aaaa(String a) {
        a = "casdasdasd";
    }

    public static void bbbbbbb(Integer a) {
        a = 10000;
    }
}
