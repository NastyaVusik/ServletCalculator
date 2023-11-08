package Fabric_method;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    private JdbcConnection(){}
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    //Overloaded method
    public static Connection getConnectionwithotAutoCommit(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("");
            connection.setAutoCommit(false);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
