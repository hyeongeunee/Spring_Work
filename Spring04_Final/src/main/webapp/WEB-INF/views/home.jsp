<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <style>
        ul > li {
            margin-bottom: 0.5rem;
        }
    </style>
</head>
<body>
<div class="container">
    <c:choose>
        <c:when test="${empty sessionScope.id}">
            <a href="/users/loginform">로그인</a>
            <a href="/users/signup_form">회원가입</a>
        </c:when>
        <c:otherwise>
            <p>
                <a href="/users/info">${id}</a> 로그인중...
                <a href="/users/logout">로그아웃</a>
            </p>
        </c:otherwise>
    </c:choose>

    <h1>인덱스 페이지입니다.</h1>

    <h2>공지사항</h2>
    <ul>
        <c:forEach var="tmp" items="${requestScope.noticeList}">
            <li>${tmp}</li>
        </c:forEach>
    </ul>
</div>
</body>
</html>