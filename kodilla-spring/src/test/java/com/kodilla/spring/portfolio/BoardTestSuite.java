package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private BoardService boardService;

    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {
        //when
        board.addToDoTask("to do task");
        board.addDoneTask("done task");
        board.addInProgressTask("in progress task");
        boardService.printBoardLists();


        //then
        assertEquals(1, board.getDoneList().getTasks().size());
        assertEquals(1, board.getInProgressList().getTasks().size());
        assertEquals(1, board.getToDoList().getTasks().size());
    }
}
