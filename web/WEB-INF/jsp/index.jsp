<%--
  Created by IntelliJ IDEA.
  User: xanarry
  Date: 18-5-11
  Time: 下午8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>

    <script src="/js/jquery-3.2.1.min.js"></script>
    <script>
        function requestJson() {
            $.ajax({
                type: 'post',
                url: '/requestJson',
                data: {name: "abc"},
                dataType: "json",
                success: function (data) {
                    $("#result").html("OK: " + JSON.stringify(data));
                },
                error: function (data) {
                    $("#result").html("FAILED: " + JSON.stringify(data));
                }

            })
        }
    </script>
</head>
<body>
<h3>用户: [${cookie.get('name').value}] 已经登录 <a href="/logout">退出</a></h3>
<hr>
<a href="/form">表单</a><br>
<a href="/file-upload">文件上传</a><br>
<a href="/login">登录</a><br>
<a href="/database/display">显示数据库数据(登录后可访问)</a><br>
<a href="/getparam?name=xiong&age=24&address=china">get发送参数</a><br>
<a href="/pathvariable/user/yang/24/chongqing">发送pathvariable参数</a><br>
<a href="/transaction">执行事务</a>
<button onclick="requestJson()">ajax请求json</button><br>
<textarea id="result"></textarea>
</body>
</html>
