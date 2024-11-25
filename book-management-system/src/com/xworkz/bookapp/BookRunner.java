package com.xworkz.bookapp;

import com.xworkz.bookapp.book.Book;
import com.xworkz.bookapp.bookHouse.BookHouse;
import com.xworkz.bookapp.booktype.BookType;

public class BookRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        BookHouse bk = new BookHouse();
        bk.setBookId(101);
        bk.setBookName("Atomic Habit");
        bk.setAuthorName("James Clear");
        bk.setPrice(670.90);
        bk.setBookType(BookType.Fiction);
        Book b = new Book();
        b.addBook(bk);
        BookHouse bk2 = new BookHouse();
        bk2.setBookId(103);
        bk2.setBookName("Ikigai");
        bk2.setAuthorName("Thomus");
        bk2.setPrice(570.90);
        bk2.setBookType(BookType.NonFiction);

        BookHouse bk1 = new BookHouse();
        bk1.setBookId(102);
        bk1.setBookName("Death");
        bk1.setAuthorName("Sadhguru");
        bk1.setPrice(870.90);
        bk1.setBookType(BookType.NonFiction);
        Book b1 = new Book();
        b1.addBook(bk);
        b1.addBook(bk1);
        b1.getDetails();
        b1.getNameById(102);

        b1.updateBookNameAndAuthorNameById(101,"The scecret","Ramesh");
//        b1.getDetails();
        b1.deleteBookById(101);
        b1.getDetails();
        System.out.println("Main ended");
    }
}
