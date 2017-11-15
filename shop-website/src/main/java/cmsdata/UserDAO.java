package cmsdata;

import java.sql.*;

public class UserDAO {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public UserDAO(){
        try {
            String dbURL = "jdbc:mysql:localhost:8080";
            String dbID="";
            String dbPassword="";
            Class.forName("shop-website.");
            conn = DriverManager.getConnection(dbURL,dbID,dbPassword);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public int longin(String userID, String userPassword){
        String SQL = "SELECT userPassward from USER WHERE userID=?";
        try{
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1,userID);
            rs = pstmt.executeQuery();
            if(rs.next()){
                if(rs.getString(1).equals(userPassword))
                    return 1; //로그인 성공
                else
                    return 0; //비밀번호 불일치
            }
            return -1;//아이디가 없음
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -2;
    }
}