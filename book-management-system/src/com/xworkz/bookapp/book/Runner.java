package com.xworkz.bookapp.book;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Main started");
        BookHouse bk = new BookHouse();
        bk.setBookId(101);
        bk.setBookName("Atomic Habit");
        bk.setAuthorName("James Clear");
        bk.setPrice(670.90);
        bk.setBookType(BookType.Fiction);
        Book b = new BookDetails();
        b.addBook(bk);
        BookHouse bk2 = new BookHouse();
        bk2.setBookId(103);
        bk2.setBookName("Ikigai");
        bk2.setAuthorName("Thomus");
        bk2.setPrice(570.90);
        bk2.setBookType(BookType.NonFiction);

        Book b1 = new BookDetails();
        b1.addBook(bk);
        b1.addBook(bk2);
        b1.getDetails();
        b1.getNameById(102);

        b1.updateBookNameAndAuthorNameById(101,"The scecret","Ramesh");
//        b1.getDetails();
        b1.deleteBookById(101);
        b1.getDetails();
        System.out.println("Main ended");
    }
}
