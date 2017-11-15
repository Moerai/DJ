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

adption {
	font-size: 20px;
	margin: 10px;
	font-weight: bold;
}
</style>
</head>
<body>
	<jsp:include page="/WEB-INF/view/cms/top_menu.jsp"></jsp:include>
	<h1 align="center">
		<br> 회원관리 - 회원등급<br>
		<br>
	</h1>
	<table align="center">

		<tr>
			<th>등급명</th>
			<th width="200px">등급 설명</th>
			<th>회원수</th>
			<th width="200px">추가 적립</th>
			<th>할인</th>
		</tr>

		<tr> 
			<th>브론즈</th>
			<td>0 ~ 5점</td>
			<td>8</td>
			<td>X</td>
			<td>0%</td>
		</tr>

		<tr>
			<th>실버</th>
			<td>5 ~ 10점</td>
			<td>15</td>
			<td>X</td>
			<td>10%</td>
		</tr>

		<tr>
			<th>골드</th>
			<td>10 ~ 15점</td>
			<td>9</td>
			<td>X</td>
			<td>20%</td>
		</tr>

		<tr>
			<th>다이아</th>
			<td>15 ~ 20점</td>
			<td>5</td>
			<td>X</td>
			<td>30%</td>
		</tr>

		<tr>
			<th>마스터</th>
			<td>20 ~ 25점</td>
			<td>3</td>
			<td>파워등록 1회 <br> 글씨체 강조 1회 <br> 색상 강조 1회
			</td>
			<td>40%</td>
		</tr>


	</table>
</body>
</html>