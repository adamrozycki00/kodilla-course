package com.kodilla.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //given
        Library library = new Library("Library 1");
        library.getBooks().add(new Book("Dylan Murphy", "Wolf of the mountain",
                LocalDate.of(2003, 7, 1)));
        library.getBooks().add(new Book("Phoebe Pearson", "Slaves of dreams",
                LocalDate.of(2012, 7, 1)));
        library.getBooks().add(new Book("Morgan Walsh", "Obliteration of heaven",
                LocalDate.of(2001, 7, 1)));
        library.getBooks().add(new Book("Aimee Murphy", "Rejecting the night",
                LocalDate.of(2015, 7, 1)));
        library.getBooks().add(new Book("Ryan Talley", "Gangsters and kings",
                LocalDate.of(2007, 7, 1)));
        library.getBooks().add(new Book("Madelynn Carson", "Unity without duty",
                LocalDate.of(2007, 7, 1)));
        library.getBooks().add(new Book("Giancarlo Guerrero", "Enemies of eternity",
                LocalDate.of(2009, 7, 1)));

        //when
        Library clonedLibrary = null;
        Library copiedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy("Library 2");
            copiedLibrary = library.deepCopy("Library 3");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        library.getBooks().removeIf(book -> book.getPublicationDate().getYear() < 2010);

        //then
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(7, copiedLibrary.getBooks().size());
    }

}
