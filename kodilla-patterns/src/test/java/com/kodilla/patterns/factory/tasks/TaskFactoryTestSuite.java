package com.kodilla.patterns.factory.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskFactoryTestSuite {

    @Test
    public void shouldCreateShoppingTask() {
        //given
        TaskFactory factory = new TaskFactory();

        //when
        Task task = factory.createTask(TaskFactory.SHOPPING);

        //then
        assertEquals("shoppingTask", task.getTaskName());
    }
    @Test

    public void shouldCreateDrivingTask() {
        //given
        TaskFactory factory = new TaskFactory();

        //when
        Task task = factory.createTask(TaskFactory.DRIVING);

        //then
        assertEquals("drivingTask", task.getTaskName());
    }
    @Test
    public void shouldCreatePaintingTask() {
        //given
        TaskFactory factory = new TaskFactory();

        //when
        Task task = factory.createTask(TaskFactory.PAINTING);

        //then
        assertEquals("paintingTask", task.getTaskName());
    }

}
