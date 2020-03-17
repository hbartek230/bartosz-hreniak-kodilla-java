package com.kodilla.testing.library;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    LibraryDatabase libraryDatabaseMock;
    BookLibrary bookLibrary;
    LibraryUser user;

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Before
    public void makeBefore(){
        libraryDatabaseMock = mock(LibraryDatabase.class);
        bookLibrary = new BookLibrary(libraryDatabaseMock);
        user = new LibraryUser("Bartosz", "Hreniak", "5608");
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        // given
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // when
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // then
        int expected = 4;
        assertEquals(expected, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // given
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // when
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        // then
        int expectedListOfBook0 = 0;
        int expectedListOfBook15 = 15;
        int expectedListOfBook40 = 0;
        assertEquals(expectedListOfBook0, theListOfBooks0.size());
        assertEquals(expectedListOfBook15, theListOfBooks15.size());
        assertEquals(expectedListOfBook40, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // given
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // when
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // ten
        int expectedListOfBook10 = 0;
        assertEquals(expectedListOfBook10, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOfWith0Books(){
        // given
        List<Book> listOf0Books = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(listOf0Books);

        // when
        List<Book> result = bookLibrary.listBooksInHandsOf(user);

        // then
        assertEquals(listOf0Books, result);
    }

    @Test
    public void testListBooksInHandsOfWith1Book(){
        // given
        List<Book> listOf1Book = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(listOf1Book);

        // when
        List<Book> result = bookLibrary.listBooksInHandsOf(user);

        // then
        assertEquals(listOf1Book, result);
    }

    @Test
    public void testListBooksInHandsOfWith5Books(){
        // given
        List<Book> listOf5Books = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(listOf5Books);

        // when
        List<Book> result = bookLibrary.listBooksInHandsOf(user);

        // then
        assertEquals(listOf5Books, result);
    }
}
