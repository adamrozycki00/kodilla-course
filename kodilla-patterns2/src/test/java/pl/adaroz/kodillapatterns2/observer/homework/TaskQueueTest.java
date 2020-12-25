package pl.adaroz.kodillapatterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskQueueTest {

    @Test
    public void testTaskQueue() {
        //given
        TaskQueue student1 = new TaskQueue("Student 1");
        TaskQueue student2 = new TaskQueue("Student 2");
        TaskQueue student3 = new TaskQueue("Student 3");
        TaskQueue student4 = new TaskQueue("Student 4");

        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 1");

        student1.registerObserver(mentor1);
        student2.registerObserver(mentor1);
        student3.registerObserver(mentor2);
        student4.registerObserver(mentor2);

        //when
        student1.addTask(new Task("Task 1"));
        student2.addTask(new Task("Task 1"));
        student3.addTask(new Task("Task 1"));
        student1.addTask(new Task("Task 2"));
        student1.addTask(new Task("Task 3"));
        student4.addTask(new Task("Task 1"));

        //then
        assertEquals(4, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
    }


}
