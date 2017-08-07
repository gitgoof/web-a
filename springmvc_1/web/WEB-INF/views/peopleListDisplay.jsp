<%--
  Created by IntelliJ IDEA.
  User: gaofeng
  Date: 2017/7/25
  Time: 上午11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>People List</title>
</head>
<body>
<table border="1">
    <tr>
        <td>name</td>
        <td>age</td>
        <td>sex</td>
    </tr>
    <c:forEach items="${peoplelist}" var="people">
        <tr>
            <td>${people.name}</td>
            <td>${people.age}</td>
            <td>${people.sex}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
