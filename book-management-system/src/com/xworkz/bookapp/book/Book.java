package com.xworkz.bookapp.book;

import com.xworkz.bookapp.bookHouse.BookHouse;

import java.util.Arrays;

public class Book {
    BookHouse books[] = new BookHouse[2];
    int index;

    public boolean addBook(BookHouse bookName){
        boolean isBookAdded = false;
        if(index < this.books.length){
            this.books[index++] = bookName;
            isBookAdded = true;
        }
        else{
            System.out.println("Maximum length is reached!!..");
        }
        return isBookAdded;
    }
    public void getDetails(){
        for(BookHouse book : books){
            if(book!=null){
                System.out.println("Book id: "+book.getBookId());
                System.out.println("Book name: "+book.getBookName());
                System.out.println("Author name: "+book.getAuthorName());
                System.out.println("Price: "+book.getPrice());
                System.out.println("Book Type: "+book.getBookType());
                System.out.println("********************************");
            }
        }
    }
    public BookHouse getNameById(int id){
        BookHouse bookId = null;
        System.out.println("Name by id method is invoked");
        for(BookHouse book:books){
            if(book.getBookId()==id){
                bookId=book;
                System.out.println("Name: "+book.getBookName());
                System.out.println("********************************");
            }
        }
        if(bookId==null)
            System.out.println("Id not found");
        return bookId;
    }
    public boolean updateBookNameAndAuthorNameById(int id,String updatedBookName,String updatedAuthorName){

        boolean isUpdated = false;
        for(BookHouse refer : books){
            if(refer.getBookId()==id){
                refer.setBookName(updatedBookName);
                refer.setAuthorName(updatedAuthorName);
                isUpdated=true;

            }
        }
        if(isUpdated==false)
            System.out.println("No updation");
        return  isUpdated;


    }
    public boolean deleteBookById( int id){
        boolean isBookDeleted = false;
        int i = 0;
        for (int start = 0; start < this.books.length; start++) {
            if (books[start].getBookId() != id) {
                books[i++] = books[start];
            } else {
                isBookDeleted = true;
            }
        }
        int size = i;
        books = Arrays.copyOf(books, i);
        return isBookDeleted;
    }


}
