package Servlets;

import Objects.CalculatorUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class HelloUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CalculatorUser username = (CalculatorUser) req.getSession().getAttribute("currentUser");

        if(username != null){
            resp.getWriter().println("<h1>Hello, dear " + username + "!</h1>");
        }
        else {
            resp.getWriter().println("<h1>This user isn't exist...</h1>");
            resp.getWriter().println("<h2 Hello, Guest!>");
        }

    }
}
