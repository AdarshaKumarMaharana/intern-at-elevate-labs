package com.library.management;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int userId;
    private List<Book> issuedBooks;

    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
        this.issuedBooks = new ArrayList<>();
    }

    public void issueBook(Book book) {
        if (!book.isIssued()) {
            book.issue();
            issuedBooks.add(book);
            System.out.println(book.getTitle() + " issued to " + name);
        } else {
            System.out.println(book.getTitle() + " is already issued.");
        }
    }

    public void returnBook(Book book) {
        if (issuedBooks.contains(book)) {
            book.returnBook();
            issuedBooks.remove(book);
            System.out.println(book.getTitle() + " returned by " + name);
        } else {
            System.out.println(name + " doesn't have this book.");
        }
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    public List<Book> getIssuedBooks() {
        return issuedBooks;
    }
}
