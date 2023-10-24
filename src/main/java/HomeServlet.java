import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.Date;
import java.util.Optional;

@WebServlet("/")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String myName = req.getParameter("name");
        String myFlag = req.getParameter("flag");

        List<String> stringList = List.of("Tom1", "Tom2", "Tom3", "Tom4", "Tom5", "Tom6");
        req.setAttribute("users", stringList);
        req.setAttribute("date", new Date());

        req.setAttribute("name", myName);
        req.setAttribute("flag", myFlag);


        getServletContext().getRequestDispatcher("/pages/home.jsp").forward(req, resp);


    }
}
