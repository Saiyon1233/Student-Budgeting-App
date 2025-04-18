package servlet;

import business.UserBusiness;
import helper.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = UserBusiness.loginUser(email, password);
        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("username", user.getEmail());
            response.sendRedirect("frontpageWithLogin.jsp"); // Redirect to logged-in page
        } else {
            response.sendRedirect("frontpageWithoutLogin.jsp"); // Redirect to login page
        }
    }
}
