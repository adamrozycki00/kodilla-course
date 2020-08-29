package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //given
        taskListDao.save(new TaskList("To do", "Description 1"));
        taskListDao.save(new TaskList("Done", "Description 2"));
        taskListDao.save(new TaskList("In progress", "Description 3"));

        //when
        List<TaskList> done = taskListDao.findByListName("Done");

        //then
        assertEquals(1, done.size());

        //clean-up
        taskListDao.deleteAll();
    }

}
