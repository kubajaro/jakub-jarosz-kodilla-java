package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialShare {
    @Override
    public String share() {
        return "Twitter";
    }
}
