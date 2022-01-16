package com.kodilla.testing.shape;

import com.kodilla.testing.testing.shape.*;
import org.junit.jupiter.api.*;

@DisplayName("Shape Tests")
public class shapeTest {
    static int counter = 0;

    @BeforeEach
    public void beforeEach(){
        counter++;
        System.out.println("Running test no. " + counter);
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Testing started");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Testing ended");
    }

    @Nested
    @DisplayName("Test for collection")
    class collectionShapeTest {

        @Test
        void testAddFigure(){
            //given
            ShapeCollector testCollector = new ShapeCollector();
            Shape triangle = new Triangle(3.0, 4.0);
            Shape circle = new Circle(3.0);
            Shape square = new Square(2.0);
            testCollector.addFigure(triangle);
            testCollector.addFigure(circle);
            testCollector.addFigure(square);

            //when
            Shape testResultTriangle = testCollector.getFigure(0);
            Shape testResultCircle = testCollector.getFigure(1);
            Shape testResultSquare = testCollector.getFigure(2);


            //then
            Assertions.assertEquals(testResultTriangle, triangle);
            Assertions.assertEquals(testResultCircle, circle);
            Assertions.assertEquals(testResultSquare, square);
        }

        @Test
        void testRemoveFigureNotExisting(){
            //given
            ShapeCollector testCollector = new ShapeCollector();
            Shape triangle = new Triangle(3.0, 4.0);

            //when
            boolean testResult = testCollector.removeFigure(triangle);

            //then
            Assertions.assertFalse(testResult);
        }

        @Test
        void testRemoveFigureExisting(){
            //given
            ShapeCollector testCollector = new ShapeCollector();
            Shape triangle = new Triangle(3.0, 4.0);
            Shape circle = new Circle(3.0);
            Shape square = new Square(2.0);
            testCollector.addFigure(triangle);
            testCollector.addFigure(circle);
            testCollector.addFigure(square);

            //when
            boolean testResultTriangle = testCollector.removeFigure(triangle);
            boolean testResultCircle = testCollector.removeFigure(circle);
            boolean testResultSquare = testCollector.removeFigure(square);

            //then
            Assertions.assertTrue(testResultTriangle);
            Assertions.assertTrue(testResultCircle);
            Assertions.assertTrue(testResultSquare);
        }

        @Test
        void testGetFigure(){
            //given
            ShapeCollector testCollector = new ShapeCollector();
            Shape triangle = new Triangle(3.0, 4.0);
            Shape circle = new Circle(3.0);
            Shape square = new Square(2.0);
            testCollector.addFigure(triangle);
            testCollector.addFigure(circle);
            testCollector.addFigure(square);

            //when
            Shape testResultTriangle = testCollector.getFigure(0);
            Shape testResultCircle = testCollector.getFigure(1);
            Shape testResultSquare = testCollector.getFigure(2);

            //then
            Assertions.assertEquals(triangle, testResultTriangle);
            Assertions.assertEquals(circle, testResultCircle);
            Assertions.assertEquals(square, testResultSquare);
        }

        @Test
        void testShowFiguresEmptyList(){
            //given
            ShapeCollector testCollector = new ShapeCollector();

            //when
            boolean result = testCollector.showFigures();

            //then
            Assertions.assertFalse(result);
        }

        @Test
        void testShowFigures(){
            //given
            ShapeCollector testCollector = new ShapeCollector();
            Shape triangle = new Triangle(3.0, 4.0);
            Shape circle = new Circle(3.0);
            Shape square = new Square(2.0);
            testCollector.addFigure(triangle);
            testCollector.addFigure(circle);
            testCollector.addFigure(square);

            //when
            boolean result = testCollector.showFigures();

            //then
            Assertions.assertTrue(result);
        }
    }

    @Nested
    @DisplayName("Shape methods tests")
    class shapeMethodTest{

        @Test
        void testGetShapeName(){
            //given
            Triangle triangle = new Triangle(3.0, 4.0);
            Circle circle = new Circle(3.0);
            Square square = new Square(2.0);

            //when
            String resultTriangle = triangle.getShapeName();
            String resultCircle = circle.getShapeName();
            String resultSquare = square.getShapeName();

            //then
            Assertions.assertEquals("It's a triangle", resultTriangle);
            Assertions.assertEquals("It's a circle", resultCircle);
            Assertions.assertEquals("It's a square", resultSquare);
        }

        @Test
        void testGetArea(){
            //given
            Triangle triangle = new Triangle(3.0, 4.0);
            Circle circle = new Circle(3.0);
            Square square = new Square(2.0);

            //when
            double resultTriangle = triangle.getArea();
            double resultCircle = circle.getArea();
            double resultSquare= square.getArea();

            double expectedTriangle = 0.5*3*4;
            double expectedCircle = Math.PI*Math.pow(3.0, 2);
            double expectedSquare = Math.pow(2.0, 2);

            //then
            Assertions.assertEquals(expectedTriangle, resultTriangle);
            Assertions.assertEquals(expectedCircle, resultCircle);
            Assertions.assertEquals(expectedSquare, resultSquare);
        }
    }
}