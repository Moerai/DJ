<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- bootstrap connect -->
    <title>대학생 중고장터 :: 대중</title>
	<link rel="stylesheet" href="../../resources/bootstrap.min.css">
	<link rel="stylesheet" href="../../resources/bootstrap/bootstrap-theme.min.css">	
</head>
  <body>
    <!--  메인 페이지 시작 / container 로 전체 div를 영역 잡아서 얖옆 여백 주기 -->
    <div class="container">
        <!-- nav bar 부분 시작 -->
        <nav class="navbar navbar-default navbar-fixed-top">
          <div class="container">
            <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
            data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand"href="main.html">메인 홈페이지</a>
          </div>
          <!-- 중고장터 부분 마우스 오버하면 새로운 리스트 출력  -->
      <div id="navbar" class="collapse navbar-collapse">
        <ul class="nav navbar-nav">
          <li role="presentation" class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown"
            role="button" aria-expanded="false">중고장터</a>
            <ul class="dropdown-menu" role="menu">
              <li><a href="">전체보기</a></li>
              <li><a href="">옷</a></li>
              <li><a href="">신발</a></li>
              <li><a href="">전자제품</a></li>
              <li><a href="">시계</a></li>
            </ul>
          </li>
            <!-- 우리들의 이야기 부분 마우스오버 효과  -->
          <li role="presentation" class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown"
            role="button" aria-expanded="false">우리들의 이야기</a>
            <ul class="dropdown-menu">
              <li><a href="">홍보 게시판</a></li>
              <li><a href="">연애 게시판</a></li>
              <li><a href="">공부 게시판</a></li>
              <li><a href="">음주 게시판</a></li>
            </ul>
          </li>
            <li><a href="">로그인</a></li>
            <li><a href="">회원가입</a></li>
        </ul>
      </div>
  </div>
</nav>
      <!-- 파워링크 / 인기게시글 (like) DB 쿼리문 인기순 처리  -->
<div class="container">
  <div class="jumbotron">
    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="..." alt="...">
      <div class="carousel-caption">
        ...
      </div>
    </div>
    <div class="item">
      <img src="..." alt="...">
      <div class="carousel-caption">
        ...
      </div>
    </div>
    ...
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
  </div>
</div>
<div>
  <h3>#인기게시글</h3>
    <div class="row">
      <div class="col-xs-10 col-xs-offset-1">
        <div class="table-responsive">
          <table class="table table-striped table-hover">
            <tr>
              <td>제목</td>
              <td>작성자</td>
              <td>날짜</td>
            </tr>
            <tr>
              <td>안녕하세요, 테스트 중입니다.</td>
              <td>관리자</td>
              <td>2017.10.10</td>
            </tr>
            <tr>
              <td>안녕하세요, 테스트 중입니다.</td>
              <td>관리자</td>
              <td>2017.10.10</td>
            </tr>
            <tr>
              <td>안녕하세요, 테스트 중입니다.</td>
              <td>관리자</td>
              <td>2017.10.10</td>
            </tr>
          </table>
          </div>
        </div>
      </div>
    </div>
      <div>
        <!-- footer 부분  -->
        <h3>#회사정보</h3>
        <ul>
          <p>대학생 중고 장터 플랫폼 :: 대중 &copy</p>
        </ul>
      </div>
    </div>
    <!-- jquery & javascript connect  -->
	<script src="/webjars/jquery/2.1.3/dist/jquery.min.js"></script>
	<script src="/webjars/bootstrap/3.3.4/dist/js/bootstrap.min.js"></script>
  </body>
</html>
