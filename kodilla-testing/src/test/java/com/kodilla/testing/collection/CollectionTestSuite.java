package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void befoer(){
        System.out.println("Test case: begin");
    }

    @After
    public void after(){
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator one = new OddNumbersExterminator();
        one.exterminate(new ArrayList<Integer>(), 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator one = new OddNumbersExterminator();
        one.exterminate(new ArrayList<Integer>(), 20);
    }

}
