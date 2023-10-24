import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/reg")
//public class RegServlet extends HttpServlet {
//    private final InMemoryUserStorage inMemoryUserStorage = new InMemoryUserStorage();
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//getServletContext().getRequestDispatcher("/pages/reg.jsp").forward(req, resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("name");
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        String role = req.getParameter("role");
//
//        User user = new User(name, username, password, role);
//        inMemoryUserStorage.save(user);
//        resp.sendRedirect("/");
//
//        }
//    }




@WebServlet("/reg")
public class RegServlet extends HttpServlet {

    private final InMemoryUserStorage storage = new InMemoryUserStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/reg.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String role = req.getParameter("role");

        User user = new User(name, username, password, role);
        storage.save(user);
        resp.sendRedirect("/");
    }
}

