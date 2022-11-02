package org.petrova.tasksAbramyan;

import java.util.Scanner;

public class Task_If {
    public static void main(String[] args) {
        //Дано целое число. Если оно является положительным, то прибавить к нему 1; в противном случае не изменять его. Вывести полученное число.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите К: ");
        int k = in.nextInt();
        if (k > 0) {
            int a = k + 1;
            System.out.println(a);
        } else {
            System.out.println(k);

        }
        a1();
        a2();
    }

    public static void a1() {
        // Даны два числа. Вывести большее из них
        Scanner in = new Scanner(System.in);
        System.out.println("Введите A: ");
        int a = in.nextInt();
        System.out.println("Введите B: ");
        int b = in.nextInt();
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static void a2() {
        //  Даны три числа. Найти сумму двух наибольших из них.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите A: ");
        int a = in.nextInt();
        System.out.println("Введите B: ");
        int b = in.nextInt();
        System.out.println("Введите C: ");
        int c = in.nextInt();
        if (b >= a & c >= a) {
            System.out.println(b + c);
        } else if (a >= b & c >= b) {
            System.out.println(a + c);
        } else {
            System.out.println(a + b);
        }
    }
}

