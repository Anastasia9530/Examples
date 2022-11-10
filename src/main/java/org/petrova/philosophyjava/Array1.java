package org.petrova.philosophyjava;

import org.petrova.common.Utils;

public class Array1 {
    public static void main(String[] args) {

        // Создайте массив из всех нечётных чисел от 1 до 99,
        // выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку,
        //  но в обратном порядке (99 97 95 93 … 7 5 3 1).

        int[] matrix = new int[50];

        for (int i = 0, n = 1; i < matrix.length; i++, n = n + 2) {
            matrix[i] = n;
            Utils.print(" " + matrix[i]);

        }
        System.out.println(" ");

        for (int i = matrix.length - 1; i > 0; i--) {
            Utils.print(" " + matrix[i]);
        }
    }
}
