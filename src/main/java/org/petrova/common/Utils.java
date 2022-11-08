package org.petrova.common;


public class Utils {
    public static void log(String str) {
        System.out.println(str);
    }
    public static void print(String str) {
        System.out.print(str);
    }

    public static void printArray(float[] arrayForPrint) { //
        for (int i = 0; i < arrayForPrint.length; i++)
            System.out.print(arrayForPrint[i] + " ");

        Utils.log("");
        Utils.print(" ");
    }


    public static void printArray(int[][] arrayForPrint) {

        for (int y = 0; y < arrayForPrint[y].length; y++) {

            for (int x = 0; x <arrayForPrint.length; x++) {

                System.out.print(arrayForPrint[x][y]+" ");

            }
            Utils.log("");
        }
        Utils.log("");
    }
}
