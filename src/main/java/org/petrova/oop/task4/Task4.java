package org.petrova.oop.task4;

public class Task4 {
    public static void main(String[] args) {
        Person person = new Person("Петров Петр Петрович", 40);
        Person person1 = new Person();

        person.move("Валя");
        person1.talk("Оля");

        print(person);
        print(person1);
    }

    public static void print(Person person) {
        System.out.println("Полное имя: " + person.fullName);
        System.out.println("Возраст: " + person.age);
    }
}
