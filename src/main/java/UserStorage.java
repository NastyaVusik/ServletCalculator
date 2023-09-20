import java.sql.*;
import java.util.Optional;

public class UserStorage {

    public void save(User user) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "PGPangalin013$");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into usersforlesson25 values (default, ?, ?, ?)");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (
                SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public Optional<User> getByUsername(String username) {
        try (Connection connection = DriverManager.getConnection
                ("jdbc:postgresql://localhost:5432/postgres", "postgres", "PGPangalin013$")){

            PreparedStatement preparedStatement = connection.prepareStatement("select * from  usersforlesson25 where username = ?");
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String username1 = resultSet.getString(3);
                String password = resultSet.getString(4);

                return Optional.of(new User(id, name, username, password));
            }
            return Optional.empty();

        } catch (
                SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
