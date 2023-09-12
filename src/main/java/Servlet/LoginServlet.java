package Servlet;

import Domain.User;
import UserStorage.InMemoryUserStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/login")           //localhost:8080/login?userName=test&password=test
public class LoginServlet extends HelloServlet{

    InMemoryUserStorage userStorage = new InMemoryUserStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        Optional <User> userByUserName = userStorage.findByUserName(userName);

        if(userByUserName.isPresent()){
            User user = userByUserName.get();
            if(user.getPassword().equals(password)){
                req.getSession().setAttribute("currentUser", "user");
            }
            else {
                resp.getWriter().println("Password isn't correct!");
            }

        }
        else {
            resp.getWriter().println("This user isn't found!");
        }

    }
}
