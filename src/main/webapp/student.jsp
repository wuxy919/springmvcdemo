<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/4/24
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>修改学生信息</h1>
    <form:form modelAttribute="student" action="login" method="post">
        学生姓名：<form:input path="name"/><form:errors path="name"/><br/>
        学生年龄：<form:input path="age"/><form:errors path="age"/><br/>
        <input type="submit" value="修改"/>
    </form:form>
</body>
</html>
