package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {

    @Test
    public void testBigMacBuilder() {
        // given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sezam")
                .burgers(2)
                .ingredients("salad")
                .sauce("barbecue")
                .ingredients("onion")
                .ingredients("becon")
                .build();

        // when
        int howManyBurgers = bigmac.getBurgers();
        String whichBun = bigmac.getBun();
        int howManyIngredients = bigmac.getIngredients().size();
        String whichSauce = bigmac.getSauce();

        // then
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals("Sezam", whichBun);
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals("barbecue", whichSauce);
    }
}
