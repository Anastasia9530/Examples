package org.petrova.pomoika;

public class Y5 {
    public static void main(String[] args) {
        int count = 20;
        float[] array = new float[count];

        printArray(array);


        for (int a = 0; a < count; a++) {
            System.out.println("а= " + a);

            if (a >= 15)
                continue;


            if (a >= 5)
                array[a] = a;
        }
        printArray(array);

    }

    public static void printArray(float[] arrayForPrint) { //
        for (int i = 0; i < arrayForPrint.length; i++) {
            System.out.print(arrayForPrint[i] + " ");

            switch (i) {
                case 0:
                    System.out.print("Начало ");
                    break;
                case 1:
                    System.out.print("Продолжение ");
                    break;
                default:
                    System.out.print(",");
                    break;
            }

        }
        System.out.println();
    }
}
