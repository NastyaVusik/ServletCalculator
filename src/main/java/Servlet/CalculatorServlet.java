package Servlet;

import Domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")          //localhost:8080/calculator?num1&num2&action
public class CalculatorServlet extends HelloServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User requestAuthor = (User) req.getSession().getAttribute("currentUser");

        Double num1 = Double.parseDouble(req.getParameter("num1"));
        Double num2 = Double.parseDouble(req.getParameter("num2"));
        String action = req.getParameter("action");

        resp.getWriter().println(requestAuthor.getName() + " " + num1 + " " + num2 + " " + action+ "\n");
    }
}
