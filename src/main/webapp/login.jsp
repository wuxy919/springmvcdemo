<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/4/24
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>管理员登录</h1>
    <form:form modelAttribute="admin" action="login" method="post">
        学生姓名：<form:input path="name"></form:input><form:errors path="name"></form:errors><br/>
        学生密码：<form:input path="password"></form:input><form:errors path="password"></form:errors><br/>
        <input type="submit" value="提交"/>
    </form:form>
</body>
</html>
