<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Nodirjon
  Date: 26/02/2024
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu</title>
        <link rel="stylesheet" href="<c:url value="/styles/menupages.css" />">
</head>
<body>
<div class='container'>
    <div class="container_content">
        <div class="container_content_inner">
            <div class="title">
                <h1>This is to-do app</h1>
            </div>
            <div class="par">
                <p>
                    This is to-do app. You add to-do in this app. And you edit and delete your to-do. You put button here. You see your to-do list
                </p>
            </div>
            <div class="button-container">
                <form action="${pageContext.request.contextPath}/to-do/list/${owner.id}">
                    <button class="btns_more">ToDos</button>
                </form>
            </div>
        </div>
    </div>
<%--    <div class="container_outer_img">--%>
<%--        <div class="img-inner">--%>
<%--            <img src='img.png' alt="" class="container_img"/>--%>
<%--        </div>--%>
<%--    </div>--%>
</div>
</body>
</html>
