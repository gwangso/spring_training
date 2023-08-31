<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>
        안녕하세요
    </title>
</head>
<body>
    <h2>result3.jsp</h2>
    controller에서 담아온 demoDTOList값 출력
    <c:forEach items="${demoList}" var="demo">
        <br>
        param1 : ${demo.param1}
        <br>
        param2 : ${demo.param2}
        <br>
    </c:forEach>
</body>
</html>