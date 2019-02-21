<%@ page import="java.io.InputStream" %>
<%@ page import="java.util.Properties" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/21
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>内置对象</title>
</head>
<body>


<%--<%--%>
    <%--request.setAttribute("name", "小白");--%>
    <%--Object name = pageContext.getAttribute("name", PageContext.REQUEST_SCOPE); // 根据传的域范围取值--%>
    <%--out.print(name + "<br />");--%>
    <%--pageContext.setAttribute("name", "小黑", PageContext.REQUEST_SCOPE);--%>
    <%--out.print(request.getAttribute("name") + "<br />");--%>
    <%--out.print(pageContext.getAttribute("name") + "<br />");--%>
<%--%>--%>




<%="AAAAA"%>
<%
    out.print("BBBBB");
    response.getWriter().print("CCCCC");
    out.print("DDDDD");
%>


</body>
</html>
