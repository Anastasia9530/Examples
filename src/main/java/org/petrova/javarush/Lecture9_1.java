package org.petrova.javarush;

import java.util.Scanner;
// Давайте напишем программу, которая преобразовывает путь к файлу из Unix Style в Windows Style.
// Unix в качестве разделителя директорий использует символ /, Windows — символ \.

public class Lecture9_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); // создаем объект типа сканер
        String path = console.nextLine(); // чтение строки с консоли

        char[] chars = path.toCharArray(); // преобразование строки в массив символов
        for (int i = 0; i < chars.length; i++) // цикл по символам
            if (chars[i] == '/') // если символ равен /
                chars[i] = '\\'; // заменить его на \\

        String result = new String(chars); // создаем новую строку на основе массива
        System.out.println(result); // выводим на экран
    }
}
