<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/4/23
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="upload" method="post" enctype="multipart/form-data">
        <input type="file" name="img" />
        <input type="submit" name="上传" />
    </form>
    <c:if test="${requestScope.filePath != null}">
        <h1>上传的图片</h1>
        <img width="300px" src="${requestScope.filePath}" />
    </c:if>
</body>
</html>
