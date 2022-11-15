package org.petrova.philosophyjava;

import org.petrova.common.Utils;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (i == 99) break;
            Utils.log(i + " ");

            a1();
        }
    }

    public static void a1() {

        // Бесконечный цикл

        for (int i = 0; i < i + 1; i++) {
            Utils.log(i + " ");
        }
    }
}
