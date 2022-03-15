package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //when
        board.printTask();

        //then
        assertEquals(1, board.getDoneList().getTasks().size());
        assertEquals(1, board.getInProgressList().getTasks().size());
        assertEquals(1, board.getToDoList().getTasks().size());
    }
}
