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
</head>
<body>
	<jsp:include page="/WEB-INF/view/cms/top_menu.jsp" ></jsp:include>
	<jsp:include page="/WEB-INF/view/cms/market/market_sidebar.jsp" ></jsp:include>
	<div>
	
	<h1 align = "center"> 중고장터 관리 </h1>

<p align = "center">선택분류 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


  <select align="center">
    <option value="">선택종류 &nbsp;&nbsp;&nbsp;</option>
    <option value="">1</option>
    <option value="">2</option>
    <option value="">3</option>
</select>
</p>
</div>
<br>

<div style="backgroun-color:pink;">
<p align = "center">
  검색키워드 &nbsp;&nbsp;
  <select align="center">
    <option value="상품명">상품명</option>
    <option value="상품등록자">상품등록자</option>
    <option value="상품번호">상품번호</option>
   
   </div>
</select>
</p>
<br><br><br><br>

<table border="1" width="600" height=292 align = "center" >


<tr align="center">
<td>no.</td>
<td>상품명</td>
<td>사진</td>
<td>등록일</td>
<td>판매가격</td>
<td>등록자</td>
</tr>
<tr align="center">
<td>1</td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr align="center">
<td>2</td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr align="center">
<td>3</td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr align="center">
<td>4</td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr align="center">
<td>5</td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>


</table>

</body>
</html>