package org.petrova.philosophyjava;

public class Task3_0 {
    public class Class{}

    public static void main(String[] args) {

        // Прямое создание объекта внутреннего класса с синтаксисом new

       Task3_0 n = new Task3_0();
       Task3_0.Class n1= n.new Class();

        a1();
    }

    public static void a1() {
        for (int i = 0; i < 9; i++) {
            new Task3(i);
        }
    }
}