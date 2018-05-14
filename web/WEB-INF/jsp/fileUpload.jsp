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

<body>
<div class="container">
    <div class="text-center">
        <h3>文件上传</h3>
    </div>
    <form action="/file-upload" method="post" enctype="multipart/form-data">
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">普通文件</label>
            <div class="col-sm-10">
                <input type="file" class="form-control" name="file">
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">照片</label>
            <div class="col-sm-10">
                <input type="file" class="form-control" name="image">
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