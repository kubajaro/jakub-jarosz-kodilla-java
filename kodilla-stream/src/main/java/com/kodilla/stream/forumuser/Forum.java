package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum(){
        usersList.add(new ForumUser(100, "johnDoe", 'M', 2002, 1, 12, 12));
        usersList.add(new ForumUser(101, "jackee", 'F', 1988 , 3, 11, 0));
        usersList.add(new ForumUser(102, "OliM", 'M', 2011, 5, 31, 122));
        usersList.add(new ForumUser(103, "Fran", 'F', 1999, 7, 4, 5));
        usersList.add(new ForumUser(104, "tobbyXX", 'M', 2005, 2, 12, 0));
        usersList.add(new ForumUser(105, "macM", 'M', 2003, 11, 8, 1));
        usersList.add(new ForumUser(106, "BigMac", 'M', 2007, 4, 1, 242));
        usersList.add(new ForumUser(107, "lIllY", 'F', 2005, 9, 4, 23));
        usersList.add(new ForumUser(108, "aNNa", 'F', 1980, 2, 12, 77));
        usersList.add(new ForumUser(109, "Mike23", 'M', 2006, 12, 27, 11));
    }

    public List<ForumUser> getList(){
        return new ArrayList<>(usersList);
    }
}
