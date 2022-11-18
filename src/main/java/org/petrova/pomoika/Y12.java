package org.petrova.pomoika;

import org.petrova.common.Utils;

import java.util.Random;
import java.util.Scanner;

public class Y12 {
    public static void main(String[] args) {

        double x = 7.5;
        var a = x * 2;
        var b = x * 3;

        Utils.log(" " + b);
        Utils.log(" " + a);

        a1();
        a2();
        a3();
        a4();
    }

    public static void a1() {

        Scanner in = new Scanner(System.in);
        Utils.log("Введите число");
        int x = in.nextInt();

        Utils.log(" " + (x * 10));
    }

    public static void a2() {

        Scanner in = new Scanner(System.in);
        Utils.log("Введите число ");
        int x = in.nextInt();

        if (x > 0) {
            Utils.log("" + (x * 2));
        } else if (x < 0) {
            Utils.log("Число отрицательное");
        }
    }

    public static void a3() {

        Scanner in = new Scanner(System.in);
        Utils.log("Введите число X и Y");
        int x = in.nextInt();
        int y = in.nextInt();

        Utils.print(x == y);
    }

    public static void a4() {

        var a = Math.random();

        Utils.print("" + a);
    }
}
