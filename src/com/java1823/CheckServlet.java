package com.java1823;

import javax.imageio.ImageIO;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "CheckServlet", urlPatterns = "/checkcode")
public class CheckServlet extends HttpServlet {


    @Override
    public void init(ServletConfig config) throws ServletException {



    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 缓存 图片
        BufferedImage img = new BufferedImage(60, 20, BufferedImage.TYPE_INT_RGB);

        // 绘图对象
        Graphics graphics = img.getGraphics();

        Color bgColor = new Color(177, 173, 166); // 构造颜色对象

        graphics.setColor(bgColor); // 设置绘图的颜色

        graphics.fillRect(0, 0, 60, 20);

        String randomCode = "0123456789ABCDEFGHIJKLMN";  // 随机码的一个集合
        Random random = new Random();


        StringBuffer sbuf = new StringBuffer();

        for (int i = 0; i < 4; i++) {

            // 生成随机颜色
            Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
            graphics.setColor(color);
            // 获取随机的字符
            char c = randomCode.charAt(random.nextInt(randomCode.length()));
            sbuf.append(c);

            graphics.drawString(Character.toString(c), i * 15 + 3, 15);
        }

        for (int i = 0; i < 2; i++) {
            Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255), 100);
            graphics.setColor(color);
            int y1 = random.nextInt(20);
            int y2 = random.nextInt(20);
            graphics.drawLine(0, y1, 60, y2);
        }

        // 将验证码存储到session
        HttpSession session = request.getSession();
        session.setAttribute("checkcode", sbuf.toString());


        // 输出图片
        ImageIO.write(img, "png", response.getOutputStream());


    }
}
