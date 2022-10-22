package org.petrova.javarush;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Lecture16 {
    public static void main (String []args){
        Date current = new Date();
        System.out.println(current);

        a1();
        a2();
        a3();
    }
    public static void a1(){
        Date current = new Date(95, 10, 30, 4,13,2);
        System.out.println(current);
    }

    public static void a2(){
        Date current = new Date(105, 5, 4, 12, 15, 0);
        System.out.println(current.getYear());
        System.out.println(current.getMonth());
        System.out.println(current.getDate());
        System.out.println(current.getDay());
    }

    public static void a3(){
        Date current = new Date(105, 5, 4, 12, 15, 0);
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-YYYY");
        String message = formatter.format(current);
        System.out.println(message);
    }
}
