package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype<Library> {

    private String name;

    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return clone();
    }

    public Library shallowCopy(final String name) throws CloneNotSupportedException {
        Library library = clone();
        library.setName(name);
        return library;
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library library = clone();
        library.setBooks(new HashSet<>());
        for (Book book : books)
            library.getBooks().add(new Book(book.getTitle(), book.getAuthor(), book.getPublicationDate()));
        return library;
    }

    public Library deepCopy(final String name) throws CloneNotSupportedException {
        Library library = deepCopy();
        library.setName(name);
        return library;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

}
