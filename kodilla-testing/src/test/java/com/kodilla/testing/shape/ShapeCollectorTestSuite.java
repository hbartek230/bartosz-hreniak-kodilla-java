package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    ShapeCollector newShape;

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
        newShape = new ShapeCollector();
    }

    @Test
    public void testAddFigure(){
        //Given
        Shape testedShape = new Circle(2);
        //When
        newShape.addFigure(testedShape);
        //Then
        Assert.assertEquals(1, newShape.showFigures().size());

    }

    @Test
    public void testRemoveFigure(){
        //Given
        Shape testedShape = new Circle(2);
        newShape.addFigure(testedShape);
        //When
        newShape.removeFigure(testedShape);
        //Then
        Assert.assertEquals(0, newShape.showFigures().size());
    }

    @Test
    public void testRemoveFigureDoesNotExist(){
        //Given
        Shape randomShape = new Circle(2);
        newShape.addFigure(randomShape);
        //When
        Shape testedShape = new Circle(5);
        //Then
        Assert.assertEquals(1, newShape.showFigures().size());
    }

    @Test
    public void testGetFigure(){
        //Given
        Shape testedShape = new Circle(2);
        newShape.addFigure(testedShape);
        //When
        Shape expected = newShape.getFigure(0);
        //Then
        Assert.assertEquals(expected, testedShape);
    }

    @Test
    public void testGetFigureWhenListIsEmpty(){
        //When
        Shape expected = newShape.getFigure(0);
        //Then
        Assert.assertNull(expected);
    }

    @Test
    public void testShowFigure(){
        //Given
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
