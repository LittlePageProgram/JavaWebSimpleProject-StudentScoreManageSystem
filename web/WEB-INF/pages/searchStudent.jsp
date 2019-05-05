<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/mdui.css" />
    <link rel="stylesheet" type="text/css" href="css/head.css"/>
    <title>SearchStudent</title>
    <link rel="stylesheet" type="text/css" href="css/LoginAndRegister.css"/>
</head>
<body>
<%@include file="head.jsp" %>
<div id="main">
    <div id="tableBorder" class="mdui-table-fluid">
        <table class="mdui-table" >
            <tr>
                <th>学号</th>
                <th>姓名</th>
                <th>年龄</th>
                <th>班级</th>
                <th>籍贯</th>
            </tr>
            <c:forEach items="${studentList}" var="student" >
                <tr>
                    <td>${student.snum }</td>
                    <td>${student.name }</td>
                    <td>${student.age }</td>
                    <td>${student.clazz }</td>
                    <td>${student.nativePlace }</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>