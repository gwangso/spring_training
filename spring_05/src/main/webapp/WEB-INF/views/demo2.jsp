<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>demo2.jsp</h2>
    <br>
    <form action="/req2" method="post">
        name : <input type="text" name="name">
        <br>
        <br>
        age : <input type="number" name="age">
        <br>
        <br>
        <input type="submit" value="호출">
    </form>
    <hr>
    <a href="/">index</a>

</body>
</html>