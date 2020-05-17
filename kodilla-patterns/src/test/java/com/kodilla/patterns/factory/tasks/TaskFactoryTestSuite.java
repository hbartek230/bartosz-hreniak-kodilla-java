package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactory_when_TaskIsShopping(){
        // given
        TaskFactory factory = new TaskFactory();

        // when
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();

        // then
        Assert.assertEquals(shopping.getTaskName(), "Shopping");
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testFactory_when_TaskIsPainting(){
        // given
        TaskFactory factory = new TaskFactory();

        // when
        Task shopping = factory.makeTask(TaskFactory.PAINTING);
        shopping.executeTask();

        // then
        Assert.assertEquals(shopping.getTaskName(), "Painting");
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testFactory_when_TaskIsDriving(){
        // given
        TaskFactory factory = new TaskFactory();

        // when
        Task shopping = factory.makeTask(TaskFactory.DRIVING);
        shopping.executeTask();

        // then
        Assert.assertEquals(shopping.getTaskName(), "Driving");
        Assert.assertTrue(shopping.isTaskExecuted());
    }
}
