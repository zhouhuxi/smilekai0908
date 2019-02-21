<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/21
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编码问题</title>
</head>
<body>

<%

    String test = request.getParameter("test");
    out.println(test);
    out.print("<br />");
    // tomcat 默认编码是 iso-8859-1
    // 转码工作
    // 得到iso-8859-1的编码
    byte[] bytes = test.getBytes("iso-8859-1");
    // 转换到 utf-8的编码
    String newStr = new String(bytes, "utf-8");
    out.println(newStr);

%>


</body>
</html>
