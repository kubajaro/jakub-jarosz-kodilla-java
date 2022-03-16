package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    Board board;

    @Autowired
    public BoardService(@Qualifier("getBoard") Board board) {
        this.board = board;
    }

    public void printBoardLists() {

        System.out.println("TO DO LIST: ");
        printer(board.getToDoList().getTasks());
        System.out.println("\nIN PROGRESS LIST: ");
        printer(board.getInProgressList().getTasks());
        System.out.println("\nDONE LIST: ");
        printer(board.getDoneList().getTasks());

    }

    private void printer(List<String> list) {

        if(list.size()!=0) {
            for (String task : list) {
                System.out.println(task);
            }
        }else {
            System.out.println("The task list is empty");
        }

    }
}
