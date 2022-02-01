package com.kodilla.testing.statistics;

import com.kodilla.testing.testing.statistics.Statistics;
import com.kodilla.testing.testing.statistics.UserStatistics;
import com.kodilla.testing.testing.statistics.UserStatisticsService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserStatisticsServiceTestSuite {

    @Mock
    Statistics statisticsMock;

    public List<String> statisticsArrayList(double size){
        List<String> names = new ArrayList<>();
        for(int i = 0; i < size; i++ ){
            names.add("Name"+i);
        }
        return names;
    }

    @Test
    void getStatisticsTestPostsCount0(){
        //given
        UserStatisticsService userStatisticsService = new UserStatisticsService(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.userNames()).thenReturn(statisticsArrayList(2));

        //when
        UserStatistics userStatistics = userStatisticsService.calculateAdvStatistics();

        //expected
        assertEquals(0, userStatistics.getAverageCommentsPerPost());
        assertEquals(0, userStatistics.getAveragePostsPerUser());
    }

    @Test
    void getStatisticsTestPostsCount1000(){
        //given
        UserStatisticsService userStatisticsService = new UserStatisticsService(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.userNames()).thenReturn(statisticsArrayList(2));

        //when
        UserStatistics userStatistics = userStatisticsService.calculateAdvStatistics();

        //expected
        assertEquals(0.5, userStatistics.getAverageCommentsPerPost());
        assertEquals(250, userStatistics.getAverageCommentsPerUser());
        assertEquals(500, userStatistics.getAveragePostsPerUser());
    }

    @Test
    void getStatisticsTestCommentsCount0(){
        //given
        UserStatisticsService userStatisticsService = new UserStatisticsService(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.userNames()).thenReturn(statisticsArrayList(2));

        //when
        UserStatistics userStatistics = userStatisticsService.calculateAdvStatistics();

        //expected
        assertEquals(0, userStatistics.getAverageCommentsPerPost());
        assertEquals(0, userStatistics.getAverageCommentsPerUser());
        assertEquals(500, userStatistics.getAveragePostsPerUser());
    }

    @Test
    void getStatisticsTestMorePostsThanComments(){
        //given
        UserStatisticsService userStatisticsService = new UserStatisticsService(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.userNames()).thenReturn(statisticsArrayList(2));

        //when
        UserStatistics userStatistics = userStatisticsService.calculateAdvStatistics();

        //expected
        assertEquals(0.5, userStatistics.getAverageCommentsPerPost());
        assertEquals(250, userStatistics.getAverageCommentsPerUser());
        assertEquals(500, userStatistics.getAveragePostsPerUser());
    }

    @Test
    void getStatisticsTestMoreCommentsThanPosts(){
        //given
        UserStatisticsService userStatisticsService = new UserStatisticsService(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.userNames()).thenReturn(statisticsArrayList(2));

        //when
        UserStatistics userStatistics = userStatisticsService.calculateAdvStatistics();

        //expected
        assertEquals(2, userStatistics.getAverageCommentsPerPost());
        assertEquals(500, userStatistics.getAverageCommentsPerUser());
        assertEquals(250, userStatistics.getAveragePostsPerUser());
    }

    @Test
    void getStatisticsTestUsersCount0(){
        //given
        UserStatisticsService userStatisticsService = new UserStatisticsService(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.userNames()).thenReturn(statisticsArrayList(0));

        //when
        UserStatistics userStatistics = userStatisticsService.calculateAdvStatistics();

        //expected
        assertEquals(2, userStatistics.getAverageCommentsPerPost());
        assertEquals(0, userStatistics.getAverageCommentsPerUser());
        assertEquals(0, userStatistics.getAveragePostsPerUser());
    }

    @Test
    void getStatisticsTestUsersCount100(){
        //given
        UserStatisticsService userStatisticsService = new UserStatisticsService(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.userNames()).thenReturn(statisticsArrayList(100));

        //when
        UserStatistics userStatistics = userStatisticsService.calculateAdvStatistics();

        //expected
        assertEquals(2, userStatistics.getAverageCommentsPerPost());
        assertEquals(10, userStatistics.getAverageCommentsPerUser());
        assertEquals(5, userStatistics.getAveragePostsPerUser());
    }

}
