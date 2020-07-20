package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {

    @Test
    public void basicPizzaWithBroccoli() {
        // given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BroccoliDecorator(theOrder);

        // when
        BigDecimal broccoliCost = theOrder.getCost();
        String broccoliDescription = theOrder.getDescription();

        // then
        assertEquals(new BigDecimal(19), broccoliCost);
        assertEquals("A pizza with cheese, tomato sos, broccoli", broccoliDescription);
    }

    @Test
    public void basicPizzaWithChicken() {
        // given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChickenDecorator(theOrder);

        // when
        BigDecimal chickenCost = theOrder.getCost();
        String chickenDescription = theOrder.getDescription();

        // then
        assertEquals(new BigDecimal(19), chickenCost);
        assertEquals("A pizza with cheese, tomato sos, chicken", chickenDescription);
    }

    @Test
    public void basicPizzaWithMushrooms() {
        // given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new MushroomsDecorator(theOrder);

        // when
        BigDecimal mushroomsCost = theOrder.getCost();
        String mushroomsDescription = theOrder.getDescription();

        // then
        assertEquals(new BigDecimal(17), mushroomsCost);
        assertEquals("A pizza with cheese, tomato sos, mushrooms", mushroomsDescription);
    }

    @Test
    public void basicPizzaWithExtraCheese() {
        // given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);

        // when
        BigDecimal extraCheeseCost = theOrder.getCost();
        String extraCheeseDescription = theOrder.getDescription();

        // then
        assertEquals(new BigDecimal(18), extraCheeseCost);
        assertEquals("A pizza with cheese, tomato sos and extra cheese", extraCheeseDescription);
    }

    @Test
    public void basicPizzaWithAllIngredients() {
        // given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BroccoliDecorator(theOrder);
        theOrder = new ChickenDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);

        // when
        BigDecimal allIngredientsCost = theOrder.getCost();
        String allIngredientsDescription = theOrder.getDescription();

        // then
        assertEquals(new BigDecimal(28), allIngredientsCost);
        assertEquals("A pizza with cheese, tomato sos, broccoli, chicken, mushrooms and extra cheese",
                allIngredientsDescription);
    }
}
