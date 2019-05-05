<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="css/mdui.css" />
		<link rel="stylesheet" type="text/css" href="css/head.css"/>
		<title>ModifyStudentList</title>
		<link rel="stylesheet" type="text/css" href="css/LoginAndRegister.css"/>
	</head>
	<style type="text/css">
		#form2{
			height: 150px;
			width: 800px;
			margin: auto;
		}
	</style>
	<body>
		<%@include file="head.jsp" %>
		<div id="form2">
			<form action="${pageContext.request.contextPath }/ModifyStudentGetSnum" method="post">
				<div class="mdui-textfield" id="user">
				    <div class="mdui-textfield">
					    <label class="mdui-textfield-label">请输入要修改的学生学号：</label>
					    <input class="mdui-textfield-input" type="text" id="loginName" name="loginName"/>
					    <label class="mdui-textfield-label"></label>
					</div>
 						<div id="register-button">
 							<button class="mdui-btn mdui-btn-raised mdui-btn-dense mdui-color-theme-accent mdui-ripple" id="registerbutton-button"  onclick="return login();">
 								修改
 							</button>
 						</div>
				</div>
			</form>
		</div>
	<div id="main">
		<div id="tableBorder" class="mdui-table-fluid">
			<table class="mdui-table">
				<tr>
					<th>学号</th>
					<th>姓名</th>
					<th>年龄</th>
					<th>班级</th>
					<th>籍贯</th>
				</tr>
				<c:forEach items="${studentList}" var="student">
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