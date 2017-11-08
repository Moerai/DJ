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
	
	table,th,td{
border:1px solid gray;
border-collapse:collapse;
}
th,td{
width:100px;
padding:5px;}
adption{
font-size:20px;
margin:10px;
font-weight:bold;}
	</style>
</head>
<body>
	<jsp:include page="/WEB-INF/view/cms/top_menu.jsp" ></jsp:include>

	<h1 align="center"> 게시판관리 - 게시판등록 </h1>
	<TABLE align="center">
  <COLGROUP>
  <COL width="200px">
  <COL width="300px">
  <col height="200px"></COLGROUP>
  <THEAD>
  <TR>
    <TH>게시글 제목</TH>
	<td colspan="3"></td>
	</TR>

  <TR>
    <TH>게시글 유형</TH>
	<td colspan="3">
	<select name = "bk">
	<option value="">게시판 유형</option>
    <option value="공부">공부 게시판</option>
    <option value="연예">연예 게시판</option>
    <option value="음주">음주 게시판</option>
    <option value="정보">정보 게시판</option>
	<option value="홍보">홍보 게시판</option>
</select>
</td>
	</TR>

  <TR>
    <TH>관리자 설정</TH>
	<td colspan="3">
	<select name="ms">
    <option value="이름">관리자 이름</option>
    <option value="송성민">송성민</option>
    <option value="신현성">신현성</option>
    <option value="조정현">조정현</option>
</select>
</td>
	</TR>

  <TR>
    <TH>기능 설정</TH>
	<td colspan="3" align = "left">
	파워등록 <input type = "checkbox"> 사용함 <br>
	색상강조 <input type = "checkbox"> 사용함 <br>
	게시글강조 <input type = "checkbox"> 사용함 <br>
	</td>
	</TR>


  <TR>
    <TH>적립금 지급 설정</TH>
	<td colspan="3"> 글 등록시 xxxx원 지급</td>
	
	</TR>


  <TR>
    <TH>게시글 내용</TH>
	<td colspan="3"></td>
	</TR>
</THEAD></TABLE>


</body>
</html>