<%--
  Created by IntelliJ IDEA.
  User: pss
  Date: 2017-12-01
  Time: 오후 4:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="/styles/hal.css" rel="stylesheet" type="text/css">
<title>회원정보수정</title>
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
</style>
</head>
<body>
	<jsp:include page="/WEB-INF/view/cms/top_menu.jsp"></jsp:include>
	<jsp:include page="/WEB-INF/view/cms/member/member_sidebar.jsp"></jsp:include>
	<div id="full">
		<h1 align="center">
			<br>${member.userName} 회원의 수정페이지 <br> <br>
		</h1>
		<table align="center">
			<tr>
				<th>회원이름</th>
				<td><input type ="text" value ="${member.userName}"></td>
			</tr>
			<tr>
				<th>회원상태</th>
				<td><input type ="text" value ="${member.state}"></td>
			</tr>
			<tr>
				<th>아이디</th>
				<td><input type ="text" value ="${member.userId}"></td>
			</tr>
			<tr>
				<th>닉네임</th>
				<td><input type ="text" value ="${member.nickName}"></td>
			</tr>
			<tr>
				<th>핸드폰</th>
				<td><input type ="text" value ="${member.phone}"></td>
			</tr>
			<tr>
				<th>주소</th>
				<td><input type ="text" value ="${member.address}"></td>
			</tr>
			<tr>
				<th>학번</th>
				<td><input type ="text" value ="${member.studentNum}"></td>
			</tr>
		</table>

	</div>


</body>
</html>
