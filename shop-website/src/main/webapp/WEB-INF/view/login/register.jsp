<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="Generator" content="EditPlus®">
    <meta name="Author" content="">
    <meta name="Keywords" content="">
    <meta name="Description" content="">
    <link rel="stylesheet" href="../../../../htmls/css/JSstyle.css">
    <title>Document</title>
</head>
<body>
    <table border="2" bgcolor="" align="center" class="table">
        <FORM action = "registerchecked" method = "post" onsubmit="return input_check_func()">
            <tr>
                <td class="td">닉네임</td>
                <td>
                    <input type="text" name = "nickname"/>
                </td>
            </tr>
            <tr>
                <td class="td">아이디</td>
                <td>
                    <input type="text" id = "register-id" name = "register-id"/>
                </td>
            </tr>
            
            <tr>
                <td class="td">비밀번호</td>
                <td>
                    <input type="password" id = "register-pw" name = "register-pw"/>
                </td>
            </tr>
            <tr>
                <td class="td">비밀번호확인</td>
                <td>
                    <input type="password" id = "pw-check" name = "pw-check"/>
                </td>
            </tr>
            <tr>
                <td class="td">이메일</td>
                <td>
                    <input type="text" name = "mail-id"/>@
                    <input type="text" name = "mailaddr" />
                </td>
            </tr>
            <tr>
                <td class="td">휴대전화</td>
                <td>
                    <input type="text" size="6" name = "phone1"/>-
                    <input type="text" size="6" name = "phone2"/>-
                    <input type="text" size=6 name = "phone3"/>
            </tr>
            <tr>
                <td class="td">주소</td>
                <td>
                    <input type="text" name = "addr"/>
            </tr>
            <tr>
                <td class="td"></td>
                <td>
                    <input type="text" />
            </tr>
            <tr>
                <td class="td">상세주소</td>
                <td>
                    <input type="text" name = "detail-addr"/>
            </tr>
            <tr>
                <td class="td">학번</td>
                <td>
                    <input type="text" name = "schoolNum"/>
            </tr>
            <tr height="2" bgcolor="#FFC8C3">
                <td colspan="2"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <a href="www.naver.com/">
                        <input type="submit" value="회원가입">
                    </a>
                </td>
            </tr>
    </table>
    </form>
     <script>
    function input_check_func() {
        var id = document.getElementById('register-id').value;
        var pw = document.getElementById('register-pw').value;
        var pwcheck = document.getElementById('pw-check').value;
        
        if(id == null || pw == null || id == ""   || pw == "") {
            alert("공백을 사용하실 수 없습니다.");
            return false;
        } else {
        	  if(pw != pwcheck){
              	alert("비밀번호가 같지 않습니다.")
              	return false;
              }else {
              	return true;
              }
        }
      
    }    
    </script>
</body>

</html>