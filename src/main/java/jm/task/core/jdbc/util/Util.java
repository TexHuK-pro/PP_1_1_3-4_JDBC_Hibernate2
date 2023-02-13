package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    // реализуйте настройку соеденения с БД
    //private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";

    //private static final String DB_URL = "jdbc:mysql://localhost:3306";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_users";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            if (!connection.isClosed()) {
                System.out.println("Connection ok");
            }
        } catch (SQLException e) {
            System.out.println("Connection error");
            throw new RuntimeException(e);
        }
        return connection;
    }
}
