package org.petrova.javarush;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Lecture13 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>(); //Создаем объект типа HashSet, который хранит элементы типа String.

        set.add("Привет"); //Заносим в set приветствия на разных языках.
        set.add("Hello");
        set.add("Hola");
        set.add("Bonjour");
        set.add("Cialo");
        set.add("Namaste");

        Scanner console = new Scanner(System.in); // вводим в консоль слово,
        String str = console.nextLine();

        if (set.contains(str))  // если это слово есть в нашем множестве приветствий, то прощаемся (по-белорусски).
            System.out.println("Да спаткання!");
        System.out.println();

        a1();
    }

    public static void a1() { //Вот как можно вывести на экран все элементы множества HashSet:
        HashSet<String> set = new HashSet<String>(); //Создаем объект типа HashSet, который хранит элементы типа String.

        set.add("Привет"); //Заносим в set приветствия на разных языках.
        set.add("Hello");
        set.add("Hola");
        set.add("Bonjour");
        set.add("Cialo");
        set.add("Namaste");

        Iterator<String> it = set.iterator(); //Получаем объект-итератор у множества set.
        while (it.hasNext()) { //Пока есть еще элементы
            String str = it.next(); //Получаем следующий элемент
            System.out.println(str); //Выводим элемент на экран
        }
    }
}