<%--
  Created by IntelliJ IDEA.
  User: 74302
  Date: 2019/4/28
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="css/mdui.css" />
    <link rel="stylesheet" type="text/css" href="css/head.css"/>
    <link rel="stylesheet" type="text/css" href="css/LoginAndRegister.css"/>
</head>
<script type="text/javascript">
    function login(){
        var loginName=document.getElementById("loginName").value;
        var password=document.getElementById('password').value;
        if(loginName==''||password=='') {
            alert('用户名不能为空');
            return false;
        }
        if(password.length>16||password.length<6){
            alert("密码长度必须为6-16位");
            return false;
        }
    }
</script>
<body>
<%@include file="head.jsp"%>
<div id="main">
    <div id="registerFont">
        <div id="title">
            <div id="title-hrLeft">
                <hr />
            </div>
            <div id="title-hrRight">
                <hr />
            </div>
            <div id="title-font">
                <h1>登录</h1>
            </div>
        </div>
    </div>
    <div id="form">
        <form action="${pageContext.request.contextPath }/LoginServlet"
              method="post">
            <div class="mdui-textfield" id="user">
                <div class="mdui-textfield">
                    <label class="mdui-textfield-label">用户名</label> <input
                        class="mdui-textfield-input" type="text" id="loginName"
                        name="loginName" /> <label class="mdui-textfield-label"></label>
                </div>
                <div class="mdui-textfield">
                    <label class="mdui-textfield-label">密码</label> <input
                        class="mdui-textfield-input" type="text" id="password"
                        name="password" /> <label class="mdui-textfield-label"></label>
                </div>
                <div id="register-button">
                    <button
                            class="mdui-btn mdui-btn-raised mdui-btn-dense mdui-color-theme-accent mdui-ripple"
                            id="registerbutton-button" onclick="return login();">登录
                    </button>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
