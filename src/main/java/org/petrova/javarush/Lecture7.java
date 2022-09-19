package org.petrova.javarush;

public class Lecture7 {
    public static void fill(String[] array, String value) { //Метод fill заполняет переданный массив array переданным значением valuе
        for (int i = 0; i < array.length; i++)
            array[i] = value;
    }

    public static void main(String[] args) {
        String[] data = new String[10];
        fill(data, "Hello");
    }
}

