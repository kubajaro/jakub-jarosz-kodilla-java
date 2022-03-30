package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DbManagerTestSuite {

    //given
    DbManager dbManager = DbManager.getInstance();

    @Test
    void testConnect() throws SQLException {

        //when
        String query = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(query);

        //then
        int counter = 0;
        while(rs.next()){
            System.out.println(rs.getInt("ID"));
            rs.getString("FIRSTNAME");
            rs.getString("LASTNAME");
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //when
        String query = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER " +
                "FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID " +
                "GROUP BY U.FIRSTNAME, U.LASTNAME " +
                "HAVING COUNT(*) > 1;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(query);

        //then
        int counter = 0;
        while(rs.next()){
            System.out.println(rs.getString("FIRSTNAME") + " "
                    + rs.getString("LASTNAME"));
            counter++;
        }

        assertEquals(1, counter);
    }

}
