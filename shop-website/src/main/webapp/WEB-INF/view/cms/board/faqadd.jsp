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
	<jsp:include page="/WEB-INF/view/cms/board/board_sidebar2.jsp"></jsp:include>

	<h1 align="center"> <br><br><br> FnQ 등록 <br><br></h1>

<TABLE align="center" >
	<tr>
	<th> 작성자 </th>
	<td> </td>
	<th> 휴대전화 </th>
	<td> </td>
	</tr>

	<tr>
	<th> 카테고리 </th>
	<td > </td>
	<th>  </th>
	<td > </td>
	</tr>

	<tr>
	<th> 제목 </th>
	<td colspan = 3> </td>
	</tr>

	<tr>
	<th> 내용 </th>
	<td colspan = 3> </td>
	</tr>

	<tr>
	<th> 첨부파일 </th>
	<td colspan = 3> </td>
	</tr>

 </TABLE>

</body>
</html>