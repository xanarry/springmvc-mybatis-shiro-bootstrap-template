<%--
  Created by IntelliJ IDEA.
  User: xanarry
  Date: 18-5-11
  Time: 下午8:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form</title>
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
        <h3>表单提交</h3>
    </div>
    <form action="/submit3" method="post">
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">姓名</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="name" placeholder="name">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">年龄</label>
            <div class="col-sm-10">
                <input type="number" class="form-control" name="age" placeholder="age">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">邮箱</label>
            <div class="col-sm-10">
                <input type="email" class="form-control" name="email" placeholder="Email">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">密码</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" name="password" placeholder="Password">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">性别</label>
            <div class="col-sm-10">
                <div class="form-check form-check-inline">
                    <input class="form-check-input" style="margin-left: 0" type="radio" name="sex" value="男" checked>
                    <label class="form-check-label">男</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" style="margin-left: 0" type="radio" name="sex" value="女">
                    <label class="form-check-label">女</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" style="margin-left: 0" type="radio" name="sex" value="其他">
                    <label class="form-check-label">其他</label>
                </div>
            </div>
        </div>
        <div class="form-group row">
            <div class="col-sm-2">爱好</div>
            <div class="col-sm-10">
                <div class="form-check form-check-inline">
                    <input class="form-check-input" style="margin-left: 0" type="checkbox" name="hobby" value="看书">
                    <label class="form-check-label">看书</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" style="margin-left: 0" type="checkbox" name="hobby" value="看电影">
                    <label class="form-check-label">看电影</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" style="margin-left: 0" type="checkbox" name="hobby" value="运动">
                    <label class="form-check-label">运动</label>
                </div>
            </div>
        </div>

        <div class="form-group row">
            <label class="col-sm-2 col-form-label">出生地</label>
            <div class="col-sm-10">
                <select class="form-control" name="address">
                    <option selected>北京</option>
                    <option>上海</option>
                    <option>天津</option>
                    <option>重庆</option>
                </select>
            </div>
        </div>


        <div class="form-group row">
            <div class="col-sm-10">
                <button type="submit" class="btn btn-primary">提交</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>