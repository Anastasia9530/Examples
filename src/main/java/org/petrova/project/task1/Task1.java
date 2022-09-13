package org.petrova.project.task1;
//1. Сделать программу по подсчету и аналитике вводимых пользователем числовых данных. В программе нужно постараться задействовать операторы for, while, switch case, goto, return
// 1.1 Ввод числовых данных(целые числа) через консоль, до завершающего спец символа, пустой строки и т.д.
// 1.2 Аналитика выводится в консоль после ввода всех чисел
// 1.3 Данные аналитики: кол-во чисел, максимальное, минимальное, кол-во четных и нечетных, сумма четных и нечетных, общая сумма и произведение всех чисел

import java.io.File;
import java.util.Scanner;

public class Task1 {// задача 1

    public static void main(String[] args) {
        log("Введите числа");
        Scanner console = new Scanner(System.in);// создали объект сканер
        int sum = 0; // создаем переменную где храним сумму
        int count = 0; //! храним кол-во чисел
        int max = Integer.MIN_VALUE; // максимально число введенное пользовательем
        int min = Integer.MAX_VALUE; // минимальное число введенное пользователем
        int even = 0;// кол-во четных чисел
        int odd = 0;// кол-во нечетных
        int result = 1;  // храним произведение чисел
        int sum1 = 0; // храним сумму четных и нечетных
        int sumeven = 0; // сумма всех четных
        int sumodd = 0;// сумма всех нечетных
        while (console.hasNextInt()) //цикл
        {
            int x = console.nextInt();// переменная х - выводим в консоль,пользователь вводит числа
            sum = sum + x;
            count++;
            if (x > max)
                max = x;
            if (x < min)
                min = x;
            if (x % 2 == 0)//чтобы узнать, что число четное, делим на 2. сравниваем.Остаток ноль
                even++;// повторяем виток цикла
            else // если делим на 2 с остатком, то
                odd++; // считаем виток цикла нечетных чисел
            result *= x;//считаем произведение введенных чисел
            sum1 = even + odd;
            sumeven = sumeven + even;
            sumodd = sumodd + odd;


        }
        log("Выводим сумму: " + sum);//выводим сумму чисел
        log("Выводим количество чисел введенных пользователем: " + count);
        log("Максимальное число введенное пользователем: " + max);
        log("Минимальное число введенное пользователем: " + min);
        log("Количество четных чисел: " + even);
        log("Количество нечетных чисел: " + odd);
        log("Произведение введенных чисел: " + result);
        log("Сумма четных и нечетных чисел,которые вывел пользователь: " + sum1);
        log("Сумма четных чисел: " + sumeven);
        log("Сумма нечетных чисел: " + sumodd);

    }

    public static void log(String message) {
        System.out.println(message);
    }

}