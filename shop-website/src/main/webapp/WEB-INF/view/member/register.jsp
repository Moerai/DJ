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
	<img src="/images/DJ-Logo.png" width="20%">
</center>
<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
<script type="text/javascript">
	//registerCheckFunction->button ID CHECK를 누르면 실행되는 함수
	function registerCheckFunction() {
		//ajax : jquery안에 포함되어있는 것
		$.ajax({
					type : 'POST',
					url : '/api/member/register',
					contentType : "application/x-www-form-urlencoded; charset=utf-8",
					dataType : "json", //여기로 가서 function을 실행할꺼에요
					data : {
						"userId" : $("#userId").val(),
						"password" : $("#password").val(),
						"nickName" : $("#nickName").val(),
						"emailid" : ($("#emailid").val() + "@" + $("#emailaddr")
								.val()),
						"phone" : $("indexNo").val() + $("#phone2").val()
								+ $("#phone3").val(),
						"address" : $("#address").val(),
						"studentNum" : $("#studentNum").val()
					},
					success : function(data) { //result를 받아올꺼죠
						location.href = "member/login";
						alert("회원가입에 성공했습니다.")
					},
				});
	}

	$(function() {

		$("#registerForm").on("submit", function() {
			registerCheckFunction();

			return false;
		});
	});
</script>
</head>

<body>
	<table border="2" bgcolor="" align="center" class="table"
		cellpadding="5">
		<form id="registerForm">
		<tr>
			<td class="td">닉네임</td>
			<td><input type="text" id="nickName" /> <input type="button"
				value="중복확인" /></td>
		</tr>
		<tr>
			<td class="td">아이디</td>
			<td><input type="text" id="userId" /></td>
		</tr>
		<tr>
			<td class="td">비밀번호</td>
			<td><input type="password" id="password" /></td>
		</tr>
		<tr>
			<td class="td">비밀번호확인</td>
			<td><input type="password" id="passwordcheck"
				oninput="checkPwd()" /></td>

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
				id="emailaddr" /> &nbsp;&nbsp;<select>
					<option>naver.com</option>
					<option>daum.net</option>
					<option>gmail.com</option>
					<option>nate.com</option>
			</select></td>
		</tr>
		<tr>
			<td class="td">휴대전화</td>
			<td><select class="phone1">
					<script type="text/javascript">
						var test = document.getElementsByClassName("phone1");
						// test 변수에 selectTest란 클래스명을 가진 요소를 저장

						var indexNo = test[0].selectedIndex;
						// test 변수의 선택된 값을 indexNo에 저장
					</script>
					<option>010</option>
					<option>011</option>
					<option>016</option>
					<option>018</option>
			</select> - <input type="text" id="phone2" size="6" />- <input type="text"
				id="phone3" size="6" /></td>
		</tr>
		<tr>
			<td class="td">주소</td>
			<td><input type="text" id="address" />
		</tr>

		<tr>
			<td class="td">학번</td>
			<td><input type="text" id="studentNum" />
		</tr>

		<tr>
			<td colspan="2" align="center"><input type="submit" value="회원가입" /></td>
		</tr>
	</table>
	</form>
</body>

</html>