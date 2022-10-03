package org.petrova.javarush;

public class Lecture12 { // Получение значения типа int,которое хранится внутри объекта
    public static void main(String[] args) {
        Integer a = Integer.valueOf(5);
        int b = a.intValue();
        Integer c = b + 5;
        System.out.println(c);
    }
}
