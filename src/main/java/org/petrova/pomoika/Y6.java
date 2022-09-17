package org.petrova.pomoika;

/*
0 1 2 3 4
1 2 3 4 5
2 3 4 5 6

matrix[0][0]=0
matrix[1][0]=1
matrix[2][0]=2
 */

import org.petrova.common.Utils;

public class Y6 {
    private static final int X = 5;//строка
    private static final int Y = 3;// столбик

    public static void main(String[] args) {
        int[][] matrix = new int[X][Y];
        Utils.printArray(matrix);
        for (int y = 0; y < Y; y++) {
            for (int x = 0; x < matrix.length; x++) {

                matrix[x][y] = x + y;

            }
// тут закончили печатать первую строку

        }

        Utils.printArray(matrix);
    }
}

