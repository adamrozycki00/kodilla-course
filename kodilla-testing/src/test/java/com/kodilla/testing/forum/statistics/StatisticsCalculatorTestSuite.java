package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {

    @Test
    public void shouldCalculateStatisticsFor0Users0Posts0Comments() {
        //given
        StatisticsCalculator calculator = new StatisticsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //when
        calculator.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(0, calculator.getNumberOfUsers());
        assertEquals(0, calculator.getNumberOfPosts());
        assertEquals(0, calculator.getNumberOfComments());
        assertEquals(0, calculator.getAvgNumberOfPostsPerUser(), 0);
        assertEquals(0, calculator.getAvgNumberOfCommentsPerUser(), 0);
        assertEquals(0, calculator.getAvgNumberOfCommentsPerPost(), 0);
    }

    @Test
    public void shouldCalculateStatisticsFor100Users1000Posts2000Comments() {
        //given
        StatisticsCalculator calculator = new StatisticsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        int users = 100;
        int posts = 1000;
        int comments = 2000;
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>(Collections.nCopies(users, "username")));
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //when
        calculator.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(users, calculator.getNumberOfUsers());
        assertEquals(posts, calculator.getNumberOfPosts());
        assertEquals(comments, calculator.getNumberOfComments());
        assertEquals((double) posts / users, calculator.getAvgNumberOfPostsPerUser(), .001);
        assertEquals((double) comments / users, calculator.getAvgNumberOfCommentsPerUser(), .001);
        assertEquals((double) comments / posts, calculator.getAvgNumberOfCommentsPerPost(), .001);
    }

    @Test
    public void shouldCalculateStatisticsFor400Users1000Posts500Comments() {
        //given
        StatisticsCalculator calculator = new StatisticsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        int users = 400;
        int posts = 1000;
        int comments = 500;
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>(Collections.nCopies(users, "username")));
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //when
        calculator.calculateAdvStatistics(statisticsMock);

        //then
        assertEquals(users, calculator.getNumberOfUsers());
        assertEquals(posts, calculator.getNumberOfPosts());
        assertEquals(comments, calculator.getNumberOfComments());
        assertEquals((double) posts / users, calculator.getAvgNumberOfPostsPerUser(), .001);
        assertEquals((double) comments / users, calculator.getAvgNumberOfCommentsPerUser(), .001);
        assertEquals((double) comments / posts, calculator.getAvgNumberOfCommentsPerPost(), .001);
    }

}
