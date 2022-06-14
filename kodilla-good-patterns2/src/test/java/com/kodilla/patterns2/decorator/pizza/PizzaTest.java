package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaTest {

    @Test
    void testPizzaMargherita() {
        //given
        PizzaBaker thePizza = new PizzaMargherita();
        //when
        int price = thePizza.getPrice();
        //then
        assertEquals(15, price);
    }

    @Test
    void testPizzaHawaii() {
        //given
        PizzaBaker thePizza = new PizzaMargherita();
        thePizza = new PizzaHawaii(thePizza);
        //when
        int price = thePizza.getPrice();
        //then
        assertEquals(25, price);
    }

    @Test
    void testPizzaPiccante() {
        //given
        PizzaBaker thePizza = new PizzaMargherita();
        thePizza = new PizzaPiccante(thePizza);
        //when
        int price = thePizza.getPrice();
        //then
        assertEquals(30, price);
    }

    @Test
    void testPizzaVege() {
        //given
        PizzaBaker thePizza = new PizzaMargherita();
        thePizza = new PizzaVege(thePizza);
        //when
        int price = thePizza.getPrice();
        //then
        assertEquals(28, price);
    }
}