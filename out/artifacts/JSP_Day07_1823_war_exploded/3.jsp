<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/21
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP标签</title>
</head>
<body>


<%--
jsp:forward  转发功能
jsp:param 传递参数
jsp:include 动态包含

    静态包含：最后的结果是一个java文件
    动态包含：包含几个页面，还是有几个java文件

--%>

<%--<jsp:forward page="1.jsp">--%>
    <%--<jsp:param name="test" value="VVVVVVVVVV" />--%>
<%--</jsp:forward>--%>

<%--<%--%>
    <%--request.getRequestDispatcher("login.jsp").forward(request, response);--%>
<%--%>--%>


<jsp:include page="3_head.jsp"></jsp:include>
<jsp:include page="3_body.jsp"></jsp:include>
<h1>我是Foot网页</h1>





</body>
</html>
