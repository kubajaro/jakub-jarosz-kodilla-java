package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

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

    @Test
    void testContext() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        //when&then
        System.out.println("======== LISTA BEANOW ========>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<======== LISTA BEANOW ========");
    }
}
