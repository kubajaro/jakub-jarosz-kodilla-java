package com.kodilla.spring.intro.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DrawerTestSuite {

    @Test
    void doDrawingTest() {
        //given
        Drawer drawer = new Drawer();

        //when
        drawer.doDrawing();

        //then
        //nothing
    }

    @Test
    void doShapeDrawingCircleTest() {
        //given
        Shape circle = new Circle();

        //when
        Drawer drawer = new Drawer(circle);
        String result = drawer.doShapeDrawing();

        //then
        Assertions.assertEquals("This is a circle", result);
    }

    @Test
    void doShapeDrawingTriangleTest() {
        //given
        Shape triangle = new Triangle();

        //when
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doShapeDrawing();

        //then
        Assertions.assertEquals("This is a triangle", result);
    }
}
