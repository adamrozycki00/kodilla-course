package com.kodilla.spring.forum;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class ForumUserTestSuite {

    @Test
    public void testGetUsername() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.forum");
        ForumUser user = context.getBean(ForumUser.class);

        //when
        String result = user.getUsername();

        //then
        assertEquals("John Smith", result);
    }

}
