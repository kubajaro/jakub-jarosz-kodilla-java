package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String forumUser;

    public ForumUser() {
        forumUser = "John Smith";
    }

    public String getForumUser() {
        return forumUser;
    }
}
