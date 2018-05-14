<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xanarry
  Date: 18-5-13
  Time: 下午9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>db</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/bootstrap-reboot.min.css">
    <link rel="stylesheet" href="/css/bootstrap-grid.min.css">

    <script src="/js/jquery-3.2.1.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <script src="/js/bootstrap.bundle.min.js"></script>
    <script src="/js/popper.min.js"></script>
</head>
<body>
<div class="container">
    <div class="text-center">
        <h3>数据库操作</h3>
        <hr>
    </div>

    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">name</th>
            <th scope="col">age</th>
            <th scope="col">sex</th>
            <th scope="col">operate</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${userList}" var="user" varStatus="pos">
        <tr>
            <th scope="row">${pos.count}</th>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>${user.sex}</td>
            <td><a href="/database/delete?name=${user.name}">del</a></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>

    <br>

    <form action="/database/add" method="post">
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">姓名</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="name" placeholder="请输入与上述不同名字">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">性别</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="sex">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">年龄</label>
            <div class="col-sm-10">
                <input type="number" class="form-control" name="age">
            </div>
        </div>


        <div class="form-group row">
            <div class="col-sm-10">
                <button type="submit" class="btn btn-primary">添加</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>