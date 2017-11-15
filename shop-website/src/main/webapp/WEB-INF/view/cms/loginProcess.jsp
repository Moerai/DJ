<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<%@ page import ="cmsdata.UserDAO"%>
	<%@ page import ="java.io.PrintWriter"%>
<%@ page import="cmsdata.User" %>
<jsp:useBean id="user" class="cmsdata.User" scope="page"/>
	<jsp:setProperty name="user" property="userID"/>
	<jsp:setProperty name="user" property="userPassword"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>로그인 프로세스 페이지</title>
</head>
<body>
	<%
		UserDAO userDAO = new UserDAO();
		int result = userDAO.longin(user.getUserID(), user.getUserPassword());
		if(result==1){
		    PrintWriter script = response.getWriter();
		    script.println("<script>");
		    script.println("location.href='member.memberList.jsp'");
		    script.println("history.block()");
		    script.println("</script>");
		}else if(result==2){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('비밀번호가 틀립니다.')");
			script.println("history.block()");
			script.println("</script>");
		}else if(result==-1){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('존재하지 않는 아이디입니다.')");
			script.println("history.block()");
			script.println("</script>");
		}else if(result==-2){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('데이터배이스 오류가 발생했습니다.')");
			script.println("history.block()");
			script.println("</script>");
		}
	%>

</body>
</html>