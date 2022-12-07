package org.petrova.philosophyjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4_0 {
    public static void main(String[] args) {
        a1();
        a2();
        a3();
    }

    public static void a1() {

        List<String> arrayList = new ArrayList<>();

        System.out.println("Start size arrayList: " + arrayList.size());

        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add("F");
        arrayList.add(1, "A2");
        arrayList.set(0, "C2");

        System.out.println("Size arrayList after adding: "
                + arrayList.size());
        System.out.println("Content arrayList: " + arrayList);
        System.out.println(arrayList.get(0));
    }

    public static void a2() {

        List<String> arrayList = new ArrayList<>();

        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("F");
        arrayList.add(1, "A2");
        arrayList.set(0, "C2");

        System.out.println("Content arrayList: " + arrayList);
        System.out.println("Size arrayList after adding: "
                + arrayList.size());

        arrayList.remove("F");
        arrayList.remove(2);

        System.out.println("Size arraList after removal: "
                + arrayList.size());
        System.out.println("Content of arrayList: " + arrayList);
    }

    public static void a3() {

        // Получение массива из ArrayList

        List<String> arrayList = List.of("C", "A", "E", "B", "D", "F");
        Object[] objectArray = arrayList.toArray();
        System.out.println(Arrays.toString(objectArray));
    }
}
