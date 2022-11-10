package org.petrova.philosophyjava;

import org.petrova.common.Utils;

public class Array {
    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        Utils.log("" + array[1]);

        a1();
    }

    public static void a1() {

        int[][] matrice = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; i++) {

                Utils.log("" + matrice[2][2]);
                Utils.log("" + matrice[0][2]);
            }
        }
    }
}