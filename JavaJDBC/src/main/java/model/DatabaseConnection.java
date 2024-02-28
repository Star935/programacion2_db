package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static String url = "jdbc:mysql://localhost:3306/testjava";
    private static String user ="root";
    private static String passsword ="";
    private static Connection connection;
    public static Connection getInstance() throws SQLException{
        if (connection==null){
            connection = DriverManager.getConnection(url,user,passsword);
        }
        return connection;
    }
}