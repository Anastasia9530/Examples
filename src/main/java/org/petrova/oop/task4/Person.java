package org.petrova.oop.task4;

public class Person {
    String fullName;
    Integer age;

    Person(String n, Integer a) {
        fullName = n;
        age = a;
    }

    Person() {
    }

    void move(String name) {
        System.out.println("Говорит " + name);
    }

    void talk(String name1) {
        System.out.println("Говорит " + name1);
    }
}


