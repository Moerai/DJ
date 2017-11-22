<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<style>
table, td, th {
border : 1px solid black;
border-collapse:collapse;
text-align : center;
}
th, td {
width:100px;
padding:5px;
}
th {
background:#D5D5D5;
}
</style>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Insert title here</title>
	<link href="/styles/hal.css" rel="stylesheet" type="text/css">
</head>
<body>
	<jsp:include page="/WEB-INF/view/cms/top_menu.jsp" ></jsp:include>
	<jsp:include page="/WEB-INF/view/cms/board/board_sidebar.jsp"></jsp:include>

	<h1 aling="center"><br><br><br> 게시판관리 - 게시판리스트 <br><br></h1>
<table>

<tr>
<th>게시판 유형</th>
<th>게시판 읽기</th>
<th>게시판 쓰기</th>
<th>댓글 쓰기</th>
<th>새글 / 전체</th>
<th>관리</th>
</tr>

<tr>
<td>공부게시판</td>
<td>비회원</td>
<td>비회원</td>
<td>비회원</td>
<td>3 / 6</td>
<td>수정</td>
</tr>

<tr>
<td>연예게시판</td>
<td>.</td>
<td>.</td>
<td>.</td>
<td>.</td>
<td>.</td>
</tr>

<tr>
<td>연예게시판</td>
<td>.</td>
<td>.</td>
<td>.</td>
<td>.</td>
<td>.</td>
</tr>

<tr>
<td>음주게시판</td>
<td>.</td>
<td>.</td>
<td>.</td>
<td>.</td>
<td>.</td>
</tr>

<tr>
<td>정보게시판</td>
<td>.</td>
<td>.</td>
<td>.</td>
<td>.</td>
<td>.</td>
</tr>

<tr>
<td>홍보게시판</td>
<td>.</td>
<td>.</td>
<td>.</td>
<td>.</td>
<td>.</td>
</tr>
</table>


</body>
</html>