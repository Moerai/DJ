<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<head>
<meta charset="utf-8" />
<title>대중 관리자 홈페이지</title>
<style>
a {
	text-decoration: none;
	color: black;
}

ul li div{
	height:150px;
}

#frame{
	width: 1440px;
	height:150px;
	background-color: #728CA8;
	margin: auto;
}
#logoimg{
	height: 150px;
	width: 280px;
}
#logo {
	height: 150px;
	width: 280px;
	float:left;
	display: block;
	margin-left:20px;
}

#select {
	width: 800px;
	height: 150px;
	float:left;
	display: block;
}

#select ul li {
	line-height: 50px;
	float: left;
	padding: 30px;
	display:inline-block;
	font-weight:bold;
}

#logout {
	width: 180px;
	height: 140px;
	float: left;
	display: block;
	padding-left:120px;
	padding-top:10px;
}

</style>

</head>
<body>
	<div id="frame">
		<div id="logo"><img id="logoimg" src="/images/logo.png"></div>
		<div id="select">
			<ul>
				<li><a href="../member/memberList">회원관리</a></li>
				<li><a href="../market/productList">장터관리</a></li>
				<li><a href="../board/boardList">게시판관리</a></li>
				<li><a href="../board/notice">공지사항</a></li>
				<li><a href="../ad/manageAD">광고관리</a></li>
			</ul>
		</div>
		<form ACTION="/cms/logout" method="post">
		<div id="logout"><input type="submit" value="logout" style="font-size:10px; height:20px; width:50px;
			 	position:absolute; margin:auto"></div>
		</form>
	</div>
</body>