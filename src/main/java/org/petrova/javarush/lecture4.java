package org.petrova.javarush;

public class lecture4 {
    public static void main(String[] args) {
        int a = 64;
        int b = a / 8;
        int c = b / 4;
        int d = c * 3;
        System.out.println("a=" + a + ",b=" + b);
        {
            int a2 = 100;
            System.out.println(a2);
        }
        a1();
        a2();
        for (int n = 1; n < 10; n = n + 1) {
            a2();
        }
    }

    public static void a1() {
        System.out.println("a1");
    }

    public static void a2() {
        System.out.println("a2");
    }

}

