package com.huayutech.servlet;



import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet4 extends HttpServlet   {
    private static final long serialVersionUID = -4186518845701003231L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet4");
        resp.setContentType("text/html");
        resp.getWriter().write("Servlet4");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Servlet4 loadOnStart");
    }

}
