package org.petrova.oop.task3;

public class Task3 {
    public static void main(String[] args) {

        Phone phone1 = new Phone(8888888, "Samsung", 100);
        Phone phone2 = new Phone(9999992, "Nokia");
        Phone phone3 = new Phone();

        phone1.receiveCall("Мама");
        phone2.receiveCall("Мама");

        print(phone1);
        print(phone2);
        print(phone3);
    }

    public static void print(Phone phone) {

        System.out.println("Номер телефона: " + phone.getNumber());
        System.out.println("Модель телефона: " + phone.model);
        System.out.println("Вес телефона:" + phone.weight);

    }
}
