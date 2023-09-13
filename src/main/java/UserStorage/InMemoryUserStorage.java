package UserStorage;

//import domain.User;

import Domain.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryUserStorage {

    private final List<User> users = new ArrayList<>();

    public void save (User user){
        users.add(user);
    }


    public Optional findByusername(String username){
        for(User user : users) {
            if (user.getusername().equalsIgnoreCase(username)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    public void printConsoleList(){
            System.out.println("\nList of users:\n");
            users.stream().forEach(result-> System.out.println(result +"\n"));
        }

        public List <User> getList(){
        return users;

    }

}

