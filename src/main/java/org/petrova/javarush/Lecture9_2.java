package org.petrova.javarush;

import java.util.Scanner;

public class Lecture9_2 { //использование метода replace

        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            String path = console.nextLine();

            String result = path.replace('/', '\\');

            System.out.println(result);
        }
}
