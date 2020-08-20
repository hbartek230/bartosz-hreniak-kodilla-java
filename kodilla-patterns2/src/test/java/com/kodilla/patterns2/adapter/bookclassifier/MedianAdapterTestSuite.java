package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        // given
        List<BookA> list = Arrays.asList(
                new BookA("author1", "title1", 1975, "1234"),
                new BookA("author1", "title1", 1968, "5678"),
                new BookA("author1", "title1", 2010, "8765"),
                new BookA("author1", "title1", 2000, "4321"),
                new BookA("author1", "title1", 1997, "0101"),
                new BookA("author1", "title1", 1990, "2323"),
                new BookA("author1", "title1", 1994, "4545"),
                new BookA("author1", "title1", 1960, "9876"));
        Set<BookA> bookASet = new HashSet<>(list);
        MedianAdapter adapter = new MedianAdapter();

        // when
        int medianPublicationYear = adapter.publicationYearMedian(bookASet);

        // then
        System.out.println(medianPublicationYear);
        assertEquals(1994, medianPublicationYear);
    }
}
