package com.library.management;

public class Book {
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public void issue() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
