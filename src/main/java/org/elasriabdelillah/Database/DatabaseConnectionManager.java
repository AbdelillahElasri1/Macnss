package org.elasriabdelillah.Database;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private static String url = "jdbc:postgresql://localhost:5432/Macnss";
    private static String username = "postgres";
    private static String password = "";
    private static Connection connection;
    private static DataSource dataSource;

    private DatabaseConnectionManager() {

    }


    public static Connection getConnection(){
        if (connection == null){
            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(url,username,password);
            } catch (ClassNotFoundException | SQLException e){
                e.printStackTrace();
            }
        }
        return connection;
    }
    public void closeConnection(){
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
