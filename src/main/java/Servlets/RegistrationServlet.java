package Servlets;


import CalculatorHistory.UserStorage;
import Checker.UserInfoChecker;
import Objects.CalculatorUser;
import Services.CalcUserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//localhost:8080/reg?username=test&userEmail=test@mail.ru&userPassword=Test12345!

@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {

    CalcUserService calcUserService = new CalcUserService();

    UserStorage userStorage;
    UserInfoChecker userInfoChecker = new UserInfoChecker(userStorage);

//    public RegistrationServlet(UserStorage userStorage){
//        this.userStorage = userStorage;
//        this.userInfoChecker = new UserInfoChecker(userStorage);
//    }

//    public RegistrationServlet(UserInfoChecker userInfoChecker){
//        this.userInfoChecker = userInfoChecker;
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String userEmail = req.getParameter("userEmail");
        String userPassword = req.getParameter("userPassword");

        calcUserService.createNewUser(username, userEmail, userPassword);

        if (userInfoChecker.checkRegisterParameters(username, userEmail, userPassword)){
            resp.getWriter().println("Your registration data is wrong or user with this data was already registered.\n" +
                    "Please, try again...");
        }
        else{
        calcUserService.createNewUser(username, userEmail, userPassword);
            resp.sendRedirect("/login");
        }
    }
}
