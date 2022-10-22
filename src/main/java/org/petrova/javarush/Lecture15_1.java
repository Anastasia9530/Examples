package org.petrova.javarush;

import java.nio.file.Path;

public class Lecture15_1 {
    public static void main(String[] args) {
        // Метод getParent() возвращает путь, который указывает на родительскую директорию для текущего пути.
        // Независимо от того, был этот путь директорией или файлом.
        String str = "c:\\windows\\projects\\note.txt";
        Path path = Path.of(str).getParent();

        a1();
    }
    public static void a1(){
        // Метод getFileName() возвращает одно имя файла (или директории) — то, что идет после последнего разделителя
        String str = "c:\\windows\\projects\\note.txt";
        Path path = Path.of(str).getFileName();
    }
}
