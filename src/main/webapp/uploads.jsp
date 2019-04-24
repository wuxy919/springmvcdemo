<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/4/23
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="uploads" method="post" enctype="multipart/form-data">
        图片1：<input type="file" name="img"/><br/>
        图片2：<input type="file" name="img"/><br/>
        图片3：<input type="file" name="img"/><br/>
        <input type="submit" value="上传"/>
    </form>
    <c:if test="${requestScope.filePaths != null}">
        <h1>上传的图片：</h1>
        <c:forEach items="${requestScope.filePaths}" var="filePath">
            <img src="${filePath}" width="300px">
        </c:forEach>
    </c:if>
</body>
</html>
