package org.petrova.oop.task1;

import org.petrova.common.Utils;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        Utils.log("Введите возраст кота: ");
        int ageCat = console.nextInt();

        Animal dog1 = new DogKnopka();
        Animal wolf1 = new Wolf(" Порода 1", 15, 1, 40);
        Animal wolf2 = new Wolf(" Порода 2", 30, 5, 50);
        Animal cat1 = new Cat("Сфинкс", 7, ageCat);


        print(dog1);
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

        if (animal instanceof HomeAnimal) {
            HomeAnimal homeAnimal = (HomeAnimal) animal;

            System.out.println(" имя: " + homeAnimal.getName());
        }


        System.out.println();
    }
}
