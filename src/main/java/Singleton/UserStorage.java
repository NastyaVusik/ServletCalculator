package Singleton;


public class UserStorage {

    private static UserStorage instance;

    private UserStorage() {
    }

    public static UserStorage getInstance() {
        if (instance == null) {
            instance = new UserStorage();
        }
        return instance;
    }

    public void save() {

    }


    public Object[] findAll() {
        return null;
    }
}
