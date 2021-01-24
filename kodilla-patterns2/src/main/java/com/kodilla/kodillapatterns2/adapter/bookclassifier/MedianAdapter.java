package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.Classifier;

import java.util.HashMap;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        HashMap<com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.BookSignature,
                com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.Book> bookBMap = new HashMap<>();
        for (Book book : bookSet) {
            bookBMap.put(
                    new com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.BookSignature(book.getSignature()),
                    new com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb.Book(
                            book.getAuthor(),
                            book.getTitle(),
                            book.getPublicationYear()));
        }
        return medianPublicationYear(bookBMap);
    }

}
