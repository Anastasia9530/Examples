package org.petrova.javarush;

import java.util.Scanner;

public class Lecture4_1_1 {
    public static void(String[] args) {
        Scanner console = new Scanner(System.in);// вызываем консоль для ввода
        boolean isExit = false; // тип данных , который принимает 2 значения \ ложь/ истина.
        while (!isExit) { // цикл повторяется пока переменная не будет истина
            String s = console.nextLine(); // можно писать в консоль
            isExit = s.equals("exit"); // сравнение строк
        }
    }
