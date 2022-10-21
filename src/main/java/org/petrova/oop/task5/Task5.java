package org.petrova.oop.task5;


public class Task5 {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.И.", 2, "Экономика", "10.10.1999", "1234");
        Reader reader2 = new Reader("Сидоров А.О.", 1, "Управление", "30.09.1997", "1239");
        Reader reader3 = new Reader("Кузнецов И.Е.", 3, "Экономика", "22.01.1993", "1456");
        Reader[] readers = {reader1, reader2, reader3};


        Book book1 = new Book("Конфликтология", "Тучкин В.В.");
        Book book2 = new Book("История России", "Киселев В.В.");
        Book book3 = new Book("Задачи","Абрамов С.С.");
        Book[] books = {book1, book2, book3};

        reader1.takeBook(1);
        reader2.takeBook(5);
        reader3.takeBook("Литература");
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getName());

        }
        System.out.println();

    }
}
