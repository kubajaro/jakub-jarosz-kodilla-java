package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialShare {
    @Override
    public String share() {
        return "Facebook";
    }
}
