package org.petrova.javarush;

import java.util.Scanner;

public class Lecture4_6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); //Создаем объект Scanner для чтения данных с консоли.
        int count = 0;//В переменной count будем хранить количество чисел.
        for (int i = 0; i < 10; i++)// цикл от 0 до 10
        {
            if (console.hasNextInt())//Если в консоли ввели число, то увеличиваем count на единицу.
                count++;
            console.nextLine();
        }
        System.out.println(count);//Выводим подсчитанную сумму на экран

        a1();
        a2();
    }

    public static void a1() {
        int f = 1; // тут храним произведение чисел
        for (int i = 1; i <= 10; i++) // цикл от 1 до 10
            f = f * i;// умножаем числа на f
        System.out.println(f);// выводим подсчитанную сумму
    }

    public static void a2() {
        for (int i = 0; i < 10; i++) { //Цикл по строкам (всего должно быть 10 строк).
            int starCount = 10 - i; //Вычисляем, сколько в строке должно быть звездочек
            for (int j = 0; j < starCount; j++) //Цикл по звездочкам
                System.out.print("*"); //выводим
            System.out.println();
        }
    }
}
