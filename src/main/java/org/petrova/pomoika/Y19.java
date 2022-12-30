package org.petrova.pomoika;

import org.petrova.common.Utils;

import java.util.*;

public class Y19 {
    public static void main(String[] args) {

        //    Необходимо найти все пары чисел из массива, сумма которых равна передаваемому числу (второму аргументу).
        //    И вернуть число, количество найденных разных решений.

        List<Integer> array = Arrays.asList(1, 2, 2, 3, 1, 3, 0, 8, 8, 4, 5, 6, 6);
        Set set = new HashSet(array);
        ArrayList<Integer> matrix = new ArrayList(set);
        int sum = 5;
        int count = 0;


        for (int i = 0; i < set.size(); i++) {
            for (int k = i + 1; k < set.size(); k++) {
                if (matrix.get(i) + matrix.get(k) == sum) {
                    count++;
                    Utils.log("" + matrix.get(i) + "+" + matrix.get(k));
                }
            }
        }
        Utils.log("" + count);
    }
}