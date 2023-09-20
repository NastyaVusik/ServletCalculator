package CalculatorHistory;

import Objects.CalculatorUser;

import java.util.List;
import java.util.Optional;

public interface UserStorage {
    void saveNewUser(CalculatorUser calculatorUser);
    List<CalculatorUser> getUsersArrayList();
    Optional <CalculatorUser> getOldUserByID(Integer userID);

    Optional <CalculatorUser> getUserByName(String username);

    Optional <CalculatorUser> getUserByNamePassword(String username, String userPassword);
}
