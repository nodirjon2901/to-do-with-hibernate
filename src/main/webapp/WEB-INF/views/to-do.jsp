<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Nodirjon
  Date: 26/02/2024
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>To Dos</title>
    <link rel="stylesheet" href="<c:url value="/styles/table.css" />">
    <link rel="stylesheet" href="<c:url value="/styles/modal.css" />">
</head>
<body>
<h1 style="text-align: center">This is your todos list</h1>
<form style="text-align: center" action="${pageContext.request.contextPath}/to-do/add" method="post">
    <input type="text" name="title" placeholder="title">
    <input type="text" name="description" placeholder="description">
    <input type="hidden" name="ownerId" value="${ownerId}">
    <input type="submit">
</form>
<table>
    <thead>
    <tr>
        <th>Title</th>
        <th>Description</th>
        <th>Update</th>
        <th>Delete</th>
    </tr>
    <thead>
    <tbody>
    <c:forEach items="${toDos}" var="toDo">
        <tr>
            <td>${toDo.title}</td>
            <td>${toDo.description}</td>
            <td>
                <div class="wrapper">
                    <a href="#demo-modal">Open Demo Modal</a>
                </div>

                <div id="demo-modal" class="modal">
                    <div class="modal__content">
                        <div>
                            <form action="${pageContext.request.contextPath}/to-do/update" method="post">
                                <input type="text" name="title" placeholder="title">
                                <input type="text" name="description" placeholder="description">
                                <input type="hidden" name="ownerId" value="${toDo.ownerId}">
                                <input type="hidden" name="id" value="${toDo.id}">
                                <input type="submit">
                            </form>
                        </div>
                        <a href="#" class="modal__close">&times;</a>
                    </div>
                </div>
            </td>
            <td>
                <div>
                    <form action="${pageContext.request.contextPath}/to-do/delete/${toDo.id}" method="post">
                        <button>Delete</button>
                    </form>
                </div>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
