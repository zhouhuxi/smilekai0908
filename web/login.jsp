<%@ page import="com.java1823.utils.CookieUtil" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/21
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>


<%
    // loginUser
    // 用户登录信息存储到本地
    Cookie[] cookies = request.getCookies();
    Cookie userCookie = CookieUtil.getCookieByName(cookies, "loginUser");

    // 如果登录用户的Cookie信息为空
    if (userCookie == null) {
%>
<form method="post" action="/day07/login">
    用户：<input type="text" name="user"><br/>
    密码：<input type="password" name="pass"><br/>
    <input type="submit" value="登录">
    <a href="/day07/reg.jsp">注册</a>
</form>
<%
} else { // 表示用户登录了， 显示用户信息
    String value = userCookie.getValue();
%>
<%=value%>已登录
<%
    }
%>


</body>
</html>
