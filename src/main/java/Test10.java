import java.io.UnsupportedEncodingException;

public class Test10 {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        System.out.println("abc".contains("a"));
//        System.out.println("abc".contains("abcd"));
        String a=new String("的".getBytes(), "UTF-8");
        System.out.println(a);

        System.out.println(        getEncoding("第三方aa"));
    }

    public static String getEncoding(String str)
    {
        String encode;

        encode = "UTF-16";
        try
        {
            if(str.equals(new String(str.getBytes(), encode)))
            {
                return encode;
            }
        }
        catch(Exception ex) {}

        encode = "ASCII";
        try
        {
            if(str.equals(new String(str.getBytes(), encode)))
            {
                return "字符串<< " + str + " >>中仅由数字和英文字母组成，无法识别其编码格式";
            }
        }
        catch(Exception ex) {}

        encode = "ISO-8859-1";
        try
        {
            if(str.equals(new String(str.getBytes(), encode)))
            {
                return encode;
            }
        }
        catch(Exception ex) {}

        encode = "GB2312";
        try
        {
            if(str.equals(new String(str.getBytes(), encode)))
            {
                return encode;
            }
        }
        catch(Exception ex) {}

        encode = "UTF-8";
        try
        {
            if(str.equals(new String(str.getBytes(), encode)))
            {
                return encode;
            }
        }
        catch(Exception ex) {}

        /*
         *......待完善
         */

        return "未识别编码格式";
    }

}
