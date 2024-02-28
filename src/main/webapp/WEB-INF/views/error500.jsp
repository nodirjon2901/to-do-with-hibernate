<%--
  Created by IntelliJ IDEA.
  User: Nodirjon
  Date: 26/02/2024
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
</head>
<body>
<h1>${pageContext.request.getAttribute("jakarta.servlet.error.exception").message}</h1>

<a href="${pageContext.request.getAttribute("jakarta.servlet.error.request_uri")}">
    <button>Back</button>
</a>
</body>
</html>
