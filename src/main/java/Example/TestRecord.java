package Example;

import org.springframework.stereotype.Component;
@Component
public class TestRecord {

    public record testRecord(UserDao userDao){
        @Override
        public String toString() {
            return "testRecord{" +
                   "userDao=" + userDao +
                   '}';
        }
    }
}
