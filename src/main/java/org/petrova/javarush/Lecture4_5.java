package org.petrova.javarush;

import java.util.Scanner;

public class Lecture4_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0; // переменная суммы
        while (console.hasNextInt()) //цикл
        {
            int x = console.nextInt();// переменная х - выводим в консоль
            sum = sum + x;
        }
        System.out.println(sum); // выводим сумму на экран
        a1();
    }// все равно нихера не поняла. нужно просто запомнить структуру написания кода? типо запомнить что умеет цикл?

    public static void a1() {
        Scanner console = new Scanner(System.in); // создаем объект сканер
        int max = 0; // тут храним максимум чисел
        while (console.hasNextInt()) { // цикл работает пока вводим число
            int x = console.nextInt(); //считываем число в переменную х
            if (x > max) //сравниваем. если х больше максимального числа
                max = x;// то выводим максимум
        }// тут не поняла..ввожу числа ии..что
        System.out.println(max);
    }
}
