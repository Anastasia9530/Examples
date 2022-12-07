package org.petrova.philosophyjava;

import org.petrova.common.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Task4 {
    public static void main(String[] args) {

        a1();
        a2();
    }

    public static void a1() {

        Collection<Integer> c = new LinkedList<>();
        for (int i = 0; i < 10; i++)
            c.add(i); // Автоматическая упаковка
        for (Integer i : c)
            Utils.log(i + " ");
    }

    public static void a2() {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {1, 2, 3, 4, 5};
        collection.addAll(Arrays.asList(moreInts));
        Utils.log("" + collection);
    }
}
