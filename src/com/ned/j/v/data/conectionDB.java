package com.ned.j.v.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectionDB {
    public static Connection getConnection(){
        String connectionUrl =
                "jdbc:sqlserver://localhost:1433;"
                        + "database=db_admin_alumnos;"
                        + "user=sa;"
                        + "password=240715;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
        try {
            Connection connection_ = DriverManager.getConnection(connectionUrl);
            System.out.println("Successful Connection");
            return connection_;
        } catch (SQLException ex) {
            System.out.println("Failed Connection: " + ex.toString());
            return null;
        }
    }
}
