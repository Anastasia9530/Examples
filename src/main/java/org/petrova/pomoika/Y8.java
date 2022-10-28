package org.petrova.pomoika;

import java.util.ArrayList;
import java.util.Collections;

public class Y8 {
    public static void main (String []args){ // Лямбда-выражения
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Привет", "как", "дела?");

        list.forEach( (s) -> System.out.println(s) );
    }
}
