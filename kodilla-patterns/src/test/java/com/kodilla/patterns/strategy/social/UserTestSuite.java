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
        System.out.println(john.getUsername() + " " + johnSharing);
        String adamSharing = adam.sharePost();
        System.out.println(adam.getUsername() + " " + adamSharing);
        String scottSharing = scott.sharePost();
        System.out.println(scott.getUsername() + " " + scottSharing);

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
        System.out.println(john.getUsername() + " " + johnSharing);
        john.setPublisher(new SnapchatPublisher());
        String newSharing = john.sharePost();
        System.out.println(john.getUsername() + " now " + newSharing);

        // then
        Assert.assertEquals("Sharing on Snapchat", newSharing);
    }
}
