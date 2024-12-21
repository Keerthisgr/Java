package com.xworkz.bookapp.book;

import com.xworkz.bookapp.book.exception.IdNotFoundException;


import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of books to be added");
        int size = scanner.nextInt();
        BookDetails bookDetails = new BookDetails(size);
      for(int start = 0; start < size; start++){
        BookHouse bookHouse = new BookHouse();
          System.out.println("Enter the Book Id");
          bookHouse.setBookId(scanner.nextInt());
          System.out.println("Enter a book name");
          scanner.nextLine();
          bookHouse.setBookName(scanner.nextLine());
          System.out.println("Enter author name");
          bookHouse.setAuthorName(scanner.nextLine());
          System.out.println("Enter price of the book");
          bookHouse.setPrice(scanner.nextDouble());
          System.out.println("Enter the type of a book");
          bookHouse.setBookType(BookType.valueOf(scanner.next().toUpperCase()));
        bookDetails.addBook(bookHouse);
      }

//      bookDetails.getDetails();

      String val = null;

      do{
          System.out.println("Press 1 to display all the details");
          System.out.println("Press 2 to display the book name based on Id");
          System.out.println("Press 3 to upadate an author name and book name by id");
          System.out.println("Press 4 to delete a book by providing it's Id");
          System.out.println("Enter your option");
          int option = scanner.nextInt();
          switch (option){
              case 1:
                  bookDetails.getDetails();
                  break;

              case 2:
                  try {
                  System.out.println("Enter book id");
                      BookHouse bookReturned = bookDetails.getNameById(scanner.nextInt());
                      System.out.println(bookReturned);
                  }catch(IdNotFoundException e){
                      e.printStackTrace();
                  }
                  break;

//              case 3:
//                  System.out.println("Enter book id and author name to be updated with book name also");
//                  boolean isUpdated = bookDetails.updateBookNameAndAuthorNameById(scanner.nextInt(), scanner.next(), scanner.next());
//                  System.out.println("Is values updated "+isUpdated);
//                  break;
              case 3:
                  System.out.println("Enter book id");
                  int id = scanner.nextInt();
                  System.out.println("Enter updated book name");
                  String updatedBookName = scanner.next();
                  System.out.println("Enter updated an author name");
                  String updatedAuthorName = scanner.next();
                  boolean isUpdated = bookDetails.updateBookNameAndAuthorNameById(id,updatedBookName,updatedAuthorName);
                  System.out.println("Is updated"+isUpdated);
                  break;

              case 4:
                  System.out.println("Enter book id");
                  boolean isBookDeleted = bookDetails.deleteBookById(scanner.nextInt());
                  System.out.println("Is deleted "+isBookDeleted);
                  break;

              default:
                  System.out.println("Invalid option! please enter correct option");
          }
          System.out.println("Do you want to continue? yes/no");
          val = scanner.next();
      }
      while(val.equalsIgnoreCase("yes"));
        System.out.println("Thak you!");
//        BookHouse bk = new BookHouse();
//        bk.setBookId(101);
//        bk.setBookName("Atomic Habit");
//        bk.setAuthorName("James Clear");
//        bk.setPrice(670.90);
//        bk.setBookType(BookType.Fiction);
//        Book b = new BookDetails();
//        b.addBook(bk);
//        BookHouse bk2 = new BookHouse();
//        bk2.setBookId(103);
//        bk2.setBookName("Ikigai");
//        bk2.setAuthorName("Thomus");
//        bk2.setPrice(570.90);
//        bk2.setBookType(BookType.NonFiction);

//        Book b1 = new BookDetails();
//        b1.addBook(bk);
//        b1.addBook(bk2);
//        b1.getDetails();
//        b1.getNameById(102);
//
//        b1.updateBookNameAndAuthorNameById(101,"The scecret","Ramesh");
////        b1.getDetails();
//        b1.deleteBookById(101);
//        b1.getDetails();
        System.out.println("Main ended");
    }
}
