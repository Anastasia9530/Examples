package org.petrova.stream;

import org.petrova.common.Utils;

import java.util.*;

public class trialStream1 {
    public static void main(String[] args) {

        a1();
        a2();
        a3();
    }

    public static void a1() {

        (new Random())
                .ints() // Возвращает практически неограниченный поток псевдослучайных значений типа int.
                .limit(10) // Возвращает кол-во элементов.
                .forEach(System.out::println); // Выполняет действие для каждого элемента этого потока.Это терминальная операция.
    }

    public static void a2() {
//        Для любого набора случайно-сгенерированных чисел нужно определить количество четных.

        List<Integer> list = Arrays.asList(1, 3, 2, 4, 5, 1, 2);

        list.stream().sorted()
                .filter(element -> element % 2 == 0)
                .forEach(System.out::println);
    }

    public static void a3() {
//        Задано множество фамилий сотрудников. Разработать программу, которая отображает все фамилии, начинающиеся на букву «К».

        Scanner scanner = new Scanner(System.in);
        String s;
        ArrayList<String> surname = new ArrayList<>();

        while (true) {
            Utils.log("enter last name: ");
            s = scanner.nextLine();
            if (s.isEmpty())
                break;
            surname.add(s);
        }
        Utils.log(surname + "");

        var result =
                surname.stream()
                        .filter(e -> e.startsWith("K"))
                        .toList();

        Utils.log("" + result);
    }
}