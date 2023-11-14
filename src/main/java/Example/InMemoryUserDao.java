package Example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class InMemoryUserDao implements UserDao{
    @Override
    public void save(User user) {

    }
}
