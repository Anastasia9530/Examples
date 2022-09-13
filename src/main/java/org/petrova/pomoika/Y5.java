package org.petrova.pomoika;

import org.petrova.common.Utils;
import org.petrova.javarush.Lecture4_6;

public class Y5 {
    public static void main(String[] args) {
        int count = 20;
        float[] array = new float[count];

        Utils.printArray(array);


        for (int a = 0; a < count; a++) {
            Utils.log("а= " + a);

            if (a >= 15)
                continue;


            if (a >= 5)
                array[a] = a;
        }
        Utils.printArray(array);
        Lecture4_6.a2();
    }
}
