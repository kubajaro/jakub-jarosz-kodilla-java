package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //given
        DbManager dbManager = DbManager.getInstance();

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

}
