<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
        안녕하세요
    </title>
</head>
<body>
    <h2>안뇽하세요!</h2>

    <a href="/demo1">demo1으로 이동</a>
    <hr>
    <form action="/demo2" method="post">
        param1: <input value="param1" name="param1">
        <br>
        param2: <input value="param2" name="param2">
        <input type="submit" name="submit">
    </form>
    <hr>
    <form action="/demo3" method="post">
        param1: <input value="param1" name="param1">
        <br>
        param2: <input value="param2" name="param2">
        <input type="submit" name="submit">
    </form>

    <hr>
    <a href="/result1">변수 화면에 출력</a>
    <a href="/result2">DTO 객체 화면에 출력</a>
    <a href="/result3">List 객체 화면에 출력</a>
</body>
</html>
