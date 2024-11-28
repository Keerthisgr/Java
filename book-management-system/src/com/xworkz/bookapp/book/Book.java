package com.xworkz.bookapp.book;

public interface Book {
    public boolean addBook(BookHouse bookName);
    public void getDetails();
    public BookHouse getNameById(int id);
    public boolean updateBookNameAndAuthorNameById(int id,String updatedBookName,String updatedAuthorName);
    public boolean deleteBookById( int id);

}
