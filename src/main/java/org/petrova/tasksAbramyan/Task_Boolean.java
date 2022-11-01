package org.petrova.tasksAbramyan;

import java.util.Scanner;

public class Task_Boolean {
    public static void main(String[] args) {
        // 1.  Дано целое число A. Проверить истинность высказывания: «Число A является положительным».
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        boolean i = a > 0;
        System.out.println(i);

        a1();
        a2();
        a3();
    }

    public static void a1() {
        //Дано целое число A. Проверить истинность высказывания: «Число A является нечетным».
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        boolean b = a % 2 != 0;
        System.out.println(b);

    }

    public static void a2() {
        //Даны два целых числа: A, B. Проверить истинность высказывания: «Справедливы неравенства A > 2 и B ≤ 3».
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число А:");
        int a = scanner.nextInt();
        System.out.println("Введите число В:");
        int b = scanner.nextInt();

        boolean c = a > 2 & b <= 3;
        System.out.println(c);
    }

    public static void a3() {
        // Даны два целых числа: A, B. Проверить истинность высказывания:«Хотя бы одно из чисел A и B нечетное».
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число А:");
        int a = scanner.nextInt();
        System.out.println("Введите число В:");
        int b = scanner.nextInt();

        boolean c = (a % 2 != 0) | (b % 2 != 0);
        System.out.println(c);
    }
}
