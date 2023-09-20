import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//localhost:8080/reg?name=Tom1&username=tom1&password=tom1
@WebServlet("/reg")
public class RegServlet extends HttpServlet {

    private final UserService userService = new UserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        userService.createUser(name, username, password);
        resp.getWriter().println("<h1>Registration was successful<h1>");
//resp.sendRedirect("/");
    }
}
