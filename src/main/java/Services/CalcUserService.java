package Services;

import CalculatorHistory.JDBCStorage.SaveNewUserInJDBC;
import CalculatorHistory.SaveNewUser;
import Objects.CalculatorUser;

import java.util.Optional;

public class CalcUserService {

    private final SaveNewUser userStorage = new SaveNewUserInJDBC();

    public void createNewUser(String username, String userEmail, String userPassword) {
        CalculatorUser calculatorUser = new CalculatorUser(username, userEmail, userPassword);
        //encoding password
        userStorage.saveNewUser(calculatorUser);
    }

    public Optional<CalculatorUser> findByUserID(Integer ID) {
        return Optional.ofNullable(userStorage.getOldUserByID(ID));
    }


    public Optional<CalculatorUser> findByUserUsername (String username){
        return userStorage.getUserByName(username);
    }

}
