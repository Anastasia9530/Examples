package org.petrova.javarush;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Lecture16_2 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Сейчас = " + time);

        a1();
    }

    public static void a1() {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime current = LocalDateTime.of(date, time);
        System.out.println("Сейчас = " + current);

        LocalDateTime date1 = LocalDateTime.of(2019, 4, 15, 12, 15, 01);
        System.out.println("Сейчас = " + date1);
    }
}
