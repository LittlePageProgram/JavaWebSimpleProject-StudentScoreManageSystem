<%--
  Created by IntelliJ IDEA.
  User: 74302
  Date: 2019/4/28
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Head</title>
    <link rel="stylesheet" href="css/mdui.css" />
    <link rel="stylesheet" type="text/css" href="css/head.css"/>
    <link rel="stylesheet" type="text/css" href="css/LoginAndRegister.css"/>
</head>
<body>
<div id="topNevigation">
    <div id="topNevigation-mosaic">
        <div id="topNevigation-mosaic-loginStatus">
            <c:if test="${loginInfo.name != null}">
                ${loginInfo.name }已登录&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="Logout" style="color: #757575">注销</a>
            </c:if>
            <c:if test="${loginInfo.name == null}">
                未登录
            </c:if>
        </div>
    </div>
    <div id="topNevigation-title">学生教务系统</div>
</div>
</body>
</html>
