package com.kodilla.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.*;

public class DbManagerTestSuite {

    @Test
    public void testConnect() throws SQLException {
        //given & when
        DbManager dbManager = DbManager.getInstance();

        //then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //given
        DbManager dbManager = DbManager.getInstance();

        //when
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }


    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //given
        DbManager dbManager = DbManager.getInstance();

        //when
        String sqlQuery = "select concat(u.firstname, ' ', u.lastname) User " +
                "from users u join posts p on p.user_id = u.id " +
                "group by u.id " +
                "having count(*) > 1;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getString("User"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(2, counter);
    }

}
