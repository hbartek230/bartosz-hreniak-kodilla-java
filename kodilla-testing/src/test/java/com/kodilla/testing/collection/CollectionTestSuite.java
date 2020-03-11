package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class CollectionTestSuite {

    @Before
    public void befoer() {
        System.out.println("Test case: begin");
    }

    @After
    public void after() {
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator one = new OddNumbersExterminator();
        ArrayList<Integer> tested = one.exterminate(new ArrayList<Integer>());
        ArrayList<Integer> expected = new ArrayList<Integer>();
        System.out.println("Testing empty list");
        Assert.assertEquals(expected, tested);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator one = new OddNumbersExterminator();
        ArrayList<Integer> tested = one.exterminate(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
                18, 19, 20)));
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20));
        System.out.println("Testing filled list");
        Assert.assertEquals(expected, tested);
    }
}