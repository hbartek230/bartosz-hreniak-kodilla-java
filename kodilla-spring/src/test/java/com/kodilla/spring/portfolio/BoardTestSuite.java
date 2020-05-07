package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        // given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        String expected1 = "toDoFirst";
        String expected2 = "inProgressFirst";
        String expected3 = "doneFirst";

        // when
        board.getToDoList().getTasks().add("toDoFirst");
        board.getInProgressList().getTasks().add("inProgressFirst");
        board.getDoneList().getTasks().add("doneFirst");

        // then
        Assert.assertEquals(1, board.getToDoList().getTasks().size());
        Assert.assertEquals(1, board.getInProgressList().getTasks().size());
        Assert.assertEquals(1, board.getDoneList().getTasks().size());

        Assert.assertEquals(expected1, board.getToDoList().getTasks().get(0));
        Assert.assertEquals(expected2, board.getInProgressList().getTasks().get(0));
        Assert.assertEquals(expected3, board.getDoneList().getTasks().get(0));

        System.out.println(board.toString());
    }
}
