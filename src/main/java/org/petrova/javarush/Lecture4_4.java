package org.petrova.javarush;

import java.util.Scanner;

public class Lecture4_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            String s = console.nextLine();// будет считывать ввод в консоли,пока не напишем exit
            if (s.equals("exit"))
                break;
        }
        a1();
    }

    public static void a1() {
        int i = 1;
        while (i <= 20) { // выводим на экран числа от 1 до 20
            if ((i % 7) == 0)//Если число делится на 7 (остаток от деления на 7 равен 0), вывод на экран пропускается
                continue; //завершает текущий виток цикла
            System.out.println(i);//код будет работать от 1 до 6, далее не выводится ничего
            i++;
        }
    }
}
