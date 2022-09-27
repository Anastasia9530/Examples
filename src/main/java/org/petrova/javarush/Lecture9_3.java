package org.petrova.javarush;

import java.util.Arrays;
import java.util.Scanner;

public class Lecture9_3 { // Сравнение строк
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        if (path.endsWith(".jpg") || path.endsWith(".jpeg")) {
            System.out.println("Это Jpeg!");
        } else if (path.endsWith(".htm") || path.endsWith(".html")) {
            System.out.println("Это HTML-страница");
        } else if (path.endsWith(".doc") || path.endsWith(".docx")) {
            System.out.println("Это документ Word");
        } else {
            System.out.println("Неизвестный формат");
        }
        a1();
    }
    public static void a1(){
        String str = "Good news everyone!";
        String[] strings = str.split("ne");
        System.out.println(Arrays.toString(strings));
    }
}
