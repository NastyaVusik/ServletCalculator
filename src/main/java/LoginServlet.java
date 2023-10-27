import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
   private final InMemoryUserStorage inMemoryUserStorage  = new InMemoryUserStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
getServletContext().getRequestDispatcher("/pages/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Optional <User> userByUsername = inMemoryUserStorage.findByUsername(username);
        if(userByUsername.isPresent()){
User user = userByUsername.get();

            if (user.getPassword().equals(password)) {
                req.getSession().setAttribute("currentUser", user);
                req.setAttribute("message", "Registration was successful!");
                resp.sendRedirect("/");
                return;
            }
            else {
                req.setAttribute("message", "Password is wrong!");
            }
        }
        else {
            req.setAttribute("message", "User isn't found!");
        }
        getServletContext().getRequestDispatcher("/pages/login.jsp").forward(req, resp);
    }
}
