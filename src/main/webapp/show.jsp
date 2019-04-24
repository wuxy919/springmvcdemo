<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/4/24
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>修改学生信息</h1>
    <form action="" method="post">
        学生编号：<input type="text" name="id" value="${requestScope.student.id}"/><br/>
        学生姓名：<input type="text" name="name" value="${requestScope.student.name}"/><br/>
        学生年龄：<input type="text" name="age" value="${requestScope.student.age}"/><br/>
        学生性别：<input type="text" name="gender" value="${requestScope.student.gender}"/><br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
