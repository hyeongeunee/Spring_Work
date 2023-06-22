<jsp:useBean id="dto" scope="request" type="com.gura.spring.guest.dto.GuestDto"/>
<%--
  Created by IntelliJ IDEA.
  User: acorn
  Date: 2023-06-21
  Time: 오전 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>views/guest/updateform</title>
</head>
<body>
<div class="container">
    <h1>게시글 수정 폼</h1>
    <form action="/guest/update" method="post">
        <div>
            <label for="num">번호</label>
            <input type="text" name="num" id="num" value="${dto.num}" readonly/>
        </div>
        <div>
            <label for="writer">작성자</label>
            <input type="text" name="writer" id="writer" value="${dto.writer}"/>
        </div>
        <div>
            <label for="content">내용</label>
            <textarea name="content" id="content" cols="30" rows="10">${dto.content}</textarea>
        </div>
        <div>
            <label for="pwd">비밀번호</label>
            <input type="text" name="pwd" id="pwd" value="${dto.pwd}">
        </div>
        <button type="submit">수정</button>
        <button type="reset">취소</button>
    </form>
</div>
</body>
</html>
