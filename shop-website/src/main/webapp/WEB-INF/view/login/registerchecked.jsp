<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" import="java.sql.*"%>
<%
	request.setCharacterEncoding("euc-kr");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JoinCheck</title>
</head>
<body>
	<%
		// 회원가입에 필요한 값들을 변수에 담아준다
		String user_name = "";
		String state = "";
		String user_id = request.getParameter("register-id");
		String password = request.getParameter("register-pw");
		int exp = 0;
		String nick_name = request.getParameter("pw-nickname");
		String email = request.getParameter("mail-id") + "@" + request.getParameter("mailaddr");
		String phone = request.getParameter("phone1") + "-" + request.getParameter("phone2") + "-"
				+ request.getParameter("phone3");
		String address = request.getParameter("addr") + request.getParameter("detail-addr");
		String birthday = "2017-01-01";
		
		try {
			String driver = "net.sf.log4jdbc.sql.jdbcapi.DriverSpy";
			Class.forName(driver);

			// 관리자 Login
			String url = "jdbc:log4jdbc:mysql://db.anyintervue.com:43306/it201702_shop_db?autoReconnect=true&useUnicode=true&characterEncoding=utf8";
			String id = "it201702_shop";
			String pw = "#it201702_shop@";

			// 연결
			Connection conn = DriverManager.getConnection(url, id, pw);
			Statement st = conn.createStatement();
			String sql = "INSERT INTO MEMBER VALUES ('" + user_name +"','" + state +"','"+user_id + "','" +password + "','" +exp+"','"+ nick_name + "','"
					+ email + "','" + phone + "','" + address + "','"+birthday+"')";
			st.executeUpdate(sql);

			// 회원가입에 성공하였으면 첫 페이지로 보낸다
			
			response.sendRedirect("loginpage");

		} catch (Exception e) {
			out.println(e.getMessage());
			out.println("DB 연동 실패");
		}
	%>
</body>
</html>

