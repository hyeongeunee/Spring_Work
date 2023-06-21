<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>views/guest/list</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
        }
        h2 {
            text-align: center;
            font-size: 2rem;
            font-weight: 400;
            line-height: 1.167;
            letter-spacing: 0.00735em;
        }
        table {
            width: 100%;
            margin-top: 16px;
            border-collapse: collapse;
        }
        th {
            color: rgba(0, 0, 0, 0.54);
            font-size: 0.75rem;
            font-weight: 500;
            line-height: 1.6;
            letter-spacing: 0.00714em;
            text-transform: uppercase;
            padding: 16px;
            text-align: left;
            border-bottom: 1px solid rgba(224, 224, 224, 1);
        }
        td {
            color: rgba(0, 0, 0, 0.87);
            font-size: 0.875rem;
            font-weight: 400;
            line-height: 1.43;
            letter-spacing: 0.01071em;
            padding: 16px;
            text-align: left;
            border-bottom: 1px solid rgba(224, 224, 224, 1);
        }
        button {
            font-family: 'Roboto', sans-serif;
            font-weight: 500;
            line-height: 1.75;
            letter-spacing: 0.02857em;
            text-transform: uppercase;
            color: rgba(0, 0, 0, 0.87);
            padding: 6px 16px;
            font-size: 0.875rem;
            box-shadow: 0px 2px 3px -1px rgba(0,0,0,0.2), 0px 3px 1px -2px rgba(0,0,0,0.2), 0px 1px 8px 0px rgba(0,0,0,0.2);
            background-color: #e0e0e0;
            border: none;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        button:hover {
            background-color: #d5d5d5;
        }
        textarea {
            width: 100%;
            resize: none;
            border: 1px solid rgba(0, 0, 0, 0.23);
            padding: 6px 12px;
            font-size: 0.875rem;
            line-height: 1.43;
            color: rgba(0, 0, 0, 0.87);
            transition: border-color 0.2s ease;
        }
        textarea:focus {
            border-color: #1976d2;
            outline: none;
        }
    </style>

</head>
<body>
<div class="container">
    <h2>게시글 목록</h2>
    <a href="/guest/insertform">새 글 작성</a>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>번호</th>
            <th>작성자</th>
            <th>내용</th>
            <th>등록일</th>
            <th>삭제</th>
            <th>수정</th>
        </tr>
        </thead>
        <tbody>
        <%-- requestScope.list --%>
        <c:forEach var="tmp" items="${list}">
            <tr>
                <td>${tmp.num}</td>
                <td>${tmp.writer}</td>
                <td><textarea rows="5">${tmp.content}</textarea></td>
                <td>${tmp.regdate}</td>
                <td>
                    <form action="delete" method="post">
                        <input type="hidden" name="num" value="${tmp.num}"/>
                        <input type="password" name="pwd" placeholder="비밀번호 입력..."/>
                        <button type="submit">삭제</button>
                    </form>
                </td>
                <td><a href="updateform?num=${tmp.num}">수정</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"/>
</body>
</html>
