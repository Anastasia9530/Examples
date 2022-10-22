package org.petrova.javarush;

import java.time.LocalDate;
import java.time.ZoneId;

public class Lecture16_1 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("Сегодня = " + today);

        a1();
        a2();
    }

    public static void a1() {
        ZoneId timezone = ZoneId.of("Asia/Shanghai");
        LocalDate today = LocalDate.now(timezone);
        System.out.println("Сейчас в Шанхае = " + today);
    }

    public static void a2() {
        LocalDate today = LocalDate.now();
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());
    }
}
