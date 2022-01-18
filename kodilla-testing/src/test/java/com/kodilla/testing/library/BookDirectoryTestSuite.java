package com.kodilla.testing.library;

import com.kodilla.testing.testing.library.Book;
import com.kodilla.testing.testing.library.BookLibrary;
import com.kodilla.testing.testing.library.LibraryDatabase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    LibraryDatabase libraryDatabaseMock;

    private List<Book> generateListOfNBooks(int booksQuantity){
        List<Book> resultList = new ArrayList<>();
        for(int n = 1; n <= booksQuantity; n++){
            resultList.add(new Book("Title "+n, "Author "+n, 1970));
        }
        return resultList;
    }

    @Test
    void testListBooksWithConditionsReturnList(){
        //given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);                   // [5]
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);    // [6]
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);    // [7]
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //when
        List<Book> listOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //then
        assertEquals(4, listOfBooks.size());
    }

    void testListBooksWithConditionsMoreThan20(){
        //given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        assertTrue(false);
    }

    void testListBooksWithConditionsFragmentShorterThan3(){
        assertTrue(false);
    }
}
