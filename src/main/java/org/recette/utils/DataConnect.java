package org.recette.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnect {
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        String url  = "jdbc:mysql://localhost:3306/recette";
        String user = "root";
        String password = "";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,user,password);

        return  connection;
    }
}
