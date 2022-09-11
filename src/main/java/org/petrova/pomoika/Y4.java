package org.petrova.pomoika;

import java.util.Scanner;

public class Y4 {
    public static void main(String[] args) { // оператор свитч
        String answer;
        boolean exit;
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        Scanner inputAnswer = new Scanner(System.in);

        exit = false;
        for (int i = 1; i <= 3; i++) {
            if (exit == true)
                break;
            answer = inputAnswer.next();
            switch (answer) {
                case ("Троллейбус"):
                    System.out.println("Правильно!");
                    exit = true;
                    break;
                case ("Сдаюсь"):
                    System.out.println("Правильный ответ: троллейбус.");
                    exit = true;
                    break;
                default:
                    System.out.println("Подумай еще.");
                    a1();
            }
        }
    }

    public static void a1() {
        for (int i = 0; i < 100; i++) { //оператор break
            if (i == 4) {
                break; // завершить цикл, если i = 4
            }
            System.out.println("i: " + i);
        }
        System.out.println("Цикл завершен.");
    }
}