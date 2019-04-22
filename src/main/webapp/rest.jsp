<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/4/22
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/test/httpPut" method="post">
        <input type="hidden" name="_method" value="PUT" />
        <input type="submit" value="修改" />
    </form>
    <hr/>
    <form action="/test/httpDelete" method="post">
        <input type="hidden" name="_method" value="DELETE" />
        <input type="submit" value="删除" />
    </form>
</body>
</html>
