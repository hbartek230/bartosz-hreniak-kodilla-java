package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    private Library library;

    @Before
    public void prepareToTest() {
        library = new Library("Town Library");
        IntStream.iterate(1, n -> n + 1)
                .limit(15)
                .forEach(n ->
                        library.getBooks().add(
                                new Book("Title" + n, "Author" + n, LocalDate.of(2020, 4, n)))
                );
    }

    @Test
    public void testGetBooks() throws Exception{
        // given

        Library clonedLibrary;
        clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("Cottage Library");

        Library deepClonedLibrary;
        deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName(" Village Library");

        // when
        library.getBooks().add(new Book("Own Title", "Own Author", LocalDate.now()));

        // then
        Assert.assertEquals(16, library.getBooks().size());
        Assert.assertEquals(16, clonedLibrary.getBooks().size());
        Assert.assertEquals(15, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks().size(), clonedLibrary.getBooks().size());
        Assert.assertNotEquals(library.getBooks().size(), deepClonedLibrary.getBooks().size());
    }
}
