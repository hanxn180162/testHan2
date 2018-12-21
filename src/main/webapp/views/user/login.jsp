<%@ page language="java" pageEncoding="utf-8"%>
<%--
<%@ include file="/common/privi.jsp" %>
 --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>用户登陆首页</title>
    <link rel="stylesheet" type="text/css" href="../../mycss/index.css" />
    <script type="text/javascript" src="../../js/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            $("#submit").click(function(){
                var user = $("#user").val();
                var password =$("#password").val();
                // if(user == ""){
                //     alert("用户名不能为空");
                //     return false;
                // }
                // if(password == ""){
                //     alert("密码不能为空");
                //     return false;
                // }
            });

        });


    </script>
</head>

<body>
<form action="/user/login" method="post">
       <div class="container">
           <div class="box">
               <div class="header" >
                    欢迎来到testHan系统
               </div>
               <div class="content">
                   <div class="content_body">
                       <span style="color: yellow">${message}</span>
                       <br>
                       用户名/手机号：<input id="user" name="user" type="text" value=""/>
                       密  码：<input id="password" name="password" type="password" value=""/>
                       <input id="submit" name="submit" type="submit" value="登录"/>
                       <a>注册</a>
                   </div>
                   <div class="content_footer">
                       <span>温馨提示：新用户需要注册,才能进入</span>
                   </div>
               </div>
           </div>
       </div>
</form>
</body>
</html>
