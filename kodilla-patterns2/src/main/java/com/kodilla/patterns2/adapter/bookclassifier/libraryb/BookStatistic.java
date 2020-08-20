package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

import java.util.Map;

public interface BookStatistic {
    int averagePublicationYear(Map<BookSignature, BookB> books);
    int medianPublicationYear(Map<BookSignature, BookB> books);
}
