package org.petrova.javarush;

import java.util.Scanner;

public class Lecture4_1 {
    public static void main(String[] args) {
        int n = 5; // на экран будут выведены 5 строк
        while (n > 0) // до тех пор, пока н будет больше 0
        {
            System.out.println(n);
            n--; // оператор уменьшения на единицу
            a1();//почему выводит 5 0 1 2 3 4 5 ? верно : 5 4 3 2 1
            a2();
            a3();
        }
    }

    public static void a1() {
        int n = 0;
        while (n < 10) { //будут выведены 10 строк
            System.out.println(n);
            n++; // оператор увеличения на единицу
        }// тут верно 0 1 2 3 4 5 6 7 8 9 , но выводит не то
    }

    public static void a2() {
        Scanner console = new Scanner(System.in); // Программа считывает с клавиатуры числа до тех пор, пока вводят именно числа.
        while (console.hasNextInt()) { // условие
            int x = console.nextInt();//команда
        } // когда ввожу букву, начинается повторение чисел 0 -10 ?? не понятно
    }

    public static void a3() {
        while (true) // условие  - истина
            System.out.println("C"); // бесконечно выводим С
    }
}
