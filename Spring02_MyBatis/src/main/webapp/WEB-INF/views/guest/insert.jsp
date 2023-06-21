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
    <title>views/guest/insert</title>
</head>
<body>
    <script>
        alert("${param.writer}님이 작성한 방명록이 저장되었습니다.");
        location.href="/guest/list";
    </script>
</body>
</html>
