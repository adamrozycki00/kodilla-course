package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getTasks1(), getTasks2(), getTasks3());
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
