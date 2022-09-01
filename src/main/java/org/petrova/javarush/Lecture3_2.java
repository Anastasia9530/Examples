package org.petrova.javarush;

import java.util.Scanner;

public class Lecture3_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);  // создаем объект Scanner
        int a = console.nextInt();  // читаем с клавиатуры первое число
        int b = console.nextInt();  // читаем с клавиатуры второе число
        if (a < b)                   // если a меньше b
            System.out.println(a);     // выводим на экран a
        else                         // иначе
            System.out.println(b);     // выводим на экран b
    }
}
