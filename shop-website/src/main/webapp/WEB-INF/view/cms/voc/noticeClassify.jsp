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

	<h1 align="center"><br><br><br> 고객센터 - 공지사항_상세<br><br> </h1>

<table>
		<colgroup>
			<col style="width:100px;">
			<col style="width:200px;">
			<col style="width:100px;">
			<col style="width:200px;">
		</colgroup>
		<tr>
			<th>작성자</th>
			<td></td>
			<th>작성시간</th>
			<td></td>
		</tr>
		<tr>
			<th>조회수</th>
			<td></td>
			<th>휴대전화</th>
			<td></td>
		</tr>
		<tr>
			<th>이메일</th>
			<td colspan="3"></td>
		</tr>
		<tr>
			<th>제목</th>
			<td colspan="3"></td>
		</tr>		
		<tr>
			<th>내용</th>
			<td colspan="3"></td>
		</tr>
			<tr>
			<th>첨부파일</th>
			<td colspan="3"></td>
		</tr>
	</table>

</body>
</html>