package com.kodilla.testing.forum;

import com.kodilla.testing.testing.user.SimpleUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForumTestSuite {

    @Test
    void testCaseUsername(){
        //given
        SimpleUser simpleUser = new SimpleUser("TestName");

        //when
        String result = simpleUser.getUserName();
        String expectedResult = "TestName";

        //then
        Assertions.assertEquals(expectedResult, result);

    }
}
