<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Login Form</title>
      <link rel="stylesheet" href="css/style.css"/>
	  <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
	 <script src="https://code.jquery.com/jquery-3.2.1.js"></script>
	  <script type="text/javascript">
	 	function login() {
	 		var userId = $("#userId").val();
	 		var password = $("#password").val();
	 	    // 태그.val() : 태그에 입력된 값
            // 태그.val("값") : 태그의 값을 변경 
	 		if(userId == "" || password == "") {
	 			alert("아이디/비밀번호를 입력하세요");
	 			return false;
	 		} 
	 		$.ajax({
	 			type: "POST",
	 			url : "/ROOT/api/member/login",
	 			contentType: "application/x-www-form-urlencoded; charset=utf-8",
	 			dataType: "json",
	 			data :  {"userId" : $("#userId").val(),
	 					"password" : $("#password").val() },
	 			success : function(data) {
	 				if (data.userId == userId) {
	 					alert(data.userName + "님 환영합니다");
	 					location.replace("/ROOT");	
	 				} else {
	 					alert("아이디 및 비밀번호가 틀립니다.");
	 				}
	 			},
	 			error : function(request, status, errorThrown) {
	 				console.log("데이터 전송 실패");
	 			}
	 		});
	 	}
           
</script>
</head>

  <body>
	<div class="login">
		<div class="login-screen">
			<div class="app-title">
				<img src="images/logo.png" width="100" height="80">
			</div>
		<form class="form1" id="loginform">
			<div class="login-form">
				<div class="control-group">
				<input type="text" class="login-field" value="" placeholder="아이디" id="userId">
				<label class="login-field-icon fui-user" for="login-name"></label>
				</div>

				<div class="control-group">
				<input type="password" class="login-field" value="" placeholder="패스워드" id="password">
				<label class="login-field-icon fui-lock" for="login-pass"></label>
				</div>

				<button class="btn btn-primary btn-large btn-block" type="submit" id="btnLogin" onclick="login()">로그인</button>
				<a class="login-link" href="#">비밀번호를 잊으셨나요?</a>
			</div>
		</form>
		</div>
	</div>
</body>
</html>