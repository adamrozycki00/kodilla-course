package com.kodilla.patterns.prototype;

import java.util.HashSet;
import java.util.Set;

public class Board extends Prototype<Board> {

    private String name;
    private Set<TaskList> lists = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public Board deepCopy() throws CloneNotSupportedException {
        Board clonedBoard = clone();
        clonedBoard.lists = new HashSet<>();
        for (TaskList list : lists) {
            TaskList clonedList = new TaskList(list.getName());
            for (Task task : list.getTasks()) {
                clonedList.getTasks().add(new Task(task.getName()));
            }
            clonedBoard.getLists().add(clonedList);
        }
        return clonedBoard;
    }

    public String getName() {
        return name;
    }

    public Set<TaskList> getLists() {
        return lists;
    }

    @Override
    public String toString() {
        String s = "Board [" + name + "]\n";
        for (TaskList list : lists) {
            s = s + list.toString() + "\n";
        }
        return s;
    }

    public void setName(String name) {
        this.name = name;
    }
}
