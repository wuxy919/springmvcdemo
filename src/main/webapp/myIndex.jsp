<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/4/24
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div><spring:message code="currentlanguage" />：${pageContext.response.locale}</div>
    <spring:message code="changelanguage"></spring:message>：
    <a href="?lang=zh_CN"><spring:message code="language.cn"></spring:message></a>
    <a href="?lang=en_US"><spring:message code="language.en"></spring:message></a>
    <h1><spring:message code="info"></spring:message></h1>
    <form>
        <spring:message code="username"></spring:message>:<input type="text" /><br/>
        <spring:message code="password"></spring:message>:<input type="password" /><br/>
        <spring:message code="repassword"></spring:message>:<input type="password" /><br/>
        <spring:message code="tel"></spring:message>:<input type="text" /><br/>
        <spring:message code="email"></spring:message>:<input type="text" /><br/>
        <input type="submit" value="<spring:message code="submit"/>"/>
        <input type="reset" value="<spring:message code="reset"/>"/>
    </form>
</body>
</html>
