package org.petrova.project.task1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

    public static void main(String[] args) throws IOException { // что-то не так
        String src = "c:\\in.txt";
        String dest = "c:\\out.txt";

        try(FileReader reader = new FileReader(src); // для чтения из файла
            FileWriter writer = new FileWriter(dest)) // для записи в файл
        {
            char[] buffer = new char[65536]; // 128Kb Буфер, в который будем считывать данные
            while (reader.ready()) // Пока данные есть в потоке
            {
                int real = reader.read(buffer); // Читаем данные в буфер
                writer.write(buffer, 0, real); // Записываем данные из буфера во второй поток
            }
        }
    }
}
