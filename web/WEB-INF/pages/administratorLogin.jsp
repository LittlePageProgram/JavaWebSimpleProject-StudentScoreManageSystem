<%--
  Created by IntelliJ IDEA.
  User: 74302
  Date: 2019/4/29
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>AdministratorLogin</title>
    <link rel="stylesheet" href="css/mdui.css" />
    <link rel="stylesheet" type="text/css" href="css/head.css"/>
    <link rel="stylesheet" type="text/css" href="css/LoginAndRegister.css"/>
</head>
<body>
<%@include file="head.jsp" %>
<div id="registerFont">
    <div class="mdui-bottom-nav" id="root">
        <h1>您已进入root状态 请谨慎修改</h1>
    </div>
</div>
<div id="crud">
    <div>
        <div class="crud">
            <ul class="mdui-list" style="max-width: 360px;">
                <li class="mdui-list-item"><i
                        class="mdui-list-item-avatar mdui-icon material-icons">&#xe145;</i>
                    <div class="mdui-list-item-content"><a href="${pageContext.request.contextPath }/AddStudent">添加学生信息</a></div></li>
                <li class="mdui-list-item"><i
                        class="mdui-list-item-avatar mdui-icon material-icons">&#xe8e1;</i>
                    <div class="mdui-list-item-content"><a href="${pageContext.request.contextPath }/ModifyStudent">修改学生信息</a></div></li>
                <li class="mdui-list-item"><i
                        class="mdui-list-item-avatar mdui-icon material-icons">&#xe872;</i>
                    <div class="mdui-list-item-content"><a href="${pageContext.request.contextPath }/DeleteStudent">删除学生信息</a></div></li>
                <li class="mdui-list-item"><i
                        class="mdui-list-item-avatar mdui-icon material-icons">&#xe8b6;</i>
                    <div class="mdui-list-item-content"><a href="${pageContext.request.contextPath }/SearchStudent">查询学生信息</a></div></li>
            </ul>
        </div>
        <div class="crud">
            <ul class="mdui-list" style="max-width: 360px;">
                <li class="mdui-list-item"><i
                        class="mdui-list-item-avatar mdui-icon material-icons">&#xe145;</i>
                    <div class="mdui-list-item-content">添加教师信息</div></li>
                <li class="mdui-list-item"><i
                        class="mdui-list-item-avatar mdui-icon material-icons">&#xe8e1;</i>
                    <div class="mdui-list-item-content">修改教师信息</div></li>
                <li class="mdui-list-item"><i
                        class="mdui-list-item-avatar mdui-icon material-icons">&#xe872;</i>
                    <div class="mdui-list-item-content">删除教师信息</div></li>
                <li class="mdui-list-item"><i
                        class="mdui-list-item-avatar mdui-icon material-icons">&#xe8b6;</i>
                    <div class="mdui-list-item-content">查询教师信息</div></li>
            </ul>
        </div>
        <div class="crud">
            <ul class="mdui-list" style="max-width: 360px;">
                <li class="mdui-list-item"><i
                        class="mdui-list-item-avatar mdui-icon material-icons">&#xe145;</i>
                    <div class="mdui-list-item-content">添加课程信息</div></li>
                <li class="mdui-list-item"><i
                        class="mdui-list-item-avatar mdui-icon material-icons">&#xe8e1;</i>
                    <div class="mdui-list-item-content">修改课程信息</div></li>
                <li class="mdui-list-item"><i
                        class="mdui-list-item-avatar mdui-icon material-icons">&#xe872;</i>
                    <div class="mdui-list-item-content">删除课程信息</div></li>
                <li class="mdui-list-item"><i
                        class="mdui-list-item-avatar mdui-icon material-icons">&#xe8b6;</i>
                    <div class="mdui-list-item-content">查询课程信息</div></li>
            </ul>
        </div>
        <div class="crud">
            <ul class="mdui-list" style="max-width: 360px;">
                <li class="mdui-list-item"><i
                        class="mdui-list-item-avatar mdui-icon material-icons">&#xe145;</i>
                    <div class="mdui-list-item-content">添加分数信息</div></li>
                <li class="mdui-list-item"><i
                        class="mdui-list-item-avatar mdui-icon material-icons">&#xe8e1;</i>
                    <div class="mdui-list-item-content">修改分数信息</div></li>
                <li class="mdui-list-item"><i
                        class="mdui-list-item-avatar mdui-icon material-icons">&#xe872;</i>
                    <div class="mdui-list-item-content">删除分数信息</div></li>
                <li class="mdui-list-item"><i
                        class="mdui-list-item-avatar mdui-icon material-icons">&#xe8b6;</i>
                    <div class="mdui-list-item-content">查询分数信息</div></li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
