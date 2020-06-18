package com.kodilla.stream.book;

public final class Book {

    private final String title;
    private final String author;
    private final int yearOfPublication;
    private final String signature;

    public Book(final String author, final String title,
                final int yearOfPublication, final String signature) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.signature = signature;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", signature='" + signature + '\'' +
                '}';
    }

}
