package com.company.data;

import java.sql.*;

public class DB implements IDB {
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException{
        String connectionUrl = "jbdc:postgresql://localhost:5432/medicine";
        try {
            Class.forName("org.postgresql.Driver");

            return DriverManager.getConnection(connectionUrl, "postgres", "123");
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
}
