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
    <title>views/guest/insertform</title>
</head>
<body>
<div class="container">
    <h1>게시글 작성 폼입니다.</h1>
    <form action="/guest/insert" method="post">
        <div>
            <label for="writer">작성자</label>
            <input type="text" name="writer" id="writer"/>
        </div>
        <div>
            <label for="content">내용</label>
            <textarea name="content" id="content" cols="30" rows="10"></textarea>
        </div>
        <div>
            <label for="pwd">비밀번호</label>
            <input type="text" name="pwd" id="pwd"/>
        </div>
        <button type="submit">추가</button>
    </form>
</div>
</body>
</html>
