package org.petrova.javarush;

import java.util.Scanner;

public class Lecture3_6 {
    public static void main(String[] args) {
        String s1 = "Да";
        String s2 = "ДА";
        String s3 = s1.toUpperCase();

        System.out.println(s1.equals(s2)); // ложь
        System.out.println(s1.equals(s3)); // ложь
        System.out.println(s2.equals(s3)); // истина, хотя разные адреса?
        a1();
        a2();
    }

    public static void a1() {
        String s1 = "Да";
        String s2 = "ДА";
        String s3 = s1.toUpperCase();

        System.out.println(s1.equalsIgnoreCase(s2));// истина
        System.out.println(s1.equalsIgnoreCase(s3));//истина
        System.out.println(s2.equalsIgnoreCase(s3));//истина. при каких обстоятельствах можно это использовать ?
    }

    public static void a2() { //нужно ввести с клавиатуры две строки и определить, одинаковые они, или нет
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        String b = console.nextLine();
        String result = a.equals(b) ? "Одинаковые" : "Разные";//сравнивает  строки
        System.out.println(result);
    }
}
