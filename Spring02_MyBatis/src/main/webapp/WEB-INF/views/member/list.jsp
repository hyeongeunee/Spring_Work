<%--
  Created by IntelliJ IDEA.
  User: acorn
  Date: 2023-06-19
  Time: 오후 2:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>views/member/list</title>
</head>
<body>
    <div class="container">
        <a href="/member/insertform">회원추가</a>
        <h1>회원 목록입니다.</h1>
        <table>
            <thead>
                <tr>
                    <th>번호</th>
                    <th>이름</th>
                    <th>주소</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="tmp" items="${list}">
                    <tr>
                        <td>${tmp.num}</td>
                        <td>${tmp.name}</td>
                        <td>${tmp.addr}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
