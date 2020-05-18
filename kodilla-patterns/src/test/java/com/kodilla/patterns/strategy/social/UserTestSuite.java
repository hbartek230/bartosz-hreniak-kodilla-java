package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        // given
        User john = new Millenials("John");
        User adam = new YGeneration("Adam");
        User scott = new ZGeneration("Scott");

        // when
        String johnSharing = john.sharePost();
        String adamSharing = adam.sharePost();
        String scottSharing = scott.sharePost();

        // then
        Assert.assertEquals("Sharing on Facebook", johnSharing);
        Assert.assertEquals("Sharing on Twitter", adamSharing);
        Assert.assertEquals("Sharing on Snapchat", scottSharing);
    }

    @Test
    public void testIndividualSharingStrategy(){
        // given
        User john = new Millenials("John");

        // when
        String johnSharing = john.sharePost();
        john.setPublisher(new SnapchatPublisher());
        String newSharing = john.sharePost();

        // then
        Assert.assertEquals("Sharing on Facebook", johnSharing);
        Assert.assertEquals("Sharing on Snapchat", newSharing);
    }
}
