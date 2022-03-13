package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest(classes = Display.class)
public class CalculatorTestSuite {

    //given
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
    Calculator calculator = context.getBean(Calculator.class);

    @Test
    void addTest() {
        //when
        double result = calculator.add(2, 2);

        //then
        Assertions.assertEquals(4, result);
    }

    @Test
    void subTest() {
        //when
        double result = calculator.sub(2, 2);

        //then
        Assertions.assertEquals(0, result);
    }

    @Test
    void mulTest() {
        //when
        double result = calculator.mul(2, 2);

        //then
        Assertions.assertEquals(4, result);
    }

    @Test
    void divest() {
        //when
        double result = calculator.div(2, 2);

        //then
        Assertions.assertEquals(1, result);
    }
}
