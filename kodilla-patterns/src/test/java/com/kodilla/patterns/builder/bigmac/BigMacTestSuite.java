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
                .sauce("barbecue")
                .build();

        // when
        int howManyBurgers = bigmac.getBurgers();
        String whichBun = bigmac.getBun();

        // then
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals("Sezam", whichBun);
    }
}
