package com.clubs2win.c2wlibrary;


import java.util.ArrayList;

public class LibrarySystem {

    private  ArrayList libraryCatalog;
    private static LibrarySystem  theLibrarySystem;

    public ArrayList getLibraryCatalog() {
        return libraryCatalog;
    }




   public static LibrarySystem getInstance()
   {
       if (theLibrarySystem == null)
       {
           theLibrarySystem = new LibrarySystem();
       }
       return theLibrarySystem;
   }




    public  LibrarySystem()
    {
        libraryCatalog = new ArrayList();

        // Add Books
        Book book1 = new Book("Harry Potter and the Sorcerers Stone","J.K. Rowling",true);
        libraryCatalog.add(book1);
        Book book2 = new Book("The Maze Runner","Jamews Dashner",true);
        libraryCatalog.add(book2);
        Book book3 = new Book("Mr. Mercedes","Stephen King",true);
        libraryCatalog.add(book3);
        Book book4 = new Book("Davinci Code","Dan Brown",true);
        libraryCatalog.add(book4);
        Book book5 = new Book("Creativity Inc","Edwin Catmull",false);
        libraryCatalog.add(book5);
        Book book6 = new Book("The Second Machine Age","Andre McAfee",false);
        libraryCatalog.add(book6);
        Video video1 = new Video("Divergent","Shailene Woodley","Neil Burger",VideoCategory.MOVIE);
        libraryCatalog.add(video1);
        Video video2 = new Video("Gandhi","Ben Kinsley","Richard Attenborough",VideoCategory.DOCUMENTARY);
        libraryCatalog.add(video2);
        Video video3 = new Video("Hotel Rwanda","Don Cheadle","Terry George",VideoCategory.DOCUMENTARY);
        libraryCatalog.add(video3);
        Video video4 = new Video("Jessie","Debby Ryan","Pamela Eells",VideoCategory.SHOW);
        libraryCatalog.add(video4);
        Video video5 = new Video("Good luck Charlie","Bridget Mendler","Phil Baker",VideoCategory.SHOW);
        libraryCatalog.add(video5);
        Video video6 = new Video("The Hunger Games","Jennifer Lawrence","Gary Ross",VideoCategory.MOVIE);
        libraryCatalog.add(video6);
    }
}
