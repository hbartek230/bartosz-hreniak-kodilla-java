package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        // given
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent northAmerica = new Continent("North America");

        World world = new World();

        europe.addCountry(new Country("Poland", new BigDecimal("38386000")));
        europe.addCountry(new Country("Germany", new BigDecimal("82798000")));
        europe.addCountry(new Country("Spain", new BigDecimal("46664000")));
        europe.addCountry(new Country("France", new BigDecimal("66992000")));

        africa.addCountry(new Country("Algiera", new BigDecimal("40970000")));
        africa.addCountry(new Country("Egypt", new BigDecimal("97041000")));
        africa.addCountry(new Country("Camerun", new BigDecimal("24995000")));
        africa.addCountry(new Country("Libia", new BigDecimal("6653000")));

        northAmerica.addCountry(new Country("USA", new BigDecimal("327200000")));
        northAmerica.addCountry(new Country("Canada", new BigDecimal("37592000")));
        northAmerica.addCountry(new Country("Mexico", new BigDecimal("129253000")));

        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(northAmerica);

        // when
        BigDecimal testedPeopleQuantity = world.getPeopleQuantity();

        // then
        BigDecimal expectedPeopleQuantity = new BigDecimal("898544000");
        Assert.assertEquals(expectedPeopleQuantity, testedPeopleQuantity);

    }
}
