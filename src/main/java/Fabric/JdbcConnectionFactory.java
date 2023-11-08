package Fabric;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionFactory {
    private boolean isEnableAutoCommit = true;

    public JdbcConnectionFactory() {

    }

    public JdbcConnectionFactory(boolean isEnableAutoCommit) {

        this.isEnableAutoCommit = isEnableAutoCommit;
    }

    public Connection getConnection(){
        try {
            Connection connection = DriverManager.getConnection("");
            connection.setAutoCommit(isEnableAutoCommit);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
