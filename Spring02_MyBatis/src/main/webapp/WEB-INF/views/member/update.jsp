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
    <title>views/member/update</title>
</head>
<body>
<script>
    alert("${param.num}번 회원의 정보를 수정했습니다!");
    //javascript 를 이용해서 페이지 이동시키기(리다일렉트 이동)
    location.href="/member/list";
</script>
</body>
</html>
