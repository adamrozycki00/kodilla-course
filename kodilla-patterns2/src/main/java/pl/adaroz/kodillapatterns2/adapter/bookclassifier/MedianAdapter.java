package pl.adaroz.kodillapatterns2.adapter.bookclassifier;

import pl.adaroz.kodillapatterns2.adapter.bookclassifier.librarya.Book;
import pl.adaroz.kodillapatterns2.adapter.bookclassifier.librarya.Classifier;

import java.util.HashMap;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        HashMap<pl.adaroz.kodillapatterns2.adapter.bookclassifier.libraryb.BookSignature,
                pl.adaroz.kodillapatterns2.adapter.bookclassifier.libraryb.Book> bookBMap = new HashMap<>();
        for (Book book : bookSet) {
            bookBMap.put(
                    new pl.adaroz.kodillapatterns2.adapter.bookclassifier.libraryb.BookSignature(book.getSignature()),
                    new pl.adaroz.kodillapatterns2.adapter.bookclassifier.libraryb.Book(
                            book.getAuthor(),
                            book.getTitle(),
                            book.getPublicationYear()));
        }
        return medianPublicationYear(bookBMap);
    }

}
