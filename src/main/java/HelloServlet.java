import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class HelloServlet extends HttpServlet {

    private final GreetingStorage greetingStorage = new GreetingStorage();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       User name = (User) req.getSession().getAttribute("currentUser");

       if(name != null){
           resp.getWriter().println("<h1Hello, >" + name + "<!/h1>");
       }
       else {
           resp.getWriter().println("<h1Hello, Guest!></h1>");
       }
//        String name = req.getParameter("name");
//        greetingStorage.save(name);
//
//        resp.getWriter().println("<h1>Hello," +  name + "!!!<h1>");


    }
}
