package org.petrova.philosophyjava;

import org.petrova.common.Utils;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        for (int number = 1; number < 101; number++) {
            Utils.log(" " + number);

            a1();
        }
    }

    public static void a1() {

        int[] array = new Random().ints(25, 0, 25).toArray();
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println(array[i] + " > " + array[i + 1]);
            } else if (array[i] < array[i + 1]) {
                System.out.println(array[i] + " < " + array[i + 1]);
            } else {
                System.out.println(array[i] + " == " + array[i + 1]);
            }
        }
    }
}