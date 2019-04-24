<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/4/24
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>修改学生信息</h1>
    <form:form  modelAttribute="student" method="post">
        学生编号：<form:input path="id"></form:input><br/>
        学生姓名：<form:input path="name"></form:input><br/>
        学生密码：<form:password path="password"></form:password><br/>
        学生年龄：<form:input path="age"></form:input><br/>
        学生性别：<form:input path="gender"></form:input><br/>
        学生地址：<form:input path="address.name"></form:input><br/>
        checkbox:<form:checkbox path="flag"></form:checkbox><br/>
        学生爱好1：<form:checkbox path="hobby" value="读书"></form:checkbox>读书
        <form:checkbox path="hobby" value="看电影"></form:checkbox>看电影
        <form:checkbox path="hobby" value="旅行"></form:checkbox>旅行
        <form:checkbox path="hobby" value="打游戏"></form:checkbox>打游戏
        <form:checkbox path="hobby" value="听音乐"></form:checkbox>听音乐<br/>
        学生爱好2：<form:checkbox path="hobbys" value="读书"></form:checkbox>读书
        <form:checkbox path="hobbys" value="看电影"></form:checkbox>看电影
        <form:checkbox path="hobbys" value="旅行"></form:checkbox>旅行
        <form:checkbox path="hobbys" value="打游戏"></form:checkbox>打游戏
        <form:checkbox path="hobbys" value="听音乐"></form:checkbox>听音乐<br/>
        学生爱好3：<form:checkboxes path="selectHobby" items="${requestScope.student.hobbys}"></form:checkboxes><br/>
        学生性别：<form:radiobutton path="rodioId" value="1"></form:radiobutton>男
        <form:radiobutton path="rodioId" value="0"></form:radiobutton>女<br/>
        年级组：<form:radiobuttons path="selectGrade" items="${requestScope.student.gradeMap}"></form:radiobuttons><br/>
        <%--城市：<form:select path="selectCity" items="${requestScope.student.cityMap}"></form:select><br/>--%>
        城市：
        <form:select path="selectCity">
            <form:option value="1">北京</form:option>
            <form:option value="2">上海</form:option>
            <form:option value="3">广州</form:option>
            <form:option value="4">深圳</form:option>
            <form:option value="5">杭州</form:option>
            <form:option value="6">西安</form:option>
        </form:select><br/>
        <%--文本域：<form:textarea path="introduce"/><br/>--%>
        <form:hidden path="introduce"/><br/>
        <input type="submit" value="提交"/>
    </form:form>
</body>
</html>
