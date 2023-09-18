package Servlets;

import Objects.CalcOperation;
import Objects.CalculatorUser;
import Services.OperationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/history")
public class OperationHistoryServlet extends HttpServlet {

    private final OperationService operationService = new OperationService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CalculatorUser calculatorUser = (CalculatorUser) req.getSession().getAttribute("currentUser");

        if(calculatorUser != null){
            List<CalcOperation> operationsHistoryByUser = (List<CalcOperation>) operationService.getJdbcHistory();

            for(CalcOperation operation : operationsHistoryByUser){
                resp.getWriter().println(operation);
            }
        }

    }
}
