package indi.chester.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadCookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cs = request.getCookies();
        for (Cookie c : cs){
            System.out.println("name : "+c.getName()+", value : "+c.getValue());
            break;
        }
        PrintWriter writer = response.getWriter();
        writer.println("Read cookie ! ");
    }
}
