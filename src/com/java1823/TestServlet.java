package com.java1823;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TestServlet", urlPatterns = "/test", loadOnStartup = 1,
        initParams = {
                @WebInitParam(name = "test", value = "testVVVVVV")
        }
)
public class TestServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet inited");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("<H1>test</H1>");
        String test = getServletConfig().getInitParameter("test");
        response.getWriter().println(test);
    }

}
