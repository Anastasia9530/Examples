package org.petrova.javarush;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Lecture16_3 {
    public static void main(String []args ){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM-dd-yyyy");
        String text = dtf.format( LocalDateTime.now() );
        System.out.println(text);

        a1();
        a2();
    }
    public static void a1(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM-dd-yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse("February-23-2019", dtf);
        System.out.println(date);
    }
    public static void a2(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.parse("23:59:59", dtf);
        System.out.println(time);
    }
}
