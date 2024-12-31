<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/common/setting.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<!-- css -->
<link rel="stylesheet" href="${path}/resources/css/common/header.css">
<link rel="stylesheet" href="${path}/resources/css/common/footer.css">
<link rel="stylesheet" href="${path}/resources/css/admin/ad_boardList.css">

	<!-- js -->
	<script src="https://kit.fontawesome.com/3f6025c3d2.js" crossorigin="anonymous"></script>
	<!-- (3-3-2). 햄버거버튼 - 자바스크립트 소스 연결 -->
	<!-- defer : html을 다 읽은 후에 자바스크립트를 실행한다. 페이지가 모두 로드된 후에 해당 외부 스크립트가 실행된다. -->
	<script src="${path}/resources/js/common/main.js" defer /></script>

</head>
<body>

	<div class="wrap">
		<!-- header 시작 -->
		<div class="header_wrap">
			<%@ include file="/common/header.jsp" %>
		</div>
		<!-- header 끝 -->
		
		<!-- 컨텐츠 시작 -->
			<div id="container"> 
				<div id="contents"> 
					<!-- 상단 중앙1 시작 -->
					<div id="section1">
						<h1 align="center">상세 페이지</h1>
					</div>
					<!-- 상단 중앙1 종료 -->
					
					
					<!-- 상단 중앙2 시작 -->
					<div id="section2">
						<!-- 좌측 메뉴 시작 -->
						<%@ include file="/admin/common/leftMenu.jsp" %>
						<!-- 좌측 메뉴 끝 -->
						
						<!-- 우측 화면 시작 -->
						<div id="right">
							<div class="table_div">
								<form name="detailForm" method="post">
									<table>
										<tr>
											<th style="width:200px">글번호</th>
											<td style="width:200px">?</td>
											<th style="width:200px">조회수</th>
											<td style="width:200px">?</td>
										</tr>
										<tr>
											<th style="width:200px">작성자</th>
											<td style="width:200px">?</td>
											<th style="width:200px">비밀번호</th>
											<td style="width:200px">?</td>
										</tr>
										<tr>
											<th style="width:200px">글제목</th>
											<td colspan="3">?</td>
										</tr>
										<tr>
											<th style="width:200px">글내용</th>
											<td colspan="3">?</td>
										</tr>
										
										<tr>
											<th style="width:200px">작성자</th>
											<td colspan="3">?</td>
										</tr>
										
										<tr>
											<td colspan="4" align="center">
												<input type="button" class="inputButton" value="수정/삭제" id="">
												<input type="button" class="inputButton" value="목록" id="">
											</td>
										</tr>
									</table>
								</form>
							</div>
						</div>
						<!-- 우측 화면 끝 -->
					</div>
					<!-- 상단 중앙2 종료 -->
				</div>
			</div>
		
		
		<!-- 컨텐츠 끝 -->
		<!-- footer 시작 -->
		<div class="footer_wrap">
			<%@ include file="/common/footer.jsp" %>
		</div>
		<!-- footer 끝 -->
		
	</div>

</body>
</html>