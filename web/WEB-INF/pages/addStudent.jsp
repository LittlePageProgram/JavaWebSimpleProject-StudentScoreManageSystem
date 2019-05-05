<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>AddStudent</title>
		<link rel="stylesheet" href="css/mdui.css" />
		<link rel="stylesheet" type="text/css" href="css/head.css"/>
		<link rel="stylesheet" type="text/css" href="css/LoginAndRegister.css"/>
	</head>
	<script type="text/javascript">
		function login(){
			var sNum=document.getElementById("sNum").value;
			var sName=document.getElementById('sName').value;
			var sAge=document.getElementById('sName').value;
			var sClass=document.getElementById('sClass').value;
			var nativePlace=document.getElementById('nativePlace').value;
			if(sNum==''||sName==''||sAge==''||sClass==''||nativePlace=='') {
				alert('输入不能为空');
				return false;
			}
			else return true;
		}
	</script>
	<body>
		<%@include file="head.jsp" %>
		<div id="registerFont">
			<div class="mdui-bottom-nav" id="root">
				<h1>您已进入root状态  请谨慎修改</h1>
			</div>
		</div>
		<div id="form">
			<form action="${pageContext.request.contextPath }/DealWithAddStudent" method="post">
				<div class="mdui-textfield" id="user">
				    <div class="mdui-textfield">
					    <label class="mdui-textfield-label">学号</label>
					    <input class="mdui-textfield-input" type="text" id="sNum" name="sNum"/>
					    <label class="mdui-textfield-label"></label>
					</div>
					<div class="mdui-textfield">
					    <label class="mdui-textfield-label">姓名</label>
					    <input class="mdui-textfield-input" type="text" id="sName" name="sName"/>
					    <label class="mdui-textfield-label"></label>
					</div>
					<div class="mdui-textfield">
					    <label class="mdui-textfield-label">年龄</label>
					    <input class="mdui-textfield-input" type="text" id="sAge" name="sAge"/>
					    <label class="mdui-textfield-label"></label>
					</div>
					<div class="mdui-textfield">
					    <label class="mdui-textfield-label">班级</label>
					    <input class="mdui-textfield-input" type="text" id="sClass" name="sClass"/>
					    <label class="mdui-textfield-label"></label>
					</div>
					<div class="mdui-textfield">
					    <label class="mdui-textfield-label">籍贯</label>
					    <input class="mdui-textfield-input" type="text" id="nativePlace" name="nativePlace"/>
					    <label class="mdui-textfield-label"></label>
					</div>
					<div id="register-button">
						<button class="mdui-btn mdui-btn-raised mdui-btn-dense mdui-color-theme-accent mdui-ripple" id="registerbutton-button"  onclick="return login();">
							添加
						</button>
					</div>
				</div>
			</form>
		</div>
	</body>
</html>
