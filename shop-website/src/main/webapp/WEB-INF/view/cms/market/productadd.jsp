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
	<jsp:include page="/WEB-INF/view/cms/market/market_sidebar.jsp"></jsp:include>
<h1 align = "center"><br><br><br> 중고장터 관리 - 상품 등록<br><br> </h1>

<table border="1" align = "center">

    <tr>
        <td>상품분류</td>
        <td width="300" height="20"> </td>
    </tr>
    <tr>
        <td >상품명</td>
        <td></td>
    </tr>
    <tr>
        <td >판매자</td>
        <td></td>
    </tr>
    <tr>
        <td >판매가격</td>
        <td></td>
    </tr>
    <tr>
        <td >상품설명</td>
        <td></td>
    </tr>
    <tr>
        <td >이미지</td>
        <td></td>
    </tr>
    <tr>
        <td >등록일</td>
        <td></td>
    </tr>
    <tr>
        <td >적립금지급</td>
        <td></td>
    </tr>
</body>
</html>
