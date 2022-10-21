package org.petrova.oop.task5;

public class Reader {
    private String fullName;
    private Integer numberTicket;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, Integer numberTicket, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.numberTicket = numberTicket;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }
    public Reader() {
    }



    void takeBook(Integer book) {
        System.out.println(this.fullName + " взял книги в колличестве " + book);
    }

    void takeBook(String nameBook) {
        System.out.println(this.fullName + " взял книги " + nameBook);
    }
}
