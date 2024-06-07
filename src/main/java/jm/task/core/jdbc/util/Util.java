package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Util {
    private static final String HOST = "jdbc:mysql://localhost:3306/schema_name";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        Connection connection = null;
        {
            try {
                connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
                connection.setAutoCommit(false);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}