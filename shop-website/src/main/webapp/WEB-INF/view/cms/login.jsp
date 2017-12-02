<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Insert title here</title>
    <link href="/styles/hal.css" rel="stylesheet" type="text/css">
</head>
<body>

<div class="all">
    <div class="in">
        <div>
            <strong style="font-size:30px;">LOGIN</strong>

            <form method="post">

                <input type="text" placeholder="아이디" id="userid" name="id" class="f"
                       style="height:40px; margin-top:10%;"/>

                <input type="password" placeholder="비밀번호" id="password" name="pw"
                       style="height:40px; margin-top:10%;">

                <input type="submit" value="로그인" style="font-size:20px; height:120px; width:120px;
			 	bottom:-1%; margin-left:180px">
            </form>
        </div>
    </div>
</div>
</body>
</html>