package org.petrova.pomoika;

import java.util.*;
import java.util.stream.Collectors;

public class Y9 {
    public static void main(String[] args) { // Работа с потоком и преобразование результата работы в список
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");

        List<String> result = list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());

        a1();
        a2();
        a3();
    }

    public static void a1 (){ // Работа с потоком и преобразование результата работы во множество
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");

        Set<String> result = list.stream()
                .filter( s -> Character.isUpperCase(s.charAt(0)) )
                .collect( Collectors.toSet() );
    }

    public static void a2(){ // Преобразование потока в мэп
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "a=2", "b=3", "c=4", "d==3");

        Map<String, String> result = list.stream()
                .map( e -> e.split("=") )
                .filter( e -> e.length == 2 )
                .collect( Collectors.toMap(e -> e[0], e -> e[1]) );
    }

    public static void a3(){ // Преобразование потока в строку
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "a=2", "b=3", "c=4", "d==3");
        String result = list.stream().collect( Collectors.joining(", ") );
    }
}
