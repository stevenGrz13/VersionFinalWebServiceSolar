package com.example.demo5.solar;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
    public static Connection getConn() throws Exception {
        String url = "jdbc:postgresql://containers-us-west-204.railway.app:6544/railway";
//      String url = "jdbc:postgresql://localhost:5432/solar";
        String user = "postgres";
        String pass = "rS3sqnWeQumUpItnFsfc";
//      String pass = "steven";
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
    }
}
