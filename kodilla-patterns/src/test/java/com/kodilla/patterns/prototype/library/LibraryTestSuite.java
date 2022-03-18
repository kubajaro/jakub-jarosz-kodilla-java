package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //given
        //create library
        Library library = new Library("test library");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Test book " + n, "Author", LocalDate.now())));


        Library shallowLibraryClone = null;
        try {
            shallowLibraryClone = library.shallowCopy();
            shallowLibraryClone.setName("shallow clone library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepLibraryClone = null;
        try {
            deepLibraryClone = library.deepCopy();
            deepLibraryClone.setName("deep clone library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        deepLibraryClone.getBooks().add(new Book("added book", "Author", LocalDate.now()));

        //when
        //then
        assertEquals(10, library.getBooks().size());
        assertEquals(library.getBooks(), shallowLibraryClone.getBooks());
        assertEquals(11, deepLibraryClone.getBooks().size());
    }
}
