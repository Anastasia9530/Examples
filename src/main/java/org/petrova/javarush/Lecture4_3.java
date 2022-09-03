package org.petrova.javarush;

public class Lecture4_3 {
    public static void main(String[] args) {//мы хотим написать программу, которая бы выводила на экран 4 раза слово Мама
        int n = 0; // на экран выведется 4 раза "Мама"
        while (n < 4) {
            System.out.println("Мама");
            n++;
        }
        a1();
        System.out.println(" ");
        System.out.println(" ");// как сделать 2 отсупа? нашла в инете какой-то padding,пробовала применить, не удалось
        a2();
    }

    public static void a1() {
        int n = 0;
        while (n < 5) {
            System.out.print("A");
            n++;
        }
    }

    //ЗАДАЧА.хотим вывести на экран прямоугольник из букв А размером в 4 строки и 5 столбцов
    public static void a2() { // СЛОЖНАААААААААААААААААА
        int n = 0;
        while (n < 4) { // количество витков цикла

            int m = 0;

            while (m < 5) { // количество витков внутреннего цикла
                System.out.print("А");
                m++;
            }

            System.out.println();

            n++;

        }
    }
}
