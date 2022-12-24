package org.petrova.pomoika;

import org.petrova.common.Utils;

public class Y18 {
    public static void main(String[] args) {

        int[] array = new int[]{3, 4, 2, 7, 0};
        findSummands(array, 10);
    }

    public static int[] findSummands(int[] array, int sum) {

        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] + array[k] == sum) {
                    Utils.log(array[i] + " + " + array[k] + " =  " + sum);
                    return new int[]{array[i], array[k]};
                }
            }
        }
        return new int[]{};
    }
}

