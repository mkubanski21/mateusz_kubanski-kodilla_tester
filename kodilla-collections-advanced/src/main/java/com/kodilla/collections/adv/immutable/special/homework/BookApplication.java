package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook("Lord of the Rings", "Tolkien");
        Book book2 = BookManager.createBook("Godfather", "Puzo");
        Book book3 = BookManager.createBook("Lord of the Rings", "Tolkien");
        System.out.println("----------");

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book1 == book2);
        System.out.println(book1 == book3);
    }
}
