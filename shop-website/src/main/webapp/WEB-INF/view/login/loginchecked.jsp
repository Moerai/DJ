<%@ page language="java" 
    contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"
    import="java.sql.*"%>
<%
    request.setCharacterEncoding("euc-kr");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title> Login_Check </title>
</head>
<body>

    <%
    try {
        // ����̹� �ε�
        String driver = "net.sf.log4jdbc.sql.jdbcapi.DriverSpy";
        Class.forName(driver);
        
        // ������ Login
        String url = "jdbc:log4jdbc:mysql://db.anyintervue.com:43306/it201702_shop_db?autoReconnect=true&useUnicode=true&characterEncoding=utf8";
        String id = "it201702_shop";
        String pw = "#it201702_shop@";
        
        // ����
        Connection conn = DriverManager.getConnection(url, id, pw);
        
         // sql ����
         // �� �������� LOGIN.jsp input�� �Է��� ������ ������ ��´�
         String user_id= request.getParameter("login-name");
         String user_pw= request.getParameter("login-pass");
         
        Statement st = conn.createStatement();
        // ���� �Է��� id�� pw ���� DB�ȿ� �ִ��� Ȯ���Ѵ�
        String sql = "SELECT * FROM MEMBER WHERE USER_ID='" + user_id + "' AND PASSWORD='" + user_pw + "'";
        //st.executeUpdate(sql);
        ResultSet rs = st.executeQuery(sql);
        
        // isLogin �� �α��� Ȯ�� ������ ���� ����
        Boolean isLogin = false;
        while(rs.next()) {
            // rs.next�� true ��� = ������ �ִ�
            isLogin = true;
        }
        
        // DB�� ���� ���� ������ �ִٸ�
        if(isLogin) {
            // ���� �α����� id�� pw�� session�� �����ϰ�
            session.setAttribute("id", user_id); 
            session.setAttribute("pw", user_pw);
            // ù �������� ����������
            response.sendRedirect("Front");
        } else {
            // DB�� �������� ������ ���ٸ� ���â�� ����ش�
            %> <script> alert("�α��� ����"); history.go(-1); </script> <%            
        }
        
        
    } catch (Exception e) {    
    	out.println(e.getMessage());
        out.println("DB ���� ����");
    }
    %>
 
</body>
</html>