package org.petrova.javarush;

public class Lecture3_0 {
    public static void main(String[] args) {
        int age = 21;
        if (age < 18)
            System.out.println("Вы еще ребенок");
        else
            System.out.println("Вы уже взрослый");
        a1();
        a2();
        a3();
        a4();
    }

    public static void a1() {
        int temperature = 5;
        if (temperature < 0)
            System.out.println("На улице мороз");
        else
            System.out.println("Тепло");
    }

    public static void a2() {
        int age = 18;
        if (age == 18)
            System.out.println("Явитесь в военкомат");
        else
            System.out.println("Все равно явитесь");
    }

    public static void a3() {
        int age = 21;
        if (age < 18) {
            System.out.println("Ты еще ребенок");
            System.out.println("Не спорь со взрослыми");
        } else {
            System.out.println("Вы уже взрослый");
            System.out.println("Ну и молодежь пошла");
        }
    }

    public static void a4() {
        int temperature = 5;
        if (temperature < 0) {
            System.out.println("На улице мороз");
            System.out.println("Шапку надень");
        } else
            System.out.println("Тепло");
    }
}