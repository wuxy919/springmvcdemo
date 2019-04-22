<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/4/22
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/data/setType" method="post">
        用户1ID：<input type="text" name="userSet[0].id"><br/>
        用户1姓名：<input type="text" name="userSet[0].name"><br/>
        用户2ID：<input type="text" name="userSet[1].id"><br/>
        用户2姓名：<input type="text" name="userSet[1].name"><br/>
        用户3ID：<input type="text" name="userSet[2].id"><br/>
        用户3姓名：<input type="text" name="userSet[2].name"><br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
