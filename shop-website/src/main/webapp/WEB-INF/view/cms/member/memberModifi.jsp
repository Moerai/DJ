<%--
  Created by IntelliJ IDEA.
  User: pss
  Date: 2017-12-01
  Time: 오후 4:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원정보수정</title>
</head>
<body>
<jsp:include page="/WEB-INF/view/cms/top_menu.jsp"></jsp:include>
<jsp:include page="/WEB-INF/view/cms/member/member_sidebar.jsp" ></jsp:include>
<div id="full">

    <tr>
        <tr>회원이름 : <input type="text" value="${member.userName}"></tr>
        <tr>회원상태 : <input type="text" value="${member.state}"></tr>
        <tr>아이디 : ${member.userId}</tr>
        <tr>닉네임 : <input type="text" value="${member.nickName }"></tr>
        <tr>헨드폰 : <input type="text" value="${member.phone}"></tr>
        <tr>주소 : <input type="text" value="${member.address}"></tr>
        <tr>학번 : <input type="text" value="${member.studentNum}"></tr>
    </tr>

</div>


</body>
</html>
