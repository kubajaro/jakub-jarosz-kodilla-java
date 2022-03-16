package com.kodilla.patterns.singelton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        //given
        Logger logger = new Logger();

        //when
        logger.log("test");
        String result = logger.getLastLog();

        //then
        assertEquals("test", result);
    }
}
