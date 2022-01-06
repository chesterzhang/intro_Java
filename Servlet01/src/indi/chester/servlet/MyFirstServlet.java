package indi.chester.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFirstServlet extends javax.servlet.http.HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("servlet 被创建 ");
    }

    @Override
    public void destroy() {
        System.out.println("servelt 被销毁");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
    }

    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //POST请求,将数据放到协议的请求体中, URL内不可见
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //doGET 请求(默认),可以支持浏览器直接访问,但是参数在URL内可见,不安全,URL参数太多则不合适
//        System.out.println("doGet请求过来了");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("账号 : "+username);
        System.out.println("密码 : "+password);

        PrintWriter writer = response.getWriter();
        if (username.equals("admin") && password.equals("123456")){
            writer.println("OK");
        }else {
            writer.println("Error");
        }
    }

}
