<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<style>
table, td, th {
height:30px;
border-collapse:collapse;
text-align : center;
}
th, td {
width:100px;
padding:5px;
}
th {
background:#D5D5D5;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Insert title here</title>
	<link href="/styles/hal.css" rel="stylesheet" type="text/css">
</head>

 <body>
 	<jsp:include page="/WEB-INF/view/cms/top_menu.jsp" ></jsp:include>

	<h1 aling="center"><br><br><br> FNQ - FNQ 등록 <br><br></h1>
 <br><br>
 <table align = "center">
<tr>
<th> 검색키워드 </th>
<td>
<select name="Keyward">
    <option value="">Dropdown</option>
    <option value="">Dropdown</option>
    <option value="">Dropdown</option>
    <option value="">Dropdown</option>
</select></td>
</tr>
<tr><td></td></tr>
<tr>
<th> 등록일 </th>
  <td><textarea cols="10" placeholder=" " name="content"></textarea></td>
  </tr>
  </table>
  <br><br><br>
  <table border = "1" align = "center">
  <tr>
  <th>No.</th>
  <th>제목</th>
  <th>등록일</th>
  <th>작성자</th>
  <th>상태</th>
  </tr>

  <tr>
  <td> 1 </td>
  <td> </td>
  <td> </td>
  <td> </td>
  <td> </td>
  </tr>

  <tr>
  <td> 2 </td>
  <td> </td>
  <td> </td>
  <td> </td>
  <td> </td>
  </tr>

  <tr>
  <td>  </td>
  <td> </td>
  <td> </td>
  <td> </td>
  <td> </td>
  </tr>

  <tr>
  <td>  </td>
  <td> </td>
  <td> </td>
  <td> </td>
  <td> </td>
  </tr>

  <tr>
  <td>  </td>
  <td> </td>
  <td> </td>
  <td> </td>
  <td> </td>
  </tr>
</table>
 </body>
</html>
