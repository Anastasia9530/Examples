package org.petrova.pomoika;

public class y1 {
    public static void main(String[] arg) {

        System.out.println("Hello");

        m1();

        int s1 = summ(1, 2, "result from s1");
        int s2 = summ(10, 20, "result from s2");
        int s3 = summ(30, 40, "result from s3");
        int s4 = summ(5, 6, "result from s4");

        System.out.println("s1: " + s1 + " ,s2: " + s2 + ", s3: " + s3 + ", s4: " + s4);

    }

    static void m1() {
        System.out.println("Hello from m1");
    }

    static int summ(int a, int b, String str) {
        System.out.println("Hello from summ, a: " + a + ", b: " + b);

        int s = a + b;

        System.out.println(str + ", " + s);

        return s;
    }
}
