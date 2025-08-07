package com.library.management;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create books
        Book book1 = new Book("Java Basics", "James Gosling");
        Book book2 = new Book("OOP Concepts", "Grady Booch");

        // Add books to library
        library.addBook(book1);
        library.addBook(book2);

        // Create users
        User user1 = new User("Adarsha", 101);
        User user2 = new User("Siya", 102);

        // Add users to library
        library.addUser(user1);
        library.addUser(user2);

        // Issue book
        library.issueBook("Java Basics", 101);
        library.issueBook("Java Basics", 102); // should show already issued

        // Return book
        library.returnBook("Java Basics", 101);
        library.issueBook("Java Basics", 102); // now it should work
    }
}
