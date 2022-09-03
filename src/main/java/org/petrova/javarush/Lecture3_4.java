package org.petrova.javarush;

public class Lecture3_4 {
    public static void main(String[] args) {
        int age = 25;
        int money;
        if (age > 30) // тут не совсем понятно. если возраст более 30, деняк 100, иначе деняк 50 ? не поняла
            money = 100;// с тернарным оператором стало понятнее
        else
            money = 50;
        a1();
        a2();
    }

    public static void a1() {
        int age = 25;
        int money = age > 30 ? 100 : 50; // при условии,что возраст больше 30 , 100 деняк, если ложно,то 50
    }

    public static void a2() {
        double a = 1.000001;
        double b = 1.000002;
        if (Math.abs(b - a) < 0.0001) // что тут происходит ? где посмотреть ответ вычисления модуля
            System.out.println("Числа равны");
        else
            System.out.println("Числа не равны");
    }
}