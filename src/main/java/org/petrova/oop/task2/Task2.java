package org.petrova.oop.task2;

public class Task2 {
    public static void main(String[] args) {
        Human male1 = new Male("Анатолий", 32, 70, 170);
        Human male2 = new Male("Анатолий", 39, 70, 170);
        Human male3 = male1;


        Human female1 = new Female("Анатолий", 33, 70, 170);


        boolean b = male1.equals(female1);
        System.out.println(b);
    }
}
