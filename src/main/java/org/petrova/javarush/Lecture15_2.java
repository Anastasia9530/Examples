package org.petrova.javarush;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Lecture15_2 {
    public static void main(String[] args) {
        URL url = new URL("https://javarush.ru");
        InputStream input = url.openStream();
        byte[] buffer = input.readAllBytes();
        String str = new String(buffer);
        System.out.println(str);
    }
}
