<%--
  Created by IntelliJ IDEA.
  User: Lucas_mai
  Date: 2021/4/20
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>开始使用 layui</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css">
</head>
<body>

<!-- 你的 HTML 代码 -->

<script src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
<script>
    layui.use(['layer', 'form'], function(){
        var layer = layui.layer
            ,form = layui.form;

        layer.msg('Hello World');
    });
</script>
</body>
</html>