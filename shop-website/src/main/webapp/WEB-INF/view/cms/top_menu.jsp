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
	height: 100px;
	width: 150px;
	float: left;
	background-color: blue;
}

#select {
	width: 1700px;
	height: 100px;
	/* background-color: red; */
	float: left;
}
 
#log {
	width: 200px;
	height: 60px;
	float: right;
	/*background-color: green;*/
}
/* #sidebar{
      width:120px;
      height:600px;
      float:left;
      background-color: orange;
  }
  #content{
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
	line-height: 100px; 
	margin : 0 15px;
	padding: 10px;
	margin: 0 15px;
} 

#log ul li {
	margin: 0 25px;
	padding: 15px;
}
</style>
</head>
<body>
	<div id="frame">
		<div id="logo">
			<a href="Backindex.jsp"><img src=""></a>
		</div>
		<div id="select">
			<ul style="padding: 0">
				<li><a href="../member/memberList">회원리스트</a></li>
				<li><a href="../market/productList">중고장터/상품리스트</a></li>
				<li><a href="../market/productProhibit">중고장터/금지언어</a></li>
				<li><a href="../board/boardList">게시판관리/게시판리스트</a></li>
				<li><a href="../board/boardRegister">게시판관리/게시판등록</a></li>
				<li><a href="../ad/manageAD">광고관리</a></li>
				<li><a href="../voc/notice">공지사항</a></li>
				<li><a href="../voc/noticeClassify">공지사항/상세</a></li>
				<div id="log">
					<li><a href="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;logout</a></li>
				</div>
			</ul>
		</div>
		<div id="sidebar"></div>
		<div id="content"></div>
		<div id="footer"></div>
	</div>
</body>
