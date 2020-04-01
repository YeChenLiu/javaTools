import com.ycl.bean.Student;
import com.ycl.util.MD5Utils;
import com.ycl.util.MapUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class test1 {

    public static void main(String[] args) {
//        Student stduent = new Student();
//        stduent.setId("1");
//        stduent.setName("abc");
//
//        List<Student> list = new ArrayList<Student>();
//        list.add(stduent);
//        stduent.setList(list);
//        stduent.setStduent(stduent);
//        for (int j = 0; j < 100; j++) {
//            long a = System.currentTimeMillis();
//            for (int i = 0; i < 10000; i++) {
////                Map map = JSONObject.parseObject(JSONObject.toJSONString(stduent), Map.class);
//            Map map = MapUtils.objToMap(stduent);
//                Iterator iterator = map.entrySet().iterator();
//                while (iterator.hasNext()) {
//                    Map.Entry entry = (Map.Entry) iterator.next();
////                System.out.println(entry.getKey() + "   " + entry.getValue());
//                }
//            }
//            long b = System.currentTimeMillis();
//            System.out.println(b - a);
//        }
//        try {
//            String s = MD5Utils.md5ForFilePath("E:\\c\\a\\b.ipa");
//            System.out.println("s.length()="+s.length());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(File.separator);


//        test1 test1 = new test1();
//        test1.aa();


        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "");
        map.put("5", " ");
        map.put("6", null);
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey() + "==" + next.getValue());
        }
        MapUtils.removeNullEntry(map);
        Iterator<Map.Entry<String, String>> iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, String> next = iterator2.next();
            System.out.println(next.getKey() + "==" + next.getValue());
        }
    }

    public void aa() {
        List<Student> list = new ArrayList<Student>();
        Student student = new Student();
        student.setId("1");
        student.setName("a");
        list.add(student);
        for (Student s :
                list) {
            s.setId("2");
        }
        System.out.println(list.get(0).getId());

        List<String> list2 = new ArrayList<String>();
        list2.add("aa");
        for (String a :
                list2) {
            a = "bb";
        }
        System.out.println(list2.get(0));

        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(3);
        for (Integer i :
                list3) {
            i = 4;
        }
        System.out.println(list3.get(0));
    }


}
