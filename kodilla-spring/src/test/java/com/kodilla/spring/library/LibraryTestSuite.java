package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest(classes = LibraryDbController.class)
public class LibraryTestSuite {

    @Test
    void testLoadFromDB() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);

        //when
        library.loadFromDB();

        //then
        //do nothing
    }

    @Test
    void testSaveToDB() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);

        //when
        library.saveToDB();

        //then
        //do nothing
    }
}
