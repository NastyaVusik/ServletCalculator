import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/hello", loadOnStartup = 1)
public class HelloServlet extends HttpServlet {
   @Override
    public void init() throws ServletException{

//       try {
//           Thread.sleep(5000);
//       } catch (InterruptedException e) {
//           throw new RuntimeException(e);
//       }
       System.out.println("Hello, servlet!");
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       super.service(request, response);
       System.out.println("Servlet work");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Servlet died");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        System.out.println("Hello, World!!!");
//        resp.getWriter().println("Hello, World!!!");

        String name = req.getParameter("myName");
        resp.getWriter().println("<h1><i>Hello " + name + " !</i></h1>");           //http://localhost:8080/hello?myName=Nastya

    }
}
