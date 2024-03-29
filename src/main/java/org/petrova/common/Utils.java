package org.petrova.common;


import java.text.SimpleDateFormat;
import java.util.Date;

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
    }


    public static void printArray(int[][] arrayForPrint) {

        for (int y = 0; y < arrayForPrint[y].length; y++) {

            for (int x = 0; x < arrayForPrint.length; x++) {

                System.out.print(arrayForPrint[x][y] + " ");

            }
            Utils.log("");
        }
        Utils.log("");
    }

    public static void log2(String str) {

        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss.sss");
        System.out.println(formatter.format(date) + " [" + Thread.currentThread().getName() + "] " + str);

    }

    public static void print(Boolean b) {
        System.out.println(b);
    }
}

