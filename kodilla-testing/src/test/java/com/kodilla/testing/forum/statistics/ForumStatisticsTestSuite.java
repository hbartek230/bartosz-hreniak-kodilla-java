package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class ForumStatisticsTestSuite {
    Statistics mockStatistics;
    ForumStatistic fs;
    private static int testCounter = 0;

    @Before
    public void setDefaultVariables() {
        testCounter++;
        System.out.println("Test number #" + testCounter + " in progress.");
        mockStatistics = mock(Statistics.class);
        List<String> testUsers = new ArrayList<String>(Arrays.asList());
        for (int i = 0; i < 10; i++) {
            testUsers.add("User" + i+1);
        }
        when(mockStatistics.usersNames()).thenReturn(testUsers);
        when(mockStatistics.postsCount()).thenReturn(20);
        when(mockStatistics.commentsCount()).thenReturn(25);
        fs = new ForumStatistic();
    }

    @Test
    public void testCalculateAdvStatisticsWhenPostCountIs0(){
        //Given
        when(mockStatistics.postsCount()).thenReturn(0);
        //When
        fs.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(0, fs.getPostCount());
        Assert.assertEquals(0, fs.getAvgPostsPerUser(), 0.001);
        Assert.assertEquals(0, fs.getAvgCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenPostCountIs1000(){
        //Given
        when(mockStatistics.postsCount()).thenReturn(1000);
        //When
        fs.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(1000, fs.getPostCount());
        Assert.assertEquals(100, fs.getAvgPostsPerUser(), 0.001);
        Assert.assertEquals(0.025, fs.getAvgCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenCommentsCountIs0(){
        //Given
        when(mockStatistics.commentsCount()).thenReturn(0);
        //When
        fs.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(0, fs.getCommentsCount());
        Assert.assertEquals(0, fs.getAvgCommentsPerUser(), 0.001);
        Assert.assertEquals(0, fs.getAvgCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenCommentsCountIsLowerThanPostCount(){
        //Given
        when(mockStatistics.commentsCount()).thenReturn(10);
        //When
        fs.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(10, fs.getCommentsCount());
        Assert.assertEquals(1, fs.getAvgCommentsPerUser(), 0.001);
        Assert.assertEquals(0.5, fs.getAvgCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenCommentsCountIsHigherThanPostCount(){
        //Given
        when(mockStatistics.commentsCount()).thenReturn(30);
        //When
        fs.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(30, fs.getCommentsCount());
        Assert.assertEquals(3, fs.getAvgCommentsPerUser(), 0.001);
        Assert.assertEquals(1.5, fs.getAvgCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenUsersCountIs0(){
        //Given
        List<String> testUsers = new ArrayList<>();
        when(mockStatistics.usersNames()).thenReturn(testUsers);
        //When
        fs.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(0, fs.getUsersCount());
        Assert.assertEquals(0, fs.getAvgPostsPerUser(), 0.001);
        Assert.assertEquals(0, fs.getAvgCommentsPerUser(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenUsersCountIs100(){
        //Given
        List<String> testUsers = new ArrayList<>();
        for(int i=0; i<100; i++){
            testUsers.add("User" + i);
        }
        when(mockStatistics.usersNames()).thenReturn(testUsers);
        //When
        fs.calculateAdvStatistics(mockStatistics);
        //Then
        Assert.assertEquals(100, fs.getUsersCount());
        Assert.assertEquals(0.2, fs.getAvgPostsPerUser(), 0.001);
        Assert.assertEquals(0.25, fs.getAvgCommentsPerUser(), 0.001);
    }
}
