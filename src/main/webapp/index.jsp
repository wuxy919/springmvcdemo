<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>index</title>
</head>
<body>
    <table>
        <tr>
            <th>课程编号</th>
            <th>课程名称</th>
            <th>课程价格</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${requestScope.list}" var="course">
            <tr>
                <td>${course.id}</td>
                <td>${course.name}</td>
                <td>${course.price}</td>
                <td>
                    <a href="/course/find/${course.id}">修改</a>
                    <form action="/course/delete/${course.id}" method="post">
                        <input type="hidden" name="_method" value="DELETE">
                        <input type="submit" value="删除">
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="/addCourse.jsp">添加课程</a>
</body>
</html>
