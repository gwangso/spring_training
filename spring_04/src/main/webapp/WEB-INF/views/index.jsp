<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
        안녕하세요
    </title>
</head>
<body>
    <h2>index.jsp</h2>
    <a href="/req1">req1</a>
    <hr>
    <a href="/req2?q1=안녕&q2=1234">req2</a>
    <hr>
    <form action="/req3" method="post">
        p1: <input type="text" name="p1">
        <br>
        p2: <input type="number" name="p2">
        <br>
        p3: <input type="text" name="p3">
        <input type="submit" value="전송">
    </form>
    <hr>
    <a href="/req4">req4</a>
    <hr>
    <a href="/req5">req5</a>

</body>
</html>