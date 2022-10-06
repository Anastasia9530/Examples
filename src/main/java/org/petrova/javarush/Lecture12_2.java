package org.petrova.javarush;

import java.util.ArrayList;
import java.util.Scanner;

public class Lecture12_2 { // Работа с  Array
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // ввод строк с клавиатуры
        String[] list = new String[10];

        for (int i = 0; i < list.length; i++) {
            String s = console.nextLine();
            list[i] = s;
        }
// вывод содержимого массива на экран
        for (int i = 0; i < list.length; i++) {
            int j = list.length - i - 1;
            System.out.println(list[j]);

            a1();
        }
    }

    public static void a1() { //Работа с ArrayList
        Scanner console = new Scanner(System.in);

// ввод строк с клавиатуры
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            String s = console.nextLine();
            list.add(s);
        }
// вывод содержимого коллекции на экран
        for (int i = 0; i < list.size(); i++) {
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }
    }
}
