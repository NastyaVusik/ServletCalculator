package Services;

import CalculatorHistory.JDBCStorage.JDBCUserStorageStorage;
import CalculatorHistory.UserStorage;
import Objects.CalculatorUser;

import java.util.Optional;

public class CalcUserService {

    private final UserStorage userStorage = new JDBCUserStorageStorage();

    public void createNewUser(String username, String userEmail, String userPassword) {
        CalculatorUser calculatorUser = new CalculatorUser(username, userEmail, userPassword);
        //encoding password
        userStorage.saveNewUser(calculatorUser);
    }


    public Optional<CalculatorUser> logIn(String username, String userPassword){
        return  userStorage.getUserByNamePassword(username, userPassword);
    }

    public Optional<CalculatorUser> findByUserID(Integer ID) {
        return userStorage.getOldUserByID(ID);
    }


    public Optional<CalculatorUser> findByUserUsername (String username){
        return userStorage.getUserByName(username);
    }

}
