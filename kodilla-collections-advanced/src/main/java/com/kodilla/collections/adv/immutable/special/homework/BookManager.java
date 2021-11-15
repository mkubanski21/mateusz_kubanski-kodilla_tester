package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    static List<Book> listOfBooks = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);

        for (Book bookInSet : listOfBooks)
            if (book.getAuthor().equals(bookInSet.getAuthor()) && book.getTitle().equals(bookInSet.getTitle()))
                System.out.println("Book with the same title: " + book.getTitle() + ", and author: " + book.getAuthor() + " already exist");

        listOfBooks.add(book);
        return book;
    }
}

