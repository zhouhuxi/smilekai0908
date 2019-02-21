<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/21
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>


<form method="post" action="/day07/reg">

    用户：<input type="text" name="user"><br/>
    密码：<input type="password"><br/>
    重复密码：<input type="password" name="pass"><br/>
    手机号：<input type="text" name="phone"><br/>
    验证码：<input type="text" name="checkcode"><img src="/day07/checkcode"/><br/>
    <input type="submit" value="注册">

</form>


</body>
</html>
