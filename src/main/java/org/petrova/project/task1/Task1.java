package org.petrova.project.task1;
//1. Сделать программу по подсчету и аналитике вводимых пользователем числовых данных. В программе нужно постараться задействовать операторы for, while, switch case, goto, return
// 1.1 Ввод числовых данных(целые числа) через консоль, до завершающего спец символа, пустой строки и т.д.
// 1.2 Аналитика выводится в консоль после ввода всех чисел
// 1.3 Данные аналитики: кол-во чисел, максимальное, минимальное, кол-во четных и нечетных, сумма четных и нечетных, общая сумма и произведение всех чисел

import java.io.File;

public class Task1 {// задача 1

    public static void main(String[] args) {
        File file = new File("C:\\tmp\\in.txt");

        AbstractCalculation a;

        if (!file.exists()) {
            a = new CalculationVariant1();

        } else {
            a = new CalculationVariant2();
        }
        a.process();
    }
}



