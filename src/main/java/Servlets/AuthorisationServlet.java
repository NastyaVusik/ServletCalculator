package Servlets;

import Checker.UserInfoChecker;
import Objects.CalculatorUser;
import Services.CalcUserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/login")
public class AuthorisationServlet extends HttpServlet {

    CalcUserService calcUserService = new CalcUserService();
    UserInfoChecker userInfoChecker = new UserInfoChecker();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String userPassword = req.getParameter("userPassword");

        if(userInfoChecker.checkLogInParameters(username, userPassword)){
            Optional<CalculatorUser> userByUsernamePassword = calcUserService.logIn(username, userPassword);
            if(userByUsernamePassword.isPresent()){

                CalculatorUser calculatorUser = userByUsernamePassword.get();
                req.getSession().setAttribute("currentUser", calculatorUser);
                resp.sendRedirect("/");
            }
        }
        else {
            resp.getWriter().println("Enter correct login or password");
        }

    }
}


