package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //given
        User max = new Millenials("Max");
        User kris = new YGeneration("Kris");
        User aga = new ZGeneration("Aga");

        //whem
        String millenialsResult = max.post();
        String yGenerationResult = kris.post();
        String zGenerationResult = aga.post();

        //then
        assertEquals("I am using Snapchat", millenialsResult);
        assertEquals("I am using Twitter", yGenerationResult);
        assertEquals("I am using Facebook", zGenerationResult);
    }

    @Test
    void testIndividualSharingStrategy() {
        //given
        User max = new Millenials("Max");

        //when
        max.setSocialShare(new TwitterPublisher());

        //
        assertEquals("I am using Twitter", max.post());
    }
}
