package org.petrova.common;

public class Utils {
    public static void log(String str) {
        System.out.println(str);
    }

    public static void printArray(float[] arrayForPrint) { //
        for (int i = 0; i < arrayForPrint.length; i++)
            System.out.print(arrayForPrint[i] + " ");

        Utils.log("");
    }
}

