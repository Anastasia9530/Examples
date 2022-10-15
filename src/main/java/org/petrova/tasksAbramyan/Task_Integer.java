package org.petrova.tasksAbramyan;

import java.util.Scanner;

public class Task_Integer {
    public static void main(String[] args) {
        // Задача 1. Дано расстояние L в сантиметрах.
        // используя операцию деления нацело, найти количество полных метров в нем (1 метр = 100 см).
        Scanner in = new Scanner(System.in);
        System.out.println("L:");
        int l = in.nextInt();
        int m = l / 100;
        System.out.println("Количество полных метров: " + m);

        a2();
        a3();
        a4();
    }

    public static void a2() {
        // Задача 2. Дана масса M в килограммах. Используя операцию деления,
        //найти количество полных тонн в ней (1 тонна = 1000 кг).
        Scanner in = new Scanner(System.in);
        System.out.println("M: ");
        int m = in.nextInt();
        int t = m / 1000;
        System.out.println("Количество полных тонн:" + t);

    }

    public static void a3() {
        //Дан размер файла в байтах. Используя операцию деления нацело,
        // найти количество полных килобайтов, которые занимает данный файл
        //(1 килобайт = 1024 байта).
        Scanner in = new Scanner(System.in);
        System.out.println("Byte = ");
        int byte1 = in.nextInt();
        int kb = byte1 / 1024;
        System.out.println("Занимает килобайт: " + kb);
    }

    public static void a4() {
        // Даны целые положительные числа A и B (A > B). На отрезке длины A
        //размещено максимально возможное количество отрезков длины B (без наложений).
        // Используя операцию деления нацело, найти количество отрезков B, размещенных на отрезке A.
        Scanner in = new Scanner(System.in);
        System.out.println("длина A: ");
        int a = in.nextInt();
        System.out.println("длина B: ");
        int b = in.nextInt();
        if (a > b) {
            int ba = a / b;
            System.out.println("Количество отрезков:" + ba);
        } else {
            System.out.println("Длина А превышает длину В");
        }
    }
}

