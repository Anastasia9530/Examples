package org.petrova.pomoika;

import java.util.Arrays;
import java.util.List;

public class Y21 {
    public static void main(String[] args) {

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                .filter(s -> s.startsWith("a")) // отфильтровать значения
                .map(String::toUpperCase) // преобразовать все значения, перевести в верхний регистр
                .sorted() // отсортировать по порядку (дефолтный порядо)
                .forEach(System.out::println); // вывести каждый элемент на экран
    }
}
