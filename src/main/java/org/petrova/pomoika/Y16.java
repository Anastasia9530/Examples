package org.petrova.pomoika;

import org.petrova.common.Utils;

import java.util.Scanner;

public class Y16 {
    public static void main(String[] args) {

        a1();
        a2();
        a3();
        a4();
        a5();
        a6();
        a7();

    }

    public static void a1() {

        for (int i = 1; i <= 5; i++) {
            Utils.print("" + i);
        }
    }

    public static void a2() {

        for (int i = 1; i <= 10; i++) {
            Utils.log("3*" + i + "=" + i * 3);
        }
    }

    public static void a3() {

        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }

    public static void a4() {

        int p = 0;
        while (p <= 10) {
            if (p == 4) {

                Utils.log("Нашли!");
                break;
            }
            p++;
        }
    }

    public static void a5() {

        String[] weeks = new String[7];

        weeks[0] = "Monday";
        weeks[1] = "Tuesday";
        weeks[2] = "Wednesday";
        weeks[3] = "Thursday";
        weeks[4] = "Friday";
        weeks[5] = "Saturday";
        weeks[6] = "Sunday";

        Utils.log(" " + weeks[1]);
    }

    public static void a6() {

        double[] numbers = new double[]{1.3, 0.1, 0.3, 1.9};

//        numbers[0] = 1.3;
//        numbers[1] = 0.4;
//        numbers[2] = 2.1;
//        numbers[3] = 0.9;

        for (double i = 0; i < 4; i++) {
            Utils.log("" + numbers[(int) i]);
        }

        Utils.log(" " + numbers[3]);
    }

    public static void a7() {

        char symbol = 'a';
        String[][] matrix = new String[3][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = symbol + "" + (k + 1);
                System.out.print("" + matrix[i][k] + " ");

            }
            symbol++;
            System.out.println("");
        }
    }
}

