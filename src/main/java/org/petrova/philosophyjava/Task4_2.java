package org.petrova.philosophyjava;

import org.petrova.common.Utils;

import java.util.*;

public class Task4_2 {
    public static void main(String[] args) {
        a1();
        a2();
        a3();
        a4();

    }

    public static void a1() {

        var listBooks = List.of(new Book("wertyui", 44), new Book("qwert", 77), new Book("qwert", 77));
        Utils.log(" " + listBooks);
    }

    public static void a2() {

        var setBooks = Set.of(new Book("wertyui", 44), new Book("qwtert", 77), new Book("qwert", 77));
        Utils.log(" " + setBooks);
    }

    public static void a3() {

        Set<Book> setBooks = new HashSet<>();

        setBooks.add(new Book("wertyui", 44));
        setBooks.add(new Book("wertyui", 44));
        setBooks.add(new Book("wertyui", 47));

        Utils.log("" + setBooks);
    }

    static class Book {
        String name;
        Integer pages;

        public Book(String name, Integer pages) {
            this.name = name;
            this.pages = pages;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return Objects.equals(name, book.name) && Objects.equals(pages, book.pages);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, pages);
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", pages=" + pages +
                    '}';
        }
    }

    public static void a4() {
        Random rand = new Random();
        Set<Integer> inset = new HashSet<>();


        for (int i = 0; i < 100; i++)
            inset.add(rand.nextInt(17));


        Utils.log(inset + " ");
    }
}