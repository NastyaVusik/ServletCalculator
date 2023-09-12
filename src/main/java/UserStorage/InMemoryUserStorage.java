package UserStorage;

//import domain.User;

import Domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryUserStorage {

    private final List<User> users = new ArrayList<>();

    public void save (User user){
        users.add(user);
    }


    public Optional findByUserName(String userName){
        for(User user : users) {
            if (user.getUserName().equalsIgnoreCase(userName)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
