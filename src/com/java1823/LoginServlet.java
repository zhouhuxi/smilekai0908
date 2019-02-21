package com.java1823;

import com.google.gson.Gson;
import com.java1823.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");

        String user = request.getParameter("user");
        String pass = request.getParameter("pass");

        File file = new File("E:\\User\\" + user + ".json");
        if (!file.exists()) {
            response.getWriter().println("用户末注册");
            return;
        }

        Gson gson = new Gson();
        User userBean = gson.fromJson(new FileReader(file), User.class);

        if (!pass.equals(userBean.getPass())) {
            response.getWriter().println("密码不正确");
            return;
        }

        response.getWriter().println(user + "登录成功");

        Cookie cookie = new Cookie("loginUser", user);
        response.addCookie(cookie);

    }
}
