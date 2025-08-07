package com.library.management;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println(user.getName() + " registered to the library.");
    }

    public Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public User findUserById(int userId) {
        for (User u : users) {
            if (u.getUserId() == userId) {
                return u;
            }
        }
        return null;
    }

    public void issueBook(String title, int userId) {
        Book book = findBookByTitle(title);
        User user = findUserById(userId);

        if (book != null && user != null) {
            user.issueBook(book);
        } else {
            System.out.println("Book or User not found.");
        }
    }

    public void returnBook(String title, int userId) {
        Book book = findBookByTitle(title);
        User user = findUserById(userId);

        if (book != null && user != null) {
            user.returnBook(book);
        } else {
            System.out.println("Book or User not found.");
        }
    }
}
