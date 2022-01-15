package indi.chester.filter;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;


public class MyFilter implements Filter {



    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>当前请求被拦截</h1>");

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
