package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCPostgresConnection {
    private final String URL1 = "jdbc:postgresql://localhost:5432/postgres";
    private final String USER1 = "postgres";
    private final String PASSWORD1 = "root";

    public void getPostgresConnection(){
        Connection connection = null;

        try {
           connection = DriverManager.getConnection(URL1, USER1, PASSWORD1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
