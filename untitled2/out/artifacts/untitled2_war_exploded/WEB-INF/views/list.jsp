<%--
  Created by IntelliJ IDEA.
  User: zzazz
  Date: 2023-02-24
  Time: 오후 3:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> 리스트 입니다. </h1>
<table>
    <tr>
        <th>seq</th>
        <th>category</th>
        <th>title</th>
        <th>writer</th>
        <th>date</th>
    </tr>
    <c:forEach var="board" items="${list}">
    <tr>
        <th>${board.seq}</th>
        <th>${board.category}</th>
        <th>${board.title}</th>
        <th>${board.writer}</th>
        <th><fmt:formatDate value="${board.regdate}" pattern="yyyy-MM-dd"/></th>

    </tr>
    </c:forEach>

</table>


</body>
</html>

