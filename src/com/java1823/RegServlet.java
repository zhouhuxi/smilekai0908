package com.java1823;

import com.google.gson.Gson;
import com.java1823.bean.User;
import netscape.javascript.JSObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

@WebServlet(name = "RegServlet", urlPatterns = "/reg")
public class RegServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");

        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String phone = request.getParameter("phone");

        String checkcode = request.getParameter("checkcode");

        HttpSession session = request.getSession();
        // 判断验证码
        String checkStr = (String) session.getAttribute("checkcode");
        if (!checkStr.equals(checkcode)) {
            response.getWriter().println("验证码出错，请重试");
            return;
        }
        // 判断用户有没有注册过
        File file = new File("E:\\User\\" + user + ".json");
        if (file.exists()) {
            response.getWriter().println("用户已注册，请重试");
            return;
        }

        User userBean = new User();
        userBean.setUser(user);
        userBean.setPass(pass);
        userBean.setPhone(phone);

        // gson的使用
        Gson gson = new Gson();
        String sGson = gson.toJson(userBean);
        System.out.println(sGson);

        FileWriter fos = new FileWriter(file);
        fos.write(sGson);
        fos.close();

        response.getWriter().println("恭喜您，注册成功");
    }
}
