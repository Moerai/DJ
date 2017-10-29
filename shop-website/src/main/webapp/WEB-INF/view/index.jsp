<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>

    <link href="/styles/main.css" type="text/css" rel="stylesheet"/>
</head>
<body>

<h1>쇼핑몰 - 회원 리스트</h1>

		<p>
		${userName}
		</p>

<div>
	<c:forEach var="member" items="${members}">
		<p>
			${member.userId}
			,
			${member.userName}
			,
			${member.password}		
		</p>	
	
	</c:forEach>
</div>
	

</body>
</html>