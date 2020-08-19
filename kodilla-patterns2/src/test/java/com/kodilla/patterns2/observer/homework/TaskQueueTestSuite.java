package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.oberver.homework.EasyTaskQueue;
import com.kodilla.patterns2.oberver.homework.MediumTaskQueue;
import com.kodilla.patterns2.oberver.homework.Mentor;
import com.kodilla.patterns2.oberver.homework.TaskQueue;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class TaskQueueTestSuite {

    @Test
    public void testQueueList() {
        // given
        TaskQueue johnTaskQueue = new EasyTaskQueue();
        TaskQueue emilTaskQueue = new EasyTaskQueue();
        TaskQueue simonTaskQueue = new MediumTaskQueue();
        TaskQueue timTaskQueue = new MediumTaskQueue();
        TaskQueue brianTaskQueue = new EasyTaskQueue();
        Mentor sGK = new Mentor("Szymon");
        Mentor aP = new Mentor("Adrian");
        johnTaskQueue.registerObserver(sGK);
        emilTaskQueue.registerObserver(sGK);
        simonTaskQueue.registerObserver(sGK);
        simonTaskQueue.registerObserver(aP);
        timTaskQueue.registerObserver(sGK);
        timTaskQueue.registerObserver(aP);
        brianTaskQueue.registerObserver(sGK);

        // when
        johnTaskQueue.addTask("Task 1");
        emilTaskQueue.addTask("Task 2");
        simonTaskQueue.addTask("Task 3");
        timTaskQueue.addTask("Task 4");
        brianTaskQueue.addTask("Task 5");

        // then
        assertEquals(5, sGK.getUpdateCount());
        assertEquals(2, aP.getUpdateCount());
    }
}
