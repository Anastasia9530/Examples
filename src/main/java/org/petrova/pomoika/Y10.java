package org.petrova.pomoika;

import org.petrova.common.Utils;

import java.util.Random;

public class Y10 {
    public static void main(String[] args) {
        Utils.log("Привет");

        a1();
        a2();
        a3();
        a4();
        a5();
        a6();
    }

    public static void a1() {
        Random rand = new Random(77);
        int a, c, z;
        a = rand.nextInt(100) + 1;
        Utils.log("a: " + a);
        c = rand.nextInt(100) + 1;
        Utils.log("c: " + c);
        z = a + c;
        Utils.log("z: " + z);
    }

    public static void a2() {
        int a = 10;
        Utils.log("a++ : " + a++);// после вып.28 строки а=6,но печатаем a=5
        Utils.log("a++: " + a++);//после вып.29 строки а=7,но печатаем a=6
        Utils.log("++a : " + ++a);
        Utils.log("--a : " + --a);
    }

    public static void a3() {
        int a = 10;
        Utils.log(" : " + (--a + --a + a + a++ + a++ + a));// 52
        Utils.log(" : " + --a + --a + a + a++ + a++ + a); // 9888910
    }

    public static void a4() {
        int a = 3;
        var str = " " + a + (a++ - a) + ++a + (a++ + --a) + ++a + a;
        Utils.log(str);
    }

    public static void a5() {

        int a = 5;
        var str = " " + ++a + ++a + (++a + ++a) + (a + (a + a--)) + a;
        //               6     7     17           27                8
        System.out.println(str);
    }
        public static void a6() {
        var a = 10;
        var b = a;
        var str = "8" + --a + (++b * 2) + (b-- * 2) + a-- + (a - 1) + (--a - a--) + a + --b;
        //           8    9     22          22        9      7         0(-1)        6    9
        System.out.println(str);
    }
}
