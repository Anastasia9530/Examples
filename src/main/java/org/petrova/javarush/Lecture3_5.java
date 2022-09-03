package org.petrova.javarush;

import java.util.Scanner;

public class Lecture3_5 {
    public static void main(String[] args) {
        String text = "10 20 40 80";
        Scanner console = new Scanner(text);
        int a = console.nextInt(); // эти данные должны выводится в консоль?
        int b = console.nextInt(); // и тут
        a1();
    }

    public static void a1(){
        String text = "Привет";
        String message = text;
        String s1 = text.toUpperCase();
        String s2 = text.toUpperCase();
        System.out.println(text == message); // истина
        System.out.println(text == s1); // ложь, тк Привет не равно
        System.out.println(s1 == s2);// ложь,тк Привет не равно
    }
}