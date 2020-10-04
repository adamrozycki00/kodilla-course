package com.kodilla.hibernate.task;

import com.kodilla.hibernate.tasklist.TaskList;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NamedQueries({
        @NamedQuery(
                name = "Task.retrieveLongTasks",
                query = "from Task where duration > 10"
        ),
        @NamedQuery(
                name = "Task.retrieveShortTasks",
                query = "from Task where duration <= 10"
        )
})
@NamedNativeQuery(
        name = "Task.retrieveTasksWithEnoughTime",
        query = "select * " +
                "from tasks " +
                "where datediff(date_add(created, interval duration day), now()) > 5",
        resultClass = Task.class
)
@Entity
@Table(name = "tasks")
public class Task {

    private long id;
    private String description;
    private Date created;
    private int duration;
    private TaskFinancialDetails taskFinancialDetails;
    private TaskList taskList;

    public Task() {
    }

    public Task(String description, int duration) {
        this.description = description;
        this.created = new Date();
        this.duration = duration;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public long getId() {
        return id;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    @NotNull
    @Column(name = "created")
    public Date getCreated() {
        return created;
    }

    @Column(name = "duration")
    public int getDuration() {
        return duration;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public TaskFinancialDetails getTaskFinancialDetails() {
        return taskFinancialDetails;
    }

    @ManyToOne
    @JoinColumn(name = "tasklist_id")
    public TaskList getTaskList() {
        return taskList;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) {
        this.taskFinancialDetails = taskFinancialDetails;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

}
