package com;

public class Test8 {
    public static void main(String[] args) {

        int a = 1;
        a(a);
        System.out.println(a);
        int b = 1;
        b(b);
        System.out.println(b);
        Aa aa = new Aa();
        c(aa);
        System.out.println(aa.toString());
        String d = "1";
        d(d);
        System.out.println(d);
    }

    public static void a(int a) {
        a = 9;
    }

    public static void b(Integer a) {
        a = 10;
    }

    public static void c(Aa a) {
        a.a = 111;
        a.b = 22222;
        a.c = "33333";
    }

    public static void d(String a) {
        a = "aaaaaa";
    }

    static class Aa {
        public int a = 1;
        public Integer b = 2;
        public String c = "3";

        @Override
        public String toString() {
            return "Aa{" +
                    "a=" + a +
                    ", b=" + b +
                    ", c='" + c + '\'' +
                    '}';
        }
    }
}
