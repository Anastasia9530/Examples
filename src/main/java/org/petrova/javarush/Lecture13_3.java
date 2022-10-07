package org.petrova.javarush;

import java.util.HashMap;

public class Lecture13_3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Серега", 21);
        map.put("Николай", 22);
        map.put("Петрович", 48);
        map.put("Анюта", null);

        for (String key : map.keySet()) // Цикл по всем ключам map
        {
            Integer value = map.get(key); // Получаем значение по ключу
            System.out.println(key + " --> " + value);


        }
    }
}
