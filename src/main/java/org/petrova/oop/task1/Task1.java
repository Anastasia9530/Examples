package org.petrova.oop.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Animal dog1 = new DogKnopka();
        Animal wolf1 = new Wolf(" Порода 1", 15, 1, 40);
        Animal wolf2 = new Wolf(" Порода 2", 30, 5, 50);
        Animal cat1 = new Cat("Сфинкс",7,4);

        print(dog1);
        print(wolf2);
        print(wolf1);
        print(cat1);
    }

    public static void print(Animal animal) {

        System.out.println("Наличие хозяина: " + animal.hasOwner());
        System.out.println("Возраст: " + animal.getAge());
        System.out.println("Порода:" + animal.getBreed());
        System.out.println("Вес:" + animal.getWeight());
        System.out.println("Цена:" + animal.getPrice());
        System.out.println();
    }
}
