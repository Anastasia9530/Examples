package org.petrova.javarush;

public class Lecture12_4 {
    public static void main(String[] args) {
        Object[] objects = {10, "Привет", 3.14};//Autoboxing превратит эти значения в Integer, String и Double.

        for (int i = 0; i < objects.length; i++) { //Цикл по массиву объектов
            if (objects[i] instanceof String) { // Если объект имеет тип String
                String s = (String) objects[i]; //Сохраняем его в переменную типа String
                System.out.println(s); // Выводим переменную на экран.
            }
        }
    }
}