package org.petrova.tasksAbramyan;

import org.petrova.common.Utils;

import java.util.Scanner;

public class Task_Case {
    public static void main(String[] args) {

        // Дано целое число в диапазоне 1–7.
        // Вывести строку — название дня недели, соответствующее данному числу (1 — «понедельник», 2 — «вторник» и т. д.).

        Scanner in = new Scanner(System.in);
        Utils.log("Введите число: ");
        int day = in.nextInt();

        switch (day) {
            case 1:
                Utils.log("Понедельник");
                break;
            case 2:
                Utils.log("Вторник");
                break;
            case 3:
                Utils.log("Среда");
                break;
            case 4:
                Utils.log("Четверг");
                break;
            case 5:
                Utils.log("Пятница");
                break;
            case 6:
                Utils.log("Суббота");
                break;
            case 7:
                Utils.log("Воскресенье");
            default:
                Utils.log("Введите число от 1 до 7");
        }
        a1();
        a2();
        a3();
    }

    public static void a1() {

        // Дано целое число K. Вывести строку-описание оценки, соответствующей числу K (1 — «плохо», 2 — «неудовлетворительно», 3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»).
        // Если K не лежит в диапазоне
        // 1–5, то вывести строку «ошибка».

        Scanner in = new Scanner(System.in);
        Utils.log("Введите число: ");
        int grade = in.nextInt();

        switch (grade) {
            case 1:
                Utils.log("Плохо");
                break;
            case 2:
                Utils.log("Неудовлетворительно");
                break;
            case 3:
                Utils.log("Удовлетворительно");
                break;
            case 4:
                Utils.log("Хорошо");
                break;
            case 5:
                Utils.log("Отлично");
                break;
            default:
                Utils.log("Ошибка");
        }
    }

    public static void a2() {

        // Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 —
        // февраль и т. д.). Вывести название соответствующего времени года («зима», «весна», «лето», «осень»).

        Scanner in = new Scanner(System.in);
        Utils.log("Введите число от 1 до 12: ");
        int season = in.nextInt();

        switch (season) {
            case 12:
            case 1:
            case 2:
                Utils.log("Зима");
                break;
            case 3:
            case 4:
            case 5:
                Utils.log("Весна");
                break;
            case 6:
            case 7:
            case 8:
                Utils.log("Лето");
                break;
            case 9:
            case 10:
            case 11:
                Utils.log("Осень");
                break;
            default:
                Utils.log("Ошибка");
        }
    }

    public static void a3() {

        // Дано целое число в диапазоне 100–999. Вывести строку-описание
        // данного числа, например: 256 — «двести пятьдесят шесть», 814 — «восемьсот четырнадцать».

        Scanner in = new Scanner(System.in);
        Utils.log("Введите число в диапазоне от 100 до 999: ");
        int number = in.nextInt();
        int number1 = number / 100;

        switch (number1) {
            case 1:
                Utils.log("сто");
                break;
            case 2:
                Utils.log("двести");
                break;
            case 3:
                Utils.log("триста");
                break;
            case 4:
                Utils.log("четыреста");
                break;
            case 5:
                Utils.log("пятьсот");
                break;
            case 6:
                Utils.log("шестьсот");
                break;
            case 7:
                Utils.log("семьсот");
                break;
            case 8:
                Utils.log("восемьсот");
                break;
            case 9:
                Utils.log("девятьсот");
                break;
        }
//        int number2 = (number-100*number1)/10; //256-100*number1/10
        int number2 = number % 100 / 10;
        switch (number2) {
            case 1: {
                int number3 = number % 10;
                switch (number3) {
                    case 0:
                        Utils.log("десять");
                        break;
                    case 1:
                        Utils.log("одинадцать");
                        break;
                    case 2:
                        Utils.log("двенадцать");
                        break;
                    case 3:
                        Utils.log("тринадцать");
                        break;
                    case 4:
                        Utils.log("четырнадцать");
                        break;
                    case 5:
                        Utils.log("пятнадцать");
                        break;
                    case 6:
                        Utils.log("шестнадцать");
                        break;
                    case 7:
                        Utils.log("семнадцать");
                        break;
                    case 8:
                        Utils.log("восемнадцать");
                        break;
                    case 9:
                        Utils.log("девятнадцать");
                        break;
                }
            }
        }
        int number3 = number % 10;
        switch (number3) {

            case 1:
                Utils.log("один");
                break;
            case 2:
                Utils.log("два");
                break;
            case 3:
                Utils.log("три");
                break;
            case 4:
                Utils.log("четыре");
                break;
            case 5:
                Utils.log("пять");
                break;
            case 6:
                Utils.log("шесть");
                break;
            case 7:
                Utils.log("семь");
                break;
            case 8:
                Utils.log("восемь");
                break;
            case 9:
                Utils.log("девять");
                break;
        }
    }
}

