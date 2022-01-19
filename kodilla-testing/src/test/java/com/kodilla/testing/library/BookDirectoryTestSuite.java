package com.kodilla.testing.library;

import com.kodilla.testing.testing.library.Book;
import com.kodilla.testing.testing.library.BookLibrary;
import com.kodilla.testing.testing.library.LibraryDatabase;
import com.kodilla.testing.testing.library.LibraryUser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

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

    @Test
    void testListBooksWithConditionsMoreThan20(){
        //given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf19Books = generateListOfNBooks(19);
        List<Book> resultListOf21Books = generateListOfNBooks(21);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf19Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("ListOf40"))
                .thenReturn(resultListOf21Books);

        //when
        List<Book> listOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> listOfBooks19 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> listOfBooks21 = bookLibrary.listBooksWithCondition("ListOf40");

        //then
        assertEquals(0, listOfBooks0.size());
        assertEquals(19, listOfBooks19.size());
        assertEquals(0, listOfBooks21.size());
    }

    @Test
    void testListBooksWithConditionsFragmentShorterThan3(){
        //given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        //when
        List<Book> listOf0Books = bookLibrary.listBooksWithCondition("Am");

        //then
        assertEquals(0, listOf0Books.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testListBooksIfHandsOf(){
        //given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("Jan", "Brzechwa", "99999");
        LibraryUser user2 = new LibraryUser("Adam", "Polanski", "99991");
        LibraryUser user3 = new LibraryUser("Anna", "Kurek", "99992");
        List<Book> booksListEmpty = new ArrayList<>();
        List<Book> booksListSize1 = generateListOfNBooks(1);
        List<Book> booksListSize15 = generateListOfNBooks(15);
        when(libraryDatabaseMock.listBooksInHandsOf(any(LibraryUser.class)))
                .thenReturn(booksListEmpty);
        when(libraryDatabaseMock.listBooksInHandsOf(user2))
                .thenReturn(booksListSize1);
        when(libraryDatabaseMock.listBooksInHandsOf(user3))
                .thenReturn(booksListSize15);

        //when
        List<Book> resultEmpty = bookLibrary.listBooksInHandsOf(user);
        List<Book> resultSize1 = bookLibrary.listBooksInHandsOf(user2);
        List<Book> resultSize15 = bookLibrary.listBooksInHandsOf(user3);

        //then
        assertEquals(0, resultEmpty.size());
        assertEquals(1, resultSize1.size());
        assertEquals(15, resultSize15.size());
        verify(libraryDatabaseMock, times(3))
                .listBooksInHandsOf(any(LibraryUser.class));
    }

}
