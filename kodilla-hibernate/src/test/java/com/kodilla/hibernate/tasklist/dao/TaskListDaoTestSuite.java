package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskDao;
    private static final String LISTNAME = "MyFirstSpringHbernateList";
    private static final String DESCRIPTION = "This is my beginning with hibernate";

    @Test
    public void testFindByListName(){
        // given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        // when
        taskDao.save(taskList);

        // then
        String name = taskList.getListName();
        List<TaskList> readList = taskDao.findByListName(name);
        Assert.assertEquals(name, readList.get(0).getListName());

        // cleanUp
        int id = readList.get(0).getId();
        taskDao.deleteById(id);
    }
}
