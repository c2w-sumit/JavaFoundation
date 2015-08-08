package com.clubs2win.c2wlibrary;

public class Book extends LibraryItem
{
    private String bookAuthor;
    private boolean isBookFiction;

    public String getBookAuthor() {
        return bookAuthor;
    }

    public boolean isBookFiction() {
        return isBookFiction;
    }

    public Book(String title, String author, boolean isFiction)
    {
        super(title);
        bookAuthor = author;
        isBookFiction = isFiction;
    }

    @Override
    public String toString()
    {
        return "Title = " +  this.getItemTitle() + " Author = " + bookAuthor +
                " isFiction  = " + isBookFiction + " IsAvailable = " + !this.isCheckedOut() + "\n\n";
    }

}
