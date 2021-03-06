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
background:#D5D5D5;
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
	<h1 align="center"> <br> 회원관리 - 회원관리<br><br></h1>
	
	<table align="center"> 

		<tr>
			<th>회원이름</th>
			<th>회원상태</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>경험치</th>
			<th>닉네임</th>
			<th>휴대폰</th>
			<th>주소</th>
			<th>학번</th>
			<th>관리</th>
		</tr>

		<c:forEach var="member" items="${members}">
			<tr>
					<td>${member.userName}</td>
					<td>${member.state}</td>
					<td>${member.userId }</td>
					<td>${member.password }</td>
					<td>${member.exp}</td>
					<td>${member.nickName }</td>
					<td>${member.phone}</td>
					<td>${member.address}</td>
					<td>${member.studentNum}</td>
					<td>
						<a href="memberModifi?userId=${member.userId}">
							수정
						</a>
					</td>
			</tr>
		</c:forEach>
	</table></body>
</html>