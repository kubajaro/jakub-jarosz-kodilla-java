package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTestSuite {

    @Test
    void testGetListUsingFor(){
        //given
        BookDirectory bookDirectory = new BookDirectory();

        //when
        List<Book> books = bookDirectory.getList();

        //then
        long numberOfBooksPublishedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .count();

        assertEquals(3, numberOfBooksPublishedAfter2007);
    }


}
