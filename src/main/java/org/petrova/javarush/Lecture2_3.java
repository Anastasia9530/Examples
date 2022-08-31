package org.petrova.javarush;

import java.util.Scanner;

public class Lecture2_3 {
    public static void main(String[] args) {
        System.out.println("введите имя пользователя и возраст");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int age = console.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        b1();
    }

    public static void b1() {
        System.out.println("введите два числа");
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        System.out.println(a + b);
    }
}