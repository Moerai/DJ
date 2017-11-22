<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Insert title here</title>
	<link href="/styles/hal.css" rel="stylesheet" type="text/css">
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
	
</head>
<body>
	<jsp:include page="/WEB-INF/view/cms/top_menu.jsp" ></jsp:include>
	<jsp:include page="/WEB-INF/view/cms/board/board_sidebar.jsp"></jsp:include>

	<h1 align="center"> <br><br><br>고객센터 - 공지사항 <br><br></h1>

<table align="center">

<tr>
<th>번호</th>
<th>제목</th>
<th>작성시간</th>
<th>글쓴이</th>
<th>조회</th>
</tr>

<tr>
<td>1</td>
<td>긴급합니다</td>
<td>2017/10/18</td>
<td>신현성</td>
<td>100</td>
</tr>

<tr>
<td>2</td>
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
</tr>

<tr>
<td>4</td>
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
</tr>
</table>
</body>
</html>