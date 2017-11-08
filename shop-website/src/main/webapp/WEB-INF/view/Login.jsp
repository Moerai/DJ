<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html >
<head>
  <meta charset="UTF-8">
  <title>Login Form</title>
      <link rel="stylesheet" href="css/style.css">
	  <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
</head>

<body>
	<% 
	// 현재 로그인된 아이디가 없다면 
	if(session.getAttribute("login-name")){
		%>
		<div class="login">
		<div class="login-screen">
			<div class="app-title">
				<img src="Logo.png" width="100" height="80">
			</div>

			<div class="login-form">
				<div class="control-group">
				<input type="text" class="login-field" value="" placeholder="아이디" id="login-name">
				<label class="login-field-icon fui-user" for="login-name"></label>
				</div>

				<div class="control-group">
				<input type="password" class="login-field" value="" placeholder="패스워드" id="login-pass">
				<label class="login-field-icon fui-lock" for="login-pass"></label>
				</div>

				<a class="btn btn-primary btn-large btn-block" href="#">로그인</a>
				<a class="login-link" href="#">비밀번호를 잊으셨나요?</a>
			</div>
		</div>
	</div>	
	}



</body>
</html>
