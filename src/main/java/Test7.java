import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Test7 {
    public static void main(String[] args) {
        String content = "1111a";
//
//        String pattern = "^(?![a-zA-Z0-9]+$)(?![^a-zA-Z/D]+$)(?![^0-9/D]+$).{8,20}$";
//        String pattern = "^[a-zA-Z](?=.*\\d)(?=.*[^a-zA-Z\\d])[^\\u4e00-\\u9fa5\\s]{7,19}$";
//
//        boolean isMatch = Pattern.matches(pattern, content);
//        System.out.println(isMatch);


//        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//// 获取对应的平方数
//        List<Integer> squaresList = numbers.stream().map(i -> i * i).collect(Collectors.toList());
//        squaresList.forEach(integer -> {
//            System.out.println(integer);
//        });

//        Random random = new Random();
//        random.ints().limit(10).forEach(System.out::println);


//        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
//        // 获取空字符串的数量
//        long count = strings.stream().filter(string -> string.isEmpty()).count();
//        strings = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//        strings.forEach(s -> {
//            System.out.println(s);
//        });
        String pattern = "^[\\d,]*$";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println(isMatch);


        String abc="12345,2222334,";
        if (abc.substring(abc.length()-1).contains(",")){
            StringBuilder stringBuilder=new StringBuilder(abc);
            abc=stringBuilder.replace(abc.length()-1,abc.length(),"a").toString();
            System.out.println(abc);
        }
        System.out.println(abc);


        String aa="java -jar /fjyl/taskPackSystem/taskPack/android-sign/apksigner_v3.jar sign --ks jks/youlong_123456.jks --ks-key-alias youlong --ks-pass pass:123456 --key-pass pass:123456 --out ../TaskFile/packChilds3000064103847/yhjy_android_CqH8BawVTpV-SP7Tqj211Q.apk ../TaskFile/packChilds3000064103847/yhjy_android_CqH8BawVTpV-SP7Tqj211Q.apk";
                String bb="java -jar /fjyl/taskPackSystem/taskPack/android-sign/apksigner_v3.jar sign --ks jks/youlong_123456.jks --ks-key-alias youlong --ks-pass pass:123456 --key-pass pass:123456 --out ../TaskFile/packChilds3000064103847/yhjy_android_CqH8BawVTpV-SP7Tqj211Q.apk ../TaskFile/packChilds3000064103847/yhjy_android_CqH8BawVTpV-SP7Tqj211Q.apk";
        System.out.println("aaa   "+aa.equals(bb));
    }
}
