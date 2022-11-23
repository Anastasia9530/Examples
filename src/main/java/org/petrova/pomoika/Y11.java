package org.petrova.pomoika;

import org.petrova.common.Utils;

import java.util.Scanner;

public class Y11 {
    public static void main(String[] args) {

        int a = 3;
        int b = 10;

        for (int i = 0; i < a; i++) {
            Utils.print("" + b);

        }
        a1(1, 2);
        a2();
        a3();
        a4();
    }

    public static void a1(int start, int finish) {

        var i = start;
        var sum = 0; //

        while (i <= finish) {
            sum = sum + i;
            i = i + 1;

        }

        Utils.log("");
    }

    public static void a2() {

        Scanner in = new Scanner(System.in);

        Utils.log("Введите число: ");
        int number = in.nextInt();

        if (number < 10 && number >= 0) {
            Utils.log("Положительное число от 0 до 10");
        } else if (number > 10) {
            Utils.log("Положительно число больше 10");
        } else if (number < 0) {
            Utils.log("Отрицательное число");
        }
    }

    public static void a3() {

        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        switch (day) {

            case 1:
                Utils.print("Понедельник");
                break;
            case 2:
                Utils.print("Вторник");
                break;
            case 3:
                Utils.print("Среда");
                break;
            case 4:
                Utils.print("Четверг");
                break;
            case 5:
                Utils.print("Пятница");
                break;
            case 6, 7:
                Utils.print("Выходной");
                break;

        }
    }

    public static void a4() {

        int i = 0;

        while (i < 10) {
            i++;
            Utils.print("Task" + i);

        }
    }
}

