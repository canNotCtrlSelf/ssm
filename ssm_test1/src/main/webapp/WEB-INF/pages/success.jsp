<%--
  Created by IntelliJ IDEA.
  User: L
  Date: 2020/3/6
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>执行成功！</h3>
<c:forEach items="${accounts}" var="account">
    ${account.name},${account.money}<br/>
</c:forEach>
</body>
</html>
