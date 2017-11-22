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
            <li><h1>광고관리</h1></li>
            <li><a href="../ad/manageAD">-광고관리</a></li>
        </ul>
    </div>
</body>