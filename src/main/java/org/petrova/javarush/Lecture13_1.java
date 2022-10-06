package org.petrova.javarush;

import java.util.ArrayList;
import java.util.Iterator;

public class Lecture13_1 {
    public static void main(String[] args) { //цикл for-each  используют когда нужно обойти все элементы коллекции.

        ArrayList<String> list = new ArrayList<String>();
        for (String str : list) {
            System.out.println(str);
        }
    }
}
