package org.petrova.tasksAbramyan;

import org.petrova.common.Utils;

public class Task_For {
    public static void main(String[] args) {

        a0(4, 10);
        a1(7.8);
    }

    public static void a0(int N, int K) {

        // Даны целые числа N и K (K > 0). Вывести K раз число N.

        for (int i = 0; i < K; i++) {
            System.out.print(N);
        }
        Utils.log("");
    }


    public static void a1(double price) {

        // Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1,
        // 2, …, 10 кг конфет.

        for (int kg = 1; kg < 11; kg++) {
            System.out.print("Цена " + kg + "кг конфет: " + price * kg);
            Utils.log("");
        }
    }
}