package org.petrova.philosophyjava;

import org.petrova.common.Utils;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        a1();
        a2();
        a3();
    }

    static void a1() {

        List<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(7);
        number.add(1);
        number.add(0);
        number.add(21);
        number.add(4);

        Iterator<Integer> it = number.iterator();
        while (it.hasNext()) {
            Number n = it.next();
            Utils.log(n + "");
        }
        Utils.log(it.hasNext() + "");
    }

    static void a2() {

        List<String> list = new ArrayList<>();

        list.add("knopka");
        list.add("belka");
        list.add("strelka");
        list.remove(2);
        list.add(1, "marusya");

        list.forEach(listList -> Utils.log(listList));

        list.forEach((e) -> {
            Utils.log(e);
        });

        Utils.log("" + list);

        list.removeAll(list);
        Utils.log("" + list);

    }

    static void a3() {

        Utils.log("Enter the numbers: ");
        Scanner in = new Scanner(System.in);
        Set<Integer> number = new HashSet<>();

        while (in.hasNextInt()) //цикл
        {
            int i = in.nextInt();
            number.add(i);
        }
        number.forEach(numberSet -> Utils.log(numberSet + ""));
    }
}

