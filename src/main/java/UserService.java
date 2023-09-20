import java.util.Optional;

public class UserService {
private final UserStorage userStorage = new UserStorage();

    public void createUser(String name, String username, String password){
        User user = new User(name, username, password);
        userStorage.save(user);
    }

    public Optional <User> findByUsername(String username){
        return userStorage.getByUsername(username);
    }


}
