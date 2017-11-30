<%--
  Created by IntelliJ IDEA.
  User: pss
  Date: 2017-11-15
  Time: 오전 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<<head>
<meta charset="utf-8"/>
<title>대중 관리자 홈페이지</title>
<style>
    #sidebar{
    width:220px;
    height:600px;
    float:left;
    display: block;
    margin-left:30px;
    padding-left:50px;
    background-color: #DAC1AD;
    margin-right:10px;
    }
    ul li{
        margin-top:10px;
        list-style:none;
    }
</style>
</head>
<body>
    <div id="sidebar">
        <ul>
            <li><h1>회원관리</h1></li>
            <li><a href="../member/memberList">-회원 관리</a></li>
            <li><a href="../member/memberse">-탈퇴 회원</a></li>
            <li><a href="../member/memberRank">-회원 등급</a></li>
        
        </ul>
    </div>
</body>