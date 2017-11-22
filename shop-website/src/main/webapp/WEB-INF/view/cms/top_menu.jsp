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
	width:100%;
	height:150px;
	background-color: #728CA8;
	margin-bottom: 20px;
}
#logoimg{
	height: 150px;
	width: 100%;
}
#logo {
	height: 150px;
	width: 280px;
	float:left;
	position:static;
	margin-left:20px;
}

#select {
	width: 1000px;
	height: 150px;
	/*background-color:red;*/
	float:left;
	margin:auto;
	position:static;
}

#select ul li {
	line-height: 50px;
	margin:auto;
	padding: 50px;
	display:inline-block;
	font-weight:bold;
}

#logout {
	width: 180px;
	height: 140px;
	float: left;
	position:static;
	padding-left:120px;
	padding-top:10px;
	/*background-color: #2b542c;*/
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
				<li><a href="../board/notice">게시판관리</a></li>
				<li><a href="../ad/manageAD">광고관리</a></li>
			</ul>
		</div>
		<form ACTION="" method="post">
		<div id="logout"><input type="submit" value="logout" style="font-size:10px; height:20px; width:50px;
			 	position:absolute; margin:auto"></div>
		</form>
	</div>
</body>