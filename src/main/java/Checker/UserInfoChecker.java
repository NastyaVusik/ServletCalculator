package Checker;

import CalculatorHistory.UserStorage;
import Objects.CalculatorUser;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInfoChecker {
    UserStorage userStorage;

    public UserInfoChecker(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    public UserInfoChecker() {

    }

    private final String regexUsername = "^([^\\s]{1,16})$";
    private final String regexUserPassword = "^(?!.* )(?=.*\\d)(?=.*[A-Z]).{8,15}$";
    private final String regexUserEmail = "^(.+)@(.+)$";




    //Method for checking all new user's parameters required for registration
    public boolean checkRegisterParameters(String username, String userEmail, String userPassword) {
        if (checkUsername(username)
                & checkUserEmail(userEmail)
                & checkUserPassword(userPassword)
                & isUsernameOccupied(username)
                & isUserEmailOccupied(userEmail)) {
            return true;
        } else {
            return false;
        }
    }


    //Method for checking all new user's parameters required for authorisation
    public boolean checkLogInParameters(String username, String userPassword) {
        if (checkUsername(username) & checkUserPassword(userPassword)) {
            return true;
        } else {
            return false;
        }
    }


    //Method for checking a new user's name
    public boolean checkUsername(String username) {
        Pattern pattern = Pattern.compile(regexUsername);
        Matcher nameMatcher = pattern.matcher(username);
        return nameMatcher.matches();
    }

    //Method for checking a new user password
    public boolean checkUserPassword(String userPassword) {
        Pattern pattern = Pattern.compile(regexUserPassword);
        Matcher pasMatcher = pattern.matcher(userPassword);
        return pasMatcher.matches();
    }


    //Method for checking a new email
    public boolean checkUserEmail(String userEmail) {
        Pattern pattern = Pattern.compile(regexUserEmail);
        Matcher emailMatcher = pattern.matcher(userEmail);
        return emailMatcher.matches();
    }


    //Method for checking, if userName is already applied
    public boolean isUsernameOccupied(String username) {

        List<CalculatorUser> calculatorUserList = userStorage.addUsersInfoToArrayList();

        for (int i = 0; i < calculatorUserList.size(); i++) {
            if (calculatorUserList.get(i).getUsername().equalsIgnoreCase(username)) {
                return true;
            }
        }
        return false;
    }


    //Method for checking, if newUserEmail is already applied
    public boolean isUserEmailOccupied(String userEmail) {

        for (int i = 0; i < userStorage.addUsersInfoToArrayList().size(); i++) {

            return (userStorage.addUsersInfoToArrayList().get(i).getUserEmail()).equals(userEmail);
        }
        return false;
    }
}
