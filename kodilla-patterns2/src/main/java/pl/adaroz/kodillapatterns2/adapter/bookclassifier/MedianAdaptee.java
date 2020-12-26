package pl.adaroz.kodillapatterns2.adapter.bookclassifier;

import pl.adaroz.kodillapatterns2.adapter.bookclassifier.libraryb.Book;
import pl.adaroz.kodillapatterns2.adapter.bookclassifier.libraryb.BookSignature;
import pl.adaroz.kodillapatterns2.adapter.bookclassifier.libraryb.BookStatistics;
import pl.adaroz.kodillapatterns2.adapter.bookclassifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        return new Statistics().averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        return new Statistics().medianPublicationYear(books);
    }
    
}
