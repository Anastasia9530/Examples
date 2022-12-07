package org.petrova.philosophyjava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task4_1 {
    public static void main(String[] args) {

        a1();
        a2();
    }

    static void a1() {
        Set<String> set = new HashSet<>();

        set.add("Anapa");
        set.add("Bryansk");
        set.add("Kazan");
        set.add("Kursk");
        set.add("Kursk");

        System.out.println(set);
    }

    static void a2() {

        Set<String> set = new LinkedHashSet<>();

        set.add("Beta");
        set.add("Al'fa");
        set.add("Gamma");
        set.add("Epsilon");
        set.add("Omega");

        System.out.println(set);
    }
}


