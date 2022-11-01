package org.petrova.project.task1;
//1. Сделать программу по подсчету и аналитике вводимых пользователем числовых данных. В программе нужно постараться задействовать операторы for, while, switch case, goto, return
// 1.1 Ввод числовых данных(целые числа) через консоль, до завершающего спец символа, пустой строки и т.д.
// 1.2 Аналитика выводится в консоль после ввода всех чисел
// 1.3 Данные аналитики: кол-во чисел, максимальное, минимальное, кол-во четных и нечетных, сумма четных и нечетных, общая сумма и произведение всех чисел

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {// задача 1

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\tmp\\in.txt");

        AbstractCalculation a;

        if (!file.exists()) {
            a = new CalculationVariant1();

        } else {
            a = new CalculationVariant2();
        }
        a.process();

        String dest = "C:\\tmp\\out.txt";
        String filePath = "C:\\tmp\\out.txt";
        File file1 = new File(filePath);
        BufferedWriter out = new BufferedWriter(new FileWriter(file1));
        for (int i = 0; i < 100; i++)
            out.write(i);
        out.close();

    }
}



