<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<link href="/styles/hal.css" rel="stylesheet" type="text/css">
<style>
 table, th, td {
	text-align: center;
	border: 1px solid gray;
	border-collapse: collapse;
}

th, td {
	width: 100px;
	padding: 5px;
}

adption {
	font-size: 20px;
	margin: 10px;
	font-weight: bold;
}
</style>
</head>
<body>
	<jsp:include page="/WEB-INF/view/cms/top_menu.jsp"></jsp:include>
	<jsp:include page="/WEB-INF/view/cms/member/member_sidebar.jsp" ></jsp:include>
	<h1 align="center"> <br><br><br> 회원관리 - 회원관리<br><br></h1>
	<table align="center"> 

		<tr>
			<th>회원번호</th>
			<th>회원이름</th>
			<th>회원종류</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>닉네임</th>
			<th>이메일</th>
			<th>휴대폰</th>
			<th>주소</th>
			<th>학번</th>
			<th>회원등급</th>
			<th>등급순위</th>
		</tr>

		<tr>
			<td>1</td>
			<td>신현성</td>
			<td>탈퇴</td>
			<td>asd123</td>
			<td>zxc123</td>
			<td>신현성짱</td>
			<td>asd@naver.com</td>
			<td>01000000000</td>
			<td>구일</td>
			<td>20170000</td>
			<td>브론즈</td>
			<td>800</td>
		</tr>

		<tr>
			<td>2</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
		</tr>

		<tr>
			<td>3</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
		</tr>

		<tr>
			<td>4</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
		</tr>

		<tr>
			<td>5</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
		</tr>

		<tr>
			<td>6</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
		</tr>


	</table>
</body>
</html>