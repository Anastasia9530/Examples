package org.petrova.javarush;

import java.util.Scanner;

public class Lecture5_2 { //задача - найти мин элемент в массиве
    public static void main (String[]args){
        Scanner console = new Scanner(System.in);//создали объект консоль
        int[] array = new int[10];// создали объект массив из 10 чисел
        for (int i = 0; i < 10; i++) {//цикл от 0 до 9
            array[i] = console.nextInt(); //вводим числа в консолт
        }
        int min = array[0]; //ввели переменную мин,используем минимальное значение 0

        for (int i = 1; i < 10; i++) {//цикл от 1 до 10
            if (array[i] < min)//если текущий элемент массива меньше «найденного минимального числа»

                min = array[i];//то «обновить значение минимального числа»
        }
        System.out.println(min);
    }
}
