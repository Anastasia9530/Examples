package org.petrova.javarush;

public class Lecture5 {
    public static void main(String[] args) {
        int[] array;// объявили переменную-массив типа int
        int a = 15; // самозванная переменная , которой в задаче не было.я ее сама объявила хаха

        if (a < 10) // если a меньше 10, то
            array = new int[10]; // то создаем массив из 10 элементов
        else // иначе
            array = new int[20]; // создаем массив из 20 элементов

        for (int i = 0; i < array.length; i++) // цикл - переменная i=0, условие i меньше длинны массива? шаг цикла i+1
        {
            System.out.println(array[i]); // почему в решении задачи вот так: Цикл по всем элементам массива: от 0 и до длины array.length — 1
        } // не поняла эту задачу
    }

}
