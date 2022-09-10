package org.petrova.javarush;

import java.io.FileInputStream;// задача не работаеет!!!!!!!!!!!!!!!!
import java.io.FileOutputStream;
import java.io.IOException;

public class Lecture10 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("c:\\in.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("c:\\out.txt");

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
