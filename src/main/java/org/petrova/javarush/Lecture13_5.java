package org.petrova.javarush;

public class Lecture13_5 { // Действие по умолчанию: default
    public static void main(String[] args) {
        int temperature = 40;
        switch (temperature) {
            case 36:
                System.out.println("Низкая");
                break;
            case 37:
                System.out.println("Нормальная");
                break;
            case 38:
                System.out.println("Высокая");
                break;
            default:
                System.out.println("Нужна скорая");
        }
    }
}