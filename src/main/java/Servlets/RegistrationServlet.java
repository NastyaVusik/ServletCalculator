package Servlets;


import Services.CalcUserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {

    CalcUserService calcUserService = new CalcUserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String userEmail = req.getParameter("userEmail");
        String userPassword = req.getParameter("userPassword");

        calcUserService.createNewUser(username, userEmail, userPassword);

        resp.sendRedirect("/");
    }
}
