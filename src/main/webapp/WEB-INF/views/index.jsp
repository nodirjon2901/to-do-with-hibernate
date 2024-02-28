<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="<c:url value="/styles/buttons.css" />">
</head>
<body>
<div class="container">
    <a href="${pageContext.request.contextPath}/auth/sign-up" class="button button--piyo">
        <div class="button__wrapper">
            <span class="button__text">Sign UP</span>
        </div>
        <div class="characterBox">
            <div class="character wakeup">
                <div class="character__face"></div>
            </div>
            <div class="character wakeup">
                <div class="character__face"></div>
            </div>
            <div class="character">
                <div class="character__face"></div>
            </div>
        </div>
    </a>

    <a href="${pageContext.request.contextPath}/auth/sign-in" class="button button--hoo">
        <div class="button__wrapper">
            <span class="button__text">Sign In</span>
        </div>
        <div class="characterBox">
            <div class="character wakeup">
                <div class="character__face"></div>
                <div class="charactor__face2"></div>
                <div class="charactor__body"></div>
            </div>
            <div class="character wakeup">
                <div class="character__face"></div>
                <div class="charactor__face2"></div>
                <div class="charactor__body"></div>
            </div>
            <div class="character">
                <div class="character__face"></div>
                <div class="charactor__face2"></div>
                <div class="charactor__body"></div>
            </div>
        </div>
    </a>

    <a href="#" class="button button--pen">
        <div class="button__wrapper">
            <span class="button__text">Other</span>
        </div>
        <div class="characterBox">
            <div class="character wakeup">
                <div class="character__face"></div>
                <div class="charactor__face2"></div>
            </div>
            <div class="character wakeup">
                <div class="character__face"></div>
                <div class="charactor__face2"></div>
            </div>
            <div class="character">
                <div class="character__face"></div>
                <div class="charactor__face2"></div>
            </div>
        </div>
    </a>

</div>
</body>
</html>