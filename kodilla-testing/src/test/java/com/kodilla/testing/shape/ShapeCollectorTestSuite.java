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
        ShapeCollector newShape = new ShapeCollector();
        Shape testedShape = new Circle(2);
        boolean result = newShape.addFigure(testedShape);
        Assert.assertTrue(result);

    }

    @Test
    public void testRemoveFigure(){
        ShapeCollector newShape = new ShapeCollector();
        Shape testedShape = new Circle(2);
        newShape.addFigure(testedShape);

        boolean testResult = newShape.removeFigure(testedShape);

        Assert.assertTrue(testResult);
    }

    @Test
    public void testRemoveFigureDoesNotExist(){
        ShapeCollector newShape = new ShapeCollector();
        Shape randomShape = new Circle(2);
        newShape.addFigure(randomShape);

        Shape testedShape = new Circle(5);
        boolean testResult = newShape.removeFigure(testedShape);

        Assert.assertFalse(testResult);
    }

    @Test
    public void testGetFigure(){
        ShapeCollector newShape = new ShapeCollector();
        Shape testedShape = new Circle(2);
        newShape.addFigure(testedShape);

        Shape expected = newShape.getFigure(0);

        Assert.assertEquals(expected, testedShape);
    }

    @Test
    public void testGetFigureWhenListIsEmpty(){
        ShapeCollector newShape = new ShapeCollector();

        Shape expected = newShape.getFigure(0);

        Assert.assertNull(expected);
    }

    @Test
    public void testShowFigure(){
        ShapeCollector newShape = new ShapeCollector();
        Shape testedShape = new Circle(2);
        newShape.addFigure(testedShape);

        ArrayList<Shape> expected = new ArrayList<>();
        expected.add(testedShape);

        ArrayList<Shape> tested = newShape.showFigures();

        Assert.assertEquals(expected, tested);
    }

}
