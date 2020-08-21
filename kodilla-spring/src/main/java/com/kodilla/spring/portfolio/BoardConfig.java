package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("getTasks1")
    TaskList toDo;

    @Autowired
    @Qualifier("getTasks2")
    TaskList inProgress;

    @Autowired
    @Qualifier("getTasks3")
    TaskList done;


    @Bean
    public Board getBoard() {
        return new Board(toDo, inProgress, done);
    }

    @Bean
    @Scope("prototype")
    public TaskList getTasks1() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList getTasks2() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList getTasks3() {
        return new TaskList();
    }

}
