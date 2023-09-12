package Servlet;

import Domain.User;
import UserStorage.InMemoryUserStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/reg")         //localhost:8080/reg?name=Test&userName=test&password=test
public class CalcRegistrationServlet extends HttpServlet {

    InMemoryUserStorage userStorage = new InMemoryUserStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        User user = new User(name, userName, password);
        userStorage.save(user);
//        resp.getWriter().println("Registration was successful!");

        resp.sendRedirect("/");

    }
}
