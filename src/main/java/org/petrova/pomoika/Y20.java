package org.petrova.pomoika;

import org.petrova.common.Utils;

import java.util.ArrayList;
import java.util.Arrays;

public class Y20 {

//    На вход получаем массив чисел и число.
//    Необходимо найти все пары чисел из массива, сумма которых равна передаваемому числу (второму аргументу).
//    И вернуть число, количество найденных разных решений.
//    Реализация через тесты.

    public static void main(String[] args) {

        int[] matrix = new int[]{1, 7, 2, 3, 7, 5, 1, 3, 9};

        sumNumbers3(matrix, 8);
    }

    public static int sumNumbers(int[] matrix, int sum) {

        int count = 0;
        Integer tmp = null;

        Arrays.sort(matrix);

        for (int i = 0; i < matrix.length; i++) {
            if ((tmp != null) && (tmp.equals((matrix[i]))))
                continue;
            for (int k = i + 1; k < matrix.length; k++) {
                if (matrix[i] + matrix[k] == sum) {
                    count++;
                    tmp = matrix[i];

                    Utils.log("Пара чисел:" + matrix[i] + "," + matrix[k]);
                    break;
                }
            }
        }
        Utils.log("" + count);
        return count;
    }

    public static int sumNumbers2(int[] matrix, int sum) {

        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(matrix);

        for (int i = 0; i < matrix.length; i++) {
            if (list.contains(matrix[i]))
                continue;
            for (int k = i + 1; k < matrix.length; k++) {
                if (matrix[i] + matrix[k] == sum) {
                    count++;
                    list.add(matrix[i]);

                    Utils.log("Пара чисел:" + matrix[i] + "," + matrix[k]);
                    break;
                }
            }
        }
        Utils.log("" + count);
        return count;
    }

    public static int sumNumbers3(int[] matrix, int sum) {
        
        Arrays.sort(matrix);

        int first = 0;
        int last = matrix.length - 1;
        int count = 0; // кол-во пар
        int tmp = 0;

        while (first < last) {

            if (matrix[first] + matrix[last] == sum) {
                tmp = matrix[first];
                Utils.log("Пары чисел:" + matrix[first] + "," + matrix[last]);

                count++;
                first++;
                last--;

                if (matrix[first] == tmp) {
                    first++;
                    last--;
                }

            } else {
                if (matrix[first] + matrix[last] > sum)
                    last--;
                else first++;
            }
        }
        Utils.log("" + count);
        return count;
    }
}



