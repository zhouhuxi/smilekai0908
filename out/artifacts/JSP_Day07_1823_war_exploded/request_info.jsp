<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/30
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body onload="getAJax()">

<DIV id="test">
</DIV>

<%
%>


<script>

    var ajax;

    function getAJax() {
        // 谷歌 火狐 IE9+
        ajax = new XMLHttpRequest();
        // 回调函数
        ajax.onreadystatechange = ajaxCallback;
        // 设置参数
        ajax.open("get", "info.html", true);
        // 发送请求
        ajax.send();
    }


    function ajaxCallback() {

        if (ajax.readyState == 4) {

            var responseText = ajax.responseText;

            var elementById = document.getElementById("test");

            elementById.innerText = responseText;

        }

    }


    // js对象 与 json字符串互转
    var jsOb = JSON.parse("{\"name\":\"xiaobai\"}");
    alert(jsOb.name);

    // 对象转化成 json字符串
    var toJSON = JSON.stringify(jsOb);
    alert(toJSON)



</script>


</body>
</html>
