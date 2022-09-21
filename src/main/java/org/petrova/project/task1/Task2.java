package org.petrova.project.task1;

import java.io.File;

public class Task2 {

    public static void main(String[] args) {
        File dir = new File("in.txt");// определяем объект для каталога??
        if ( dir.exists()) {// если объект представляет каталог
            for (File item : dir.listFiles()) { // получаем все вложенные объекты в каталоге

                if (item.isDirectory()) {

                    System.out.println(item.getName() + "  \t folder");//што это...
                } else {

                    System.out.println(item.getName() + "\t file");//и это..
                }
            }

        }
    }
}
