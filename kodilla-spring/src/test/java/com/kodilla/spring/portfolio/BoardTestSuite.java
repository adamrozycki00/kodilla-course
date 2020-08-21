package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //when
        board.getToDoList().getTasks().add("Task1");
        board.getInProgressList().getTasks().add("Task2");
        board.getDoneList().getTasks().add("Task3");

        //then
        assertEquals("Task1", board.getToDoList().getTasks().get(0));
        assertEquals("Task2", board.getInProgressList().getTasks().get(0));
        assertEquals("Task3", board.getDoneList().getTasks().get(0));
    }

}
