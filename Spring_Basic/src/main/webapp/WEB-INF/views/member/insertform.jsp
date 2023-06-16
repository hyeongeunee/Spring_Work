<%--
  Created by IntelliJ IDEA.
  User: acorn
  Date: 2023-06-16
  Time: 오후 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insertform</title>
</head>
<body>
<div class="container">
    <h1>회원추가 폼</h1>
    <form action="/member/insert" method="post">
        번호 <input type="text" name="num"/> <br>
        이름 <input type="text" name="name"/> <br>
        주소 <input type="text" name="addr"/> <br>
        <button type="submit">추가</button>
    </form>

    <form action="/member/insert2" method="post">
        번호 <input type="text" name="num"/> <br>
        이름 <input type="text" name="name"/> <br>
        주소 <input type="text" name="addr"/> <br>
        <button type="submit">추가</button>
    </form>

    <h1>회원추가 폼</h1>
    <form action="/member/insert3" method="post">
        번호 <input type="text" name="num"/> <br>
        이름 <input type="text" name="name"/> <br>
        주소 <input type="text" name="addr"/> <br>
        <button type="submit">추가</button>
    </form>

</div>
</body>
</html>
