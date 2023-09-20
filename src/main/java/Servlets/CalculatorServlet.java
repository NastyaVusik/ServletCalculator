package Servlets;

import Objects.CalcOperation;
import Objects.CalculatorUser;
import Services.CalcUserService;
import Services.OperationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {

    private  final OperationService operationService = new OperationService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CalculatorUser author = (CalculatorUser) req.getSession().getAttribute("currentUser");

        if (author != null) {
            Double num1 = Double.parseDouble(req.getParameter("num1"));
            Double num2 = Double.parseDouble(req.getParameter("num2"));
            String action = req.getParameter("action");

            CalcOperation calcOperation = new CalcOperation(num1, num2, action, author);

            CalcOperation result = operationService.calculateResult(calcOperation, author);

            resp.getWriter().println(result.toString());
        }
        else {
            resp.getWriter().println("<h1>You have to logIn to use calculator<h1>");
        }


    }
}
