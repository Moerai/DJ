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

ul li {
	display: inline;
}

#logo {
	height: 50px;
	width: 50px;
	/*float: left;*/
	background-color: blue;
}

#select {
	width: 100%;
	height: 150px;
	/*float: left;*/
}

/* #log {
	width: 50%;
	height: 50%;
	/* float: right; 
	background-color: green;
}*/
#sidebar {
	width: 200px;
	height: 600px;
	float: left;
	background-color: #E8FFFF;
}
/* #content{
      width:auto;
      height:600px; 
      background-color: purple;
  } 
  #footer{
    width:auto; 
    height:60px;
    background-color: gold;
  } */
#select ul li {
	line-height: 50px;
	margin: 0 15px;
	padding: 10px;
}

/* #log ul li {
	margin: 0 25px;
	padding: 15px;
} */
</style>
</head>
<body>
	<div id="frame">
		<div id="select">
			<a href="Backindex.jsp"><img src=""></a>
			<ul style="padding: 0">
				<li><img src="/images/logo.png" Width="170px" height="100px"
					align="center"></li>
				<li><a href="../member/memberList">회원리스트&nbsp;&nbsp;</a></li>
				<li><a href="../market/productList">중고장터/상품리스트&nbsp;&nbsp;</a></li>
				<li><a href="../market/productProhibit">중고장터/금지언어&nbsp;&nbsp;</a></li>
				<li><a href="../board/boardList">게시판관리/게시판리스트&nbsp;&nbsp;</a></li>
				<li><a href="../board/boardRegister">게시판관리/게시판등록&nbsp;&nbsp;</a></li>
				<li><a href="../ad/manageAD">광고관리&nbsp;&nbsp;</a></li>
				<li><a href="../voc/notice">공지사항&nbsp;&nbsp;</a></li>
				<li><a href="../voc/noticeClassify">공지사항/상세</a></li>
				<li><a href="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;로그아웃</a>
			</ul>
		</div>
		<div id="sidebar" align = "center"> 
			<li><a href="../member/memberList"><font color="#000000"><br><br><br><br>회원리스트</font><br><br><br></font></a></li>
			<li><a href="../market/productList"><font color="#000000">중고장터/상품리스트</font><br><br><br></a></li>
			<li><a href="../market/productProhibit"><font color="#000000">중고장터/금지언어</font><br><br><br></a></li>
			<li><a href="../board/boardList"><font color="#000000">게시판관리/게시판리스트</font><br><br><br></a></li>
			<li><a href="../board/boardRegister"><font color="#000000">게시판관리/게시판등록</font><br><br><br></a></li>
			<li><a href="../ad/manageAD"><font color="#000000">광고관리</font><br><br><br></a></li>
			<li><a href="../voc/notice"><font color="#000000">공지사항</font><br><br><br></a></li>
			<li><a href="../voc/noticeClassify"><font color="#000000">공지사항/상세</font>
			</a></li>
		</div>  
		<div id="content"></div>
		<div id="footer"></div>
	</div>
</body>
