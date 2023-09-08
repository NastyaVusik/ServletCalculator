import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Scope2")
public class Scope2Servlet extends HelloServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //Application scope
//        String name = (String) getServletContext().getAttribute("name");
//        resp.getWriter().println(name);


        //Session scope
//        String name = (String) req.getSession().getAttribute("name");
//        resp.getWriter().println(name);
        
        
        //Request scope
        String name = (String) req.getAttribute("name");
        resp.getWriter().println(name);


    }
}
