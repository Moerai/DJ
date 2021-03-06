<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!doctype html>
<head>
<meta charset="UTF-8">
<meta name="Generator" content="EditPlus®">
<meta name="Author" content="">
<meta name="Keywords" content="">
<meta name="Description" content="">
<link rel="stylesheet" href="/css/JSstyle.css">
<meta name="viewport"
	content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
<title>Document</title>
<center>
	<img src="../images/logo.png" width="20%">
</center>
<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
<script type="text/javascript">
	//registerCheckFunction->button ID CHECK를 누르면 실행되는 함수
	function check() {
		var name =$("#userName").val();
		var id = $("#userId").val();
		var pw = $("#password").val();
		if (name == "" || name == null) {
			alert('이름을 입력해주세요');
			return false;
		}
		if (id == "" || id== null) {
			alert('아이디를 입력해주세요');
			return false;
		}
		if (pw == "" || pw == null) {
			alert('비밀번호를 입력해주세요');
			return false;
		}
		
	}
	function setselecte(){
		 var email = $("#email option:selected").text();
		 $('.text1').val(email);
	}
	function setselectp(){
		 var phone = $("#phone option:selected").text();
	}
	
	function idCheck() {
		var userId = $("#userId").val();
		$.ajax({
 			type: "POST",
 			url : "/api/member/idcheck",
 			contentType: "application/x-www-form-urlencoded; charset=utf-8",
 			dataType: "json",
 			data :  {"userId" : $("#userId").val()},
 			success : function(data) {
 					if(data.userId == userId || data.userId == ""){
 					alert("이미 사용중이거나 사용할 수 없는 아이디 입니다.");
 				}
 			},
 			error : function(request, status, errorThrown) {
 				alert("사용가능한 아이디 입니다.");
 			}
 		});
	}
	function registerCheckFunction() {
		//ajax : jquery안에 포함되어있는 것
		$.ajax({
					type : "POST",
					url : "/api/member/register",
					contentType : "application/x-www-form-urlencoded; charset=utf-8",
					dataType : "json", //여기로 가서 function을 실행할꺼에요
					data : {
						"userName" : $("#userName").val(),
						"userId" : $("#userId").val(),
						"password" : $("#password").val(),
						"nickName" : $("#nickName").val(),
						"email" : ($("#emailid").val() + "@" + $("#emailaddr")
								.val()),
						"phone" : $("phone1").val() + $("#phone2").val()
								+ $("#phone3").val(),
						"address" : $("#address").val(),
						"studentNum" : $("#studentNum").val()
					},
					success : function(data) { //result를 받아올꺼죠
						
						alert("회원가입에 성공했습니다.");
						location.href = "registerfinish";
					},
				});
	}
	
	$(function() {
		$("#registerForm").on("submit", function() {
			check();
			registerCheckFunction();
			return false;
		});
	});
</script>
</head>

<body>
	<table border="2" bgcolor="" align="center" class="table" cellpadding="5">
		<form id="registerForm" method="post">
			<tr>
				<td class="name">이름</td>
				<td><input type="name" id="userName" placeholder="이름을 입력해주세요" /></td>
			</tr>
			<tr>
				<td class="td">닉네임</td>
				<td><input type="text" id="nickName" placeholder="닉네임을 입력해주세요" />
					<input type="button" value="중복확인" /></td>
			</tr>
			<tr>
				<td class="td">아이디</td>
				<td><input type="text" id="userId" placeholder="아이디를 입력해주세요" />
					<input type="button" value="중복확인" onclick="idCheck();" /></td>
			</tr>
			<tr>
				<td class="td">비밀번호</td>
				<td><input type="password" id="password"
					placeholder="비밀번호를 입력해주세요" /></td>
			</tr>

			<td class="td">비밀번호확인</td>
			<td><input type="password" id="passwordcheck"
				oninput="checkPwd()" placeholder="비밀번호 확인을 입력해주세요" /></td>

			</tr>
			<script type="text/javascript">
				function checkPwd() { // 비밀번호가 다르면 빨간색 같으면 색 변화 x
					var password = $('#password').val();
					var passwordcheck = $('#passwordcheck').val();
					if (password != passwordcheck) {
						$("#passwordcheck").css("background-color", "#FFCECE");
					} else {
						$("#passwordcheck").css("background-color", "#FFFFFF");
					}
				}
			</script>
			<tr>
				<td class="td">이메일</td>
				<td><input type="text" id="emailid" />@ <input type="text"
					id="emailaddr" /> &nbsp;&nbsp;<select id="email"
					onchange="setselecte();">

						<option>naver.com</option>
						<option>daum.net</option>
						<option>gmail.com</option>
						<option>nate.com</option>
						<option></option>
				</select></td>

			</tr>
			<tr>
				<td class="td">휴대전화</td>
				<td><select class="phone1" onchange="setselectp();" id="phone"
					name="phone">

						<option>010</option>
						<option>011</option>
						<option>016</option>
						<option>018</option>
				</select> - <input type="text" id="phone2" size="6" />- <input type="text"
					id="phone3" size="6" /></td>
			</tr>
			<tr>
				<td class="td">주소</td>
				<td><input type="text" id="address" /></td>
			</tr>

			<tr>
				<td class="td">학번</td>
				<td><input type="text" id="studentNum"></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><button class="btn btn-primary btn-large btn-block" id="btnLogin">회원가입</button></td>
			</tr>
	</form>
	</table>
</body>

</html>