package com.kodilla.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class DbManagerTestSuite {
    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assertions.assertEquals(17, counter);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT Firstname, Lastname, COUNT(posts.body) AS numberOfComments FROM users JOIN posts " +
                "ON users.ID = posts.USER_ID GROUP BY users.id HAVING numberOfComments >= 2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int counter = 0;
        while(rs.next()) {
            counter++;
        }

        String sql = "INSERT INTO users(id, firstname, lastname) VALUES(19, 'Peter', 'Green')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO posts(user_id, body) VALUES(19, 'Hello!')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO posts(user_id, body) VALUES(19, 'I am Peter')";
        statement.executeUpdate(sql);

        //When
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(countQuery);

        //Then
        int count = 0;
        while(rs.next()) {
            System.out.println(rs.getString("Firstname") + ", " + rs.getString("Lastname"));
            count++;
        }
        rs.close();
        statement.close();
        int expected = counter + 1;
        Assertions.assertEquals(expected, count);
    }
}
