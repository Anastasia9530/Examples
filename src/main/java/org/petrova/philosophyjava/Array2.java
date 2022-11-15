package org.petrova.philosophyjava;

import org.petrova.common.Utils;

public class Array2 {
    public static void main(String[] args) {

        // Создайте массив из 15 случайных целых чисел из отрезка [0;9].
        // Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов
        // и выведете это количество на экран на отдельной строке.

        int[] matrix = new int[15];

        int a = 0;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = (int) (Math.random() * 10);

            Utils.print(" " + matrix[i]);
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] % 2 == 0) {
                a++;
            }
        }
        Utils.log(" ");
        Utils.print(" " + a);
    }
}
