package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import org.junit.jupiter.api.Test;
import com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.Book;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Author 1", "Title 1", 2010, "A1"));
        books.add(new Book("Author 2", "Title 2", 2000, "A2"));
        books.add(new Book("Author 3", "Title 3", 2000, "A3"));
        books.add(new Book("Author 4", "Title 4", 2015, "A4"));
        books.add(new Book("Author 5", "Title 5", 2020, "A5"));

        //when
        int median = new MedianAdapter().publicationYearMedian(books);

        //then
        assertEquals(2010, median);
    }

}
