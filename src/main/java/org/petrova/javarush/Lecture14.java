package org.petrova.javarush;

public class Lecture14 { // Перехват исключений try-catch
    public static void main(String[] args) {
        System.out.println("Адронный Коллайдер запущен");

        try {
            runCollayder(1);
            runCollayder(0);
        } catch (Exception e) {
            System.out.println("Ошибка! Перехвачено исключение");
            System.out.println("Планету засосало в черную дыру!");
        }

        System.out.println("Адронный Коллайдер остановлен");
    }

    public static void runCollayder(int n)  {
        System.out.println("Все отлично работает: " + n);
        System.out.println(2 / n);
        System.out.println("Никаких проблем нет: " + n);
    }
}

