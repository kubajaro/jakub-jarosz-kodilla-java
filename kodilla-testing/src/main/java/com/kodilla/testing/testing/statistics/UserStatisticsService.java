package com.kodilla.testing.testing.statistics;

public class UserStatisticsService {
    private Statistics statistics;
    UserStatistics userStatistics = new UserStatistics();

    public UserStatisticsService(Statistics statistics, UserStatistics userStatistics) {
        this.statistics = statistics;
        this.userStatistics = userStatistics;
    }

    public void calculateAdvStatistics() {
        int usersCount = statistics.userNames().size();
        int postsCount = statistics.postsCount();
        int commentsCount = statistics.commentsCount();

        userStatistics.setUsersQuantity(usersCount);
        userStatistics.setPostsQuantity(postsCount);
        userStatistics.setCommentsQuantity(commentsCount);

        if(usersCount > 0) {
            userStatistics.setAveragePostsPerUser((double) postsCount / usersCount);
            userStatistics.setAverageCommentsPerUser((double) commentsCount / usersCount);
        }else{
            userStatistics.setAveragePostsPerUser(0);
            userStatistics.setAverageCommentsPerUser(0);
        }
        if(postsCount > 0){
            userStatistics.setAverageCommentsPerPost((double) commentsCount / postsCount);
        }else{
            userStatistics.setAverageCommentsPerPost(0);
        }

    }
}
