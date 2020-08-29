package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskDaoTestSuite {

    @Autowired
    private TaskDao taskDao;

    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testTaskDaoSave() {
        //given
        Task task = new Task(DESCRIPTION, 7);

        //when
        taskDao.save(task);

        //then
        int id = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        assertTrue(readTask.isPresent());

        //clean-up
        taskDao.deleteById(id);
    }

    @Test
    public void testTaskDaoFindByDuration() {
        //given
        Task task = new Task(DESCRIPTION, 7);
        taskDao.save(task);
        int duration = task.getDuration();

        //when
        List<Task> readTasks = taskDao.findByDuration(duration);

        //then
        assertEquals(1, readTasks.size());

        //clean-up
        int id = readTasks.get(0).getId();
        taskDao.deleteById(id);
    }

}
