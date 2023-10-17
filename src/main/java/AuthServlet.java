import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/login")
public class AuthServlet extends HttpServlet {

    UserService userService = new UserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Optional <User> userByUsername = userService.findByUsername(username);

        if(userByUsername.isPresent()){
            User user = userByUsername.get();

            if(user.getPassword().equals(password)){
                req.getSession().setAttribute("currentUser", user);
                resp.sendRedirect("/");
            }
            else {
                resp.sendError(400, "Wrong password!");
            }
        }
        else{
            resp.sendError(400, "user isn't found!");
        }

    }
}
