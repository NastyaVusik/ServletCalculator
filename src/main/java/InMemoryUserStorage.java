
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryUserStorage {
    private static final List<User> usersList = new ArrayList<>();

    public List<User> save(User user) {
        usersList.add(user);

        return usersList;
    }

    public Optional<User> findByUsername(String username){
        for(User user : usersList){
            if(user.getUsername().equals(username)){
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

}
