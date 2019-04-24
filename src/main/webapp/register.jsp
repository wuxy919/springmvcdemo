<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/4/24
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>用户注册</h1>
    <form:form modelAttribute="user2" action="register" method="post">
        用户名：<form:input path="username"></form:input><form:errors path="username"></form:errors><br/>
        密码：<form:input path="password"></form:input><form:errors path="password"></form:errors><br/>
        邮箱：<form:input path="email"></form:input><form:errors path="email"></form:errors><br/>
        电话：<form:input path="phone"></form:input><form:errors path="phone"></form:errors><br/>
        <input type="submit" value="提交"/>
    </form:form>
</body>
</html>
