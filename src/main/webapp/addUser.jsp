<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/4/22
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/test/add" method="post">
    <table>
        <tr>
            <td>编号：</td>
            <td>
                <input type="text" name="id">
            </td>
        </tr>
        <tr>
            <td>姓名：</td>
            <td>
                <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td>地址：</td>
            <td>
                <input type="text" name="address.name">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
