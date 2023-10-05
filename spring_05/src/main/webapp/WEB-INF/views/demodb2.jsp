<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>demodb2.jsp</h2>
    <table>
        <th>id</th>
        <th>name</th>
        <th>age</th>
        <c:forEach items="${demoList}" var="demo">
        <tr>
            <td>
                <a href="/find?id={demo.id}">${demo.id}</a>
            </td>
            <td>${demo.name}</td>
            <td>${demo.age}</td>
        </tr>
        </c:forEach>
    </table>
    <br>
    <a href="/demodb1">demodb1</a>
    <br>
    <a href="/">index</a>
</body>
</html>