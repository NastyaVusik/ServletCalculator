package CalculatorHistory;

import Objects.CalculatorUser;

import java.util.List;
import java.util.Optional;

public interface SaveNewUser {
    void saveNewUser(CalculatorUser calculatorUser);
    List<CalculatorUser> addUsersInfoToArrayList();
    CalculatorUser getOldUserByID(Integer userID);

    Optional<CalculatorUser> getUserByName(String userName);
}
