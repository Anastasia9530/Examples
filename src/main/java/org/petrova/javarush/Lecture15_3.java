package org.petrova.javarush;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class Lecture15_3 {
    public static void main (String []args){
        URL url = new URL("https://javarush.ru");
        URLConnection connection = url.openConnection();

// получили поток для отправки данных
        OutputStream output = connection.getOutputStream();
        output.write(1); // отправляем данные

// получили поток для чтения данных
        InputStream input = connection.getInputStream();
        int data = input.read(); // читаем данные
    }
}
