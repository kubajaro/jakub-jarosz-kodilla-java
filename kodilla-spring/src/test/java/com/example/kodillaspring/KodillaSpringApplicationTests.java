package com.example.kodillaspring;

import com.kodilla.spring.portfolio.shape.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = ShapeFactory.class)
class KodillaSpringApplicationTests {

    @Test
    void testCircleLoadedIntoContainer() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Circle.class);

        //when
        String result = shape.getShapeName();

        //then
        assertEquals("This is a circle", result);
    }


    @Test
    void testTriangleLoadedIntoContainer() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Triangle.class);

        //when
        String result = shape.getShapeName();

        //then
        assertEquals("This is a triangle", result);
    }

    @Test
    void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Square.class);
        //When
        String name = shape.getShapeName();
        //Then
        assertEquals("This is a square", name);
    }

//    @Test
//    void testShapeLoadedIntoContainer() {
//        //Given
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Shape shape = (Shape)context.getBean("chosenShape");
//
//        //When
//        String name = shape.getShapeName();
//
//        //Then
//        System.out.println("Chosen shape says: " + name);
//    }

}
