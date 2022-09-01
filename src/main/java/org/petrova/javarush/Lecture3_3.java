package org.petrova.javarush;

public class Lecture3_3 {
    public static void main(String[] args) {
        int age = 35;
        if (age >= 18 && age <= 65)
            System.out.println("Вы можете работать");
        a1();
        a2();
    }

    public static void a1() {
        int age = 35;

        boolean isYoung = (age < 18);// 35 меньше 18 - ложь
        if (!isYoung && age <= 65)// если (НЕ меньше 18?  И меньше равно 65), то можете работать
            System.out.println("Вы можете работать");
    }

    public static void a2() {
        int age = 35;
        boolean isYoung = (age < 18);// 35 меньше 18 - ложь
        boolean isOld = (age > 65);// 35 больше 65 - ложь
        if (!isYoung && !isOld) // если (НЕ ложное? __ И  НЕ __ ложное? ) ,то можно работать
            System.out.println("Вы можете работать");
    }
}
