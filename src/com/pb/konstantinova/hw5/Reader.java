package com.pb.konstantinova.hw5;

import java.util.Arrays;

public class Reader {
    private static int Readers = 0;
    private String fullName;
    private int ticketLibrary;
    private String faculty;
    private int phone;
    private int dateBirth;

    public void takeBook(int count){
        System.out.println(this.fullName + " взял(a) " + count + " книги");
    }
    public void takeBook(String... books){
        System.out.println(this.fullName + " взял(а) книги: " + Arrays.toString(books));
    }

    public void takeBook(Book... books){
        int i=0;
        System.out.print(this.fullName + " взял(а) книги: ");
        for(Book book:books){
            i++;
            System.out.print(book.getName() + " (" + book.getAuthor()+" " + book.getYear() + ".г)");
            if (books.length>i) System.out.print(", ");
        }
        System.out.println();
    }

    public void returnBook(int count){
        System.out.println(this.fullName + " вернул(а) " + count + " книги");
    }
    public void returnBook(String... books){
        System.out.println(this.fullName + " вернул(а) книги: " + Arrays.toString(books));
    }

    public void returnBook(Book... books){
        int i=0;
        System.out.print(this.fullName + " вернул(а) книги: ");
        for(Book book:books){
            i++;
            System.out.print(book.getName() + " (" + book.getAuthor()+" " + book.getYear() + ".г)");
            if (books.length>i) System.out.print(", ");
        }
        System.out.println();
    }


    public Reader(String fullName, int dateBirth,int phone,String faculty){
        this(fullName, dateBirth, phone);
        this.faculty= faculty;

    }

    public Reader(String fullName, int dateBirth,int phone){
        this(fullName, dateBirth);
        this.phone= phone;

    }
    public Reader(String fullName, int dateBirth) {
        this.fullName = fullName;
        this.dateBirth = dateBirth;
        this.faculty = "external";
        this.ticketLibrary = Readers++;
        this.phone= "noData";
    }


    public int getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getTicketLibrary() {
        return ticketLibrary;
    }
}
