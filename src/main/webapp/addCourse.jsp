<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/4/23
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/course/save" method="post">
        <table>
            <tr>
                <td>课程编号：</td>
                <td>
                    <input type="text" name="id"/>
                </td>
            </tr>
            <tr>
                <td>课程名称：</td>
                <td>
                    <input type="text" name="name"/>
                </td>
            </tr>
            <tr>
                <td>课程价格：</td>
                <td>
                    <input type="text" name="price"/>
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
