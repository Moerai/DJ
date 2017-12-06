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

th {
	background: #D5D5D5;
}

#aa {
	position: relative;
	left: 50%;
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
	<jsp:include page="/WEB-INF/view/cms/member/member_sidebar.jsp"></jsp:include>

	<h1 align="center">탈퇴회원 관리</h1>
	<TABLE align="center">
		<tr>
			<th>이름</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>휴대전화</th>
			<th>회원상태</th>
		</tr>


		<c:forEach var="member" items="${members}">
			<tr>
				<td align="center"><input type=checkbox>
					${member.userName}</td>
				<td align="center">${member.userId }</td>
				<td align="center">${member.password }</td>
				<td align="center">${member.phone}</td>
				<td align="center">${member.state}</td>
			</tr>
		</c:forEach>
	</TABLE>
	<br><br><br>
	<div id="aa">
		<input type="button" style="width: 100px; height: 50px" value="등록">
	</div>
	<br><br><br><br><br>
	<TABLE align="center">
		<tr>
			<th>이름</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>휴대전화</th>
			<th>회원상태</th>
		<tr>

	</TABLE>
</body>
</html>