<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>
        안녕하세요
    </title>
</head>
<body>
    <h2>req5.jsp</h2>
    <c:forEach items="${studyList}" var="study">
        <br>
        study = ${study}
        <br>
        p1 = ${study.p1}, p2 = ${study.p2}, p3 = ${study.p3}
        <hr>
    </c:forEach>
</body>
</html>