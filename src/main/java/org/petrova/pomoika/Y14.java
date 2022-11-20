package org.petrova.pomoika;

import org.petrova.common.Utils;

import java.util.Scanner;

public class Y14 {
    public static void main(String[] args) {

        // Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.

        try {

            Scanner in = new Scanner(System.in);
            Utils.log("Введите число: ");
            int number = in.nextInt();
            Utils.log(""+number);

        } catch (Exception e) {
            Utils.log("Указатель не может указывать на null!");
        }
    }
}
