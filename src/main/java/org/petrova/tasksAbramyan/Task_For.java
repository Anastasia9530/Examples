package org.petrova.tasksAbramyan;

import org.petrova.common.Utils;

public class Task_For {
    public static void main(String[] args) {

        //Даны целые числа N и K (K > 0). Вывести K раз число N.

        for (int k = 0; k < 7; k++) {
            System.out.println("1");
        }

        a1();
    }

    public static void a1() {

//        Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1,
//        2, …, 10 кг конфет.

        int kg = 1;
        for (double price = 1.1; price < 11; price++) {
            System.out.print("Цена " + kg++);
            System.out.print("kg конфет: " + price);
            Utils.log("");
        }
    }
}