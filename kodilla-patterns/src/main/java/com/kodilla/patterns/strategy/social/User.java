package com.kodilla.patterns.strategy.social;

public class User {
    private String name;
    protected SocialShare socialShare;

    public User(String name) {
        this.name = name;
    }

    public String post() {
        return socialShare.share();
    }

    public void setSocialShare(SocialShare socialShare) {
        this.socialShare = socialShare;
    }
}
