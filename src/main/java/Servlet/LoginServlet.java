package Servlet;

import Domain.User;
import UserStorage.InMemoryUserStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/login")           //localhost:8080/login?username=test&password=test
public class LoginServlet extends HttpServlet {

   private final InMemoryUserStorage userStorage = new InMemoryUserStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Optional <User> userByusername = userStorage.findByusername(username);
        System.out.println("\nUser:\n" + userByusername);

        if(userByusername.isPresent()){
            User user = userByusername.get();

            if(user.getPassword().equals(password)){
                req.getSession(true).setAttribute("currentUser", "user");
    resp.sendRedirect("/");
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


