<%--
  Created by IntelliJ IDEA.
  User: acorn
  Date: 2023-06-19
  Time: 오후 2:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>views/member/insertform</title>
</head>
<body>
<div class="container">
    <h1>회원 추가 폼입니다.</h1>
    <form action="/member/insert" method="post">
        <div>
            <label for="name">이름</label>
            <input type="text" name="name" id="name"/>
        </div>
        <div>
            <label for="addr">주소</label>
            <input type="text" name="addr" id="addr">
        </div>
        <button type="submit">추가</button>
    </form>
</div>
</body>
</html>
