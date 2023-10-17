import java.sql.*;

public class GreetingStorage {

    public void save(String name){
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into greeting values (default, ?)");
            preparedStatement.setString(1, name);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
