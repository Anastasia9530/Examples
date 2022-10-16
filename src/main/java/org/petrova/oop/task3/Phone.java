package org.petrova.oop.task3;

public class Phone {
    Integer number;
    String model;
    Integer weight;

    Phone(Integer n, String m, Integer w) {
        number = n;
        model = m;
        weight = w;
    }

    Phone(Integer n, String m) {
        number = n;
        model = m;
    }

    Phone() {

    }

    void receiveCall(String name) {
        System.out.println("Звонит" + name);
    }

    Integer getNumber() {
        return number;
    }
}


