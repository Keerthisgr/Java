package com.xworkz.bookapp.book;

import com.xworkz.bookapp.book.exception.IdNotFoundException;

public interface Book {
    public boolean addBook(BookHouse bookName);
    public void getDetails();
    public BookHouse getNameById(int id) throws IdNotFoundException;
    public boolean updateBookNameAndAuthorNameById(int id,String updatedBookName,String updatedAuthorName);
    public boolean deleteBookById( int id);

}
