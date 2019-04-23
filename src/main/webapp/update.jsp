<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/4/23
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/course/update" method="post">
    <input type="hidden" name="_method" value="PUT"/>
    <table>
        <tr>
            <td>课程编号：</td>
            <td>
                <input type="text" name="id" value="${course.id}" readonly/>
            </td>
        </tr>
        <tr>
            <td>课程名称：</td>
            <td>
                <input type="text" name="name" value="${course.name}"/>
            </td>
        </tr>
        <tr>
            <td>课程价格：</td>
            <td>
                <input type="text" name="price" value="${course.price}"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="提交" />
            </td>
        </tr>
    </table>
</form>
</body>
</html>
