package org.petrova.javarush;

import java.util.Scanner;

public class Lecture5_1 {
    public static void main(String[] args) {
        int[] array = new int[10];// создаем объект массив на 10 элементов
        for (int i = 0; i < 10; i++) { // цикл от 0 до 9
            array[i] = i; // в ячейки вносим значения от 0 до 9
            a1();
            a2();
            a3();
        }
    }

    public static void a1() {
        int[] array = new int[10];// создаем объект-массив на 10 элементов
        for (int i = 0; i < 10; i++) {// цикл от 0 до 9
            array[i] = i + 1;// в ячейки вносим значения от 1 до 10
        }
    }

    public static void a2() {//нужно ввести с клавиатуры 10 чисел и вывести их в обратном порядке.
        Scanner console = new Scanner(System.in);// создали объект сканер
        int[] array = new int[10];// создаем объект массив на 10 элементов
        for (int i = 0; i < 10; i++) { // цикл от 0 до 9
            array[i] = console.nextInt();//Читаем число с клавиатуры и сохраняем его в очередную ячейку массива
        }
        for (int i = 9; i >= 0; i--) {//цикл от 9 до 0
            System.out.println(array[i]); //выводим ячейку массива
        }
    }

    public static void a3() { // массив STRING
        Scanner console = new Scanner(System.in); // создаем сканер
        String[] array = new String[10];// создаем массив на 10 объектов
        for (int i = 0; i < 10; i++) // цикл от 0 до 9
        {
            array[i] = console.nextLine(); // консоль для ввода с клавиатуры
        }
        for (int i = 9; i >= 0; i--) // цикл от 9 до 9
        {
            System.out.println(array[i]);
        }
    }
}
