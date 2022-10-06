package org.petrova.javarush;

import java.util.ArrayList;
import java.util.Collections;

public class Lecture13_2 { //Метод addAll() добавляет в коллекцию colls элементы e1, e2, e3
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

        for (int i : list)
            System.out.println(i);

        a1();
        a2();
        a3();
        a4();
        a5();
    }

    public static void a1() { // Метод fill() заменяет все элементы коллекции list на элемент obj.
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        Collections.fill(list, 10);

        for (int i : list)
            System.out.println(i);
    }

    public static void a2() { // Метод replaceAll() заменяет все элементы коллекции list, равные oldValue, на элемент newValue
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        Collections.replaceAll(list, 2, 20);

        for (int i : list)
            System.out.println(i);
    }

    public static void a3() { // Метод copy() копирует все элементы коллекции src в коллекцию dest.
        ArrayList<Integer> srcList = new ArrayList<Integer>(); //  //Если изначально коллекция dest длиннее чем коллекция src, то оставшиеся элементы в коллекции dest останутся нетронутыми.
        Collections.addAll(srcList, 99, 98, 97);

        ArrayList<Integer> destList = new ArrayList<Integer>();
        Collections.addAll(destList, 1, 2, 3, 4, 5, 6, 7);

        Collections.copy(destList, srcList);

        for (int i : destList)
            System.out.println(i);
    }

    public static void a4() { // Метод reverse() меняет порядок переданных в него элементов списка на обратный.
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

        Collections.reverse(list);

        for (int i : list)
            System.out.println(i);
    }

    public static void a5() { // Метод sort() сортирует переданный в него список по возрастанию.
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 11, 2, 23, 4, 15);

        Collections.sort(list);

        for (int i : list)
            System.out.println(i);
    }
}