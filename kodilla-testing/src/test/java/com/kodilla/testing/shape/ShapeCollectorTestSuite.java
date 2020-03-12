package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Tests begins");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector newShape = new ShapeCollector();
        Shape testedShape = new Circle(2);
        //When
        ArrayList<Shape> shape = newShape.addFigure(testedShape);
        //Then
        Assert.assertEquals(1, shape.size());

    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector newShape = new ShapeCollector();
        Shape testedShape = new Circle(2);
        newShape.addFigure(testedShape);
        //When
        boolean testResult = newShape.removeFigure(testedShape);
        //Then
        Assert.assertTrue(testResult);
    }

    @Test
    public void testRemoveFigureDoesNotExist(){
        //Given
        ShapeCollector newShape = new ShapeCollector();
        Shape randomShape = new Circle(2);
        newShape.addFigure(randomShape);
        //When
        Shape testedShape = new Circle(5);
        boolean testResult = newShape.removeFigure(testedShape);
        //Then
        Assert.assertFalse(testResult);
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector newShape = new ShapeCollector();
        Shape testedShape = new Circle(2);
        newShape.addFigure(testedShape);
        //When
        Shape expected = newShape.getFigure(0);
        //Then
        Assert.assertEquals(expected, testedShape);
    }

    @Test
    public void testGetFigureWhenListIsEmpty(){
        //Given
        ShapeCollector newShape = new ShapeCollector();
        //When
        Shape expected = newShape.getFigure(0);
        //Then
        Assert.assertNull(expected);
    }

    @Test
    public void testShowFigure(){
        //Given
        ShapeCollector newShape = new ShapeCollector();
        Shape testedShape = new Circle(2);
        newShape.addFigure(testedShape);
        //When
        ArrayList<Shape> expected = new ArrayList<>();
        expected.add(testedShape);
        ArrayList<Shape> tested = newShape.showFigures();
        //Then
        Assert.assertEquals(expected, tested);
    }

}
