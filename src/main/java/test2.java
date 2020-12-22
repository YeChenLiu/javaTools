public class test2 {

    public static void main(String[] args) {
        //反例，浮点数采用“尾数+阶码”的编码方式，类似于科学计数法的“有效数字+指数”的表示方式。二制无法精确表示大部分的十进制小数
        double a = 1.0;
        double b = 0.9;
        double c = 0.8;
        if (a - b == b - c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        //正例，指定一个误差范围，两个浮点数的差值在此范围之内，则认为是相等的
        double d = 1.0;
        double diff = 1e-6;
        if (Math.abs(a - d) < diff) {
            System.out.println(true);
        }
    }
    }