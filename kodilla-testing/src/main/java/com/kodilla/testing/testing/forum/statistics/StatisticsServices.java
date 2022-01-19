package com.kodilla.testing.testing.forum.statistics;

import java.util.List;

public class StatisticsServices {
    private Statistics statistics;

    public StatisticsServices(Statistics statistics) {
        this.statistics = statistics;
    }

    public int usersQuantity(){
        List<String> usersNames = statistics.userNames();
        return usersNames.size();
    }

    public int postsQuantity(){
        return statistics.postsCount();
    }


}
