<%@ page contentType = "text/html; charset=euc-kr" %>
<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Login Form</title>
      <link rel="stylesheet" href="../../../../css/style.css">
	  <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
</head>

<body>
<form action = "logintest" method = "post">
	<div class="login">
		<div class="login-screen">
			<div class="app-title">
				<img src="../../../../htmls/Logo.png" width="100" height="80">
			</div>

			<div class="login-form">
				<div class="control-group">
				<input type="text" class="login-field" placeholder="아이디" name="login-name">
				<label class="login-field-icon fui-user" for="login-name"></label>
				</div>

				<div class="control-group">
				<input type="password" class="login-field" placeholder="패스워드" name="login-pass">
				<label class="login-field-icon fui-lock" for="login-pass"></label>
				</div>

				<a class="btn btn-primary btn-large btn-block" ><input type = "submit" value = "로그인"></input></a>
				<a class="login-link" href="#">비밀번호를 잊으셨나요?</a>
			</div>
		</div>
	</div>
</body>
 </form>

</html>