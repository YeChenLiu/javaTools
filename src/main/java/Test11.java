import java.util.ArrayList;
import java.util.List;

public class Test11 {
    public static void main(String[] args) {
//        String a="sb=   /fjyl/local/taskPackSystem/taskPack/android-sign/linux/android-10/zipalign: error while loading shared libraries: libc++.so: cannot open shared object file: No such file or directory\n" +
//                "\n" +
//                "sb=   Verifies\n" +
//                "Verified using v1 scheme (JAR signing): true\n" +
//                "Verified using v2 scheme (APK Signature Scheme v2): true\n" +
//                "Verified using v3 scheme (APK Signature Scheme v3): true\n";
//        String b="Verified using v1 scheme (JAR signing): true";
//        System.out.println(a.contains(b));
//        List<Integer> list=new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        for (int i = 0; i <list.size() ; i++) {
//            if (i==1)continue;
//            System.out.println(list.get(i));
//        }

        AA[] aa = {new AA("a"), new AA("b")};
        List<String> list = new ArrayList<String>();
        for (AA a : aa) {
            list.add(a.a);
        }

        aa=null;

        for (String str:
             list) {
            System.out.println(str);
        }
        List<String> list2=list;
        list2.clear();
        for (String str:
                list) {
            System.out.println(str);
        }

    }
}
