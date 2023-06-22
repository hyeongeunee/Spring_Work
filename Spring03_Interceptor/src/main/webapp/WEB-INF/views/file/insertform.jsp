<%--
  Created by IntelliJ IDEA.
  User: acorn
  Date: 2023-06-22
  Time: 오후 4:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>views/file/insertform</title>
</head>
<body>
<div class="container">
    <h3>파일 업로드 폼1</h3>
    <form action="/file/upload" method="post" enctype="multipart/form-data">
        제목 <input type="text" name="title"><br>
        첨부파일 <input type="file" name="myFile"><br>
        <button type="submit">업로드</button>
    </form>
</div>
</body>
</html>
