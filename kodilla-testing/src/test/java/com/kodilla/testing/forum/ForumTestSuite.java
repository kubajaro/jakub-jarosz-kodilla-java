package com.kodilla.testing.forum;

import com.kodilla.testing.testing.user.SimpleUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Forum Test Suite")
public class ForumTestSuite {

    @DisplayName(
            "When created SimpleUser with name, " +
            "then getUserName return correct name"
    )

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
