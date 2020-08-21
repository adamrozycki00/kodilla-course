package com.kodilla.patterns.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoggerTestSuite {

    @Test
    public void shouldReturnGivenString() {
        //given
        Logger logger = Logger.getInstance();

        //when
        logger.log("logging...");

        //then
        assertEquals("logging...", logger.getLastLog());
    }

}
