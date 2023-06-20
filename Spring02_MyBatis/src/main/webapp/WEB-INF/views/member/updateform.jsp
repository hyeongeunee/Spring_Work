<%--
  Created by IntelliJ IDEA.
  User: acorn
  Date: 2023-06-20
  Time: 오후 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>views/member/updateform</title>
</head>
<body>
<div class="container">
    <h1>회원 정보 수정 폼</h1>
    <form action="/member/update" method="post">
        <div>
            <label for="num">번호</label>
            <input type="text" name="num" id="num" value="${dto.num}" readonly/>
        </div>
        <div>
            <label for="name">이름</label>
            <input type="text" name="name" id="name" value="${dto.name}"/>
        </div>
        <div>
            <label for="addr">주소</label>
            <input type="text" name="addr" id="addr" value="${dto.addr}" />
        </div>
        <button type="submit">수정</button>
        <button type="reset">취소</button>
    </form>
</div>
</body>
</html>
