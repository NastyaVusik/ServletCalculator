package Servlet;

import Domain.User;
import UserStorage.InMemoryUserStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/reg")         //localhost:8080/reg?name=Test&username=test&password=test
//public class CalcRegistrationServlet extends HttpServlet {
//
//    private final InMemoryUserStorage userStorage = new InMemoryUserStorage();
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("name");
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//
//        User user = new User(name, username, password);
//        userStorage.save(user);
//
//        resp.getWriter().println("Registration was successful!");
//        resp.sendRedirect("/");
//
//    }
//}


@WebServlet("/reg") // localhost:8080/reg?name=Test&username=test&password=test
public class RegistrationServlet extends HttpServlet {

    private final InMemoryUserStorage storage = new InMemoryUserStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = new User(name, username, password);
        storage.save(user);

        resp.sendRedirect("/");
    }
}

