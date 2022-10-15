package org.petrova.tasksAbramyan;

import java.util.Scanner;

public class Task_Integer1 {
    public static void main(String[] args) {
        //Дано двузначное число. Вывести вначале его левую цифру (десятки),а затем — его правую цифру (единицы).
        //Для нахождения десятков использовать операцию деления нацело, для нахождения единиц — операцию
        //взятия остатка от деления.
        Scanner in = new Scanner(System.in);

        System.out.println("Введите двузначное число:");
        int number = in.nextInt();
        int n1 = number / 10;
        int n2 = number % 10;

        System.out.println("Левая цифра: " + n1);
        System.out.println("Правая цифра: " + n2);

        a1();
        a2();
        a3();
        //a4();
    }

    public static void a1() {
        //Дано двузначное число. Найти сумму и произведение его цифр
        Scanner in = new Scanner(System.in);

        System.out.println("Введите двузначное число:");
        int number = in.nextInt();
        int n1 = number / 10;
        int n2 = number % 10;
        System.out.println("Левая цифра: " + n1);
        System.out.println("Правая цифра: " + n2);

        int sum = n1 + n2;
        int multiplication = n1 * n2;
        System.out.println("Сумма " + sum);
        System.out.println("Произведение: " + multiplication);
    }

    public static void a2() {
// Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа.
        Scanner in = new Scanner(System.in);

        System.out.println("Введите двузначное число:");
        int number = in.nextInt();
        int n1 = number / 10;
        int n2 = number - 10 * n1;
        System.out.println("Левая цифра: " + n1);
        System.out.println("Правая цифра: " + n2);
        int result = n2 * 10 + n1;
        System.out.println("Число с перестановкой цифр:" + result);
    }

    public static void a3() {
        // Дано целое число, большее 999. Используя одну операцию деления
        // нацело и одну операцию взятия остатка от деления, найти цифру, соответствующую разряду сотен в записи этого числа.


    }
}
