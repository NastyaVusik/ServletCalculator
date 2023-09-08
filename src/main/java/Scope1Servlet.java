import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Scope1")
public class Scope1Servlet extends HelloServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //Application scope
//        getServletContext().setAttribute("name", "Scope");
//        getServletContext().removeAttribute("name");


        //Session scope
//        req.getSession().setAttribute("name", "Test");


        //Request scope
        req.setAttribute("name", "Hi, Test!!!");
        req.getRequestDispatcher("/Scope2").forward(req, resp);
    }
}
