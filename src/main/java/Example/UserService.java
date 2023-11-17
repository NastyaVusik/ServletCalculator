package Example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@VIP
@Scope("singleton")
public class UserService {

    @Autowired
    private UserDao userDao;

   @Autowired
    private TestLazyBean testLazyBean;

public void save(){
    System.out.println("User Service Save()");

}
    @Override
    public String toString() {
        return "UserService{" +
               "userDao=" + userDao +
               '}';
    }
}
