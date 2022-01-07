package indi.chester.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class SetSessionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("name","Jacky");
        String sessionId = session.getId();
        System.out.println("sessionId in SetSessionServlet: "+sessionId);
        request.getRequestDispatcher("/read_session_servlet").forward(request,response);
    }
}
