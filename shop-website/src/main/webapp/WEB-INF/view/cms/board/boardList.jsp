<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<style>
table, td, th {
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
}

th, td {
	width: 100px;
	padding: 5px;
}

th {
	background: #D5D5D5;
}
</style>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<link href="/styles/hal.css" rel="stylesheet" type="text/css">
</head>
<body>
	<jsp:include page="/WEB-INF/view/cms/top_menu.jsp"></jsp:include>
	<jsp:include page="/WEB-INF/view/cms/board/board_sidebar.jsp"></jsp:include>

	<h1 align="center">
		<br> <br> 게시판 목록 <br> <br>
	</h1>

	<table align="center">
		<div align="center">
			<tr>
				<td>게시판 유형</td>
				<td><select>
						<option value="">공부 게시판</option>
						<option value="">연예 게시판</option>
						<option value="">음주 게시판</option>
						<option value="">정보 게시판</option>
						<option value="">홍보 게시판</option>
				</select></td>
			</tr>
		</div>
	</table>
	<table align="center">
		<br>
		<br>
		<tr>
			<th>제목</th>
			<th>작성자</th>
			<th>작성 날짜</th>
			<th>제목</th>
		</tr>
	</table>


</body>
</html>

