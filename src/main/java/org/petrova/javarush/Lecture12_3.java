package org.petrova.javarush;

import java.util.ArrayList;

public class Lecture12_3 { // Практические примеры работы со списком в Java
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // Создаем объект-список

        for (int i = 1; i <= 20; i++) //если число делится на 2 без остатка добавить его в список
            if (i % 2 == 0)
                list.add(i);

        for (int i = 0; i < list.size(); i++)  //цикл от нуля до размера списка
            System.out.println(list.get(i));  //выводим каждый элемент на экран

        a1();
        a2();
    }

    public static void a1() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= 20; i++)
            if (i % 2 == 0)  //если число делится на 2 без остатка, добавить его в список
                list.add(i);

        for (int i = 0; i < list.size(); i++)//цикл от нуля до размера списка
            if (list.get(i) % 4 == 0) {//если элемент списка делится на 4 без остатка
                list.remove(i); //удаляем элемент
                i--;//уменьшаем счетчик i, чтобы на следующем витке цикла опять попасть на тот же элемент
            }
    }

    public static void a2() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= 20; i++)//в списке 10 элементов: 2, 4, 6, ... 20
            if (i % 2 == 0)
                list.add(i);

        int n = list.size();
        list.remove(n - 3);//n - 3 = 7 (в списке осталось 9 элементов)
        list.remove(n - 2);//n - 2 = 8 (в списке осталось 8 элементов)
    }
    //После удаления 7 и 8 элементов, в списке останется всего 8 элементов.
    // Поэтому 9-й элемент удалить не получится — в программе возникнет ошибка.
}
