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
    <title>views/guest/update</title>
</head>
<body>
<script>
    alert("${param.writer}님의 글을 수정했습니다!");
    //javascript 를 이용해서 페이지 이동시키기(리다일렉트 이동)
    location.href="/guest/list";
</script>
</body>
</html>
