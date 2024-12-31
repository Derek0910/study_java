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
						<h1 align="center"> 게시판 목록</h1>
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
								<form name="boardList">
									<table>
										<tr>
											<th style="width:5%">글번호</th>
											<th style="width:5%">작성자</th>
											<th style="width:5%">글제목</th>
											<th style="width:5%">작성일</th>
											<th style="width:5%">조회수</th>
										</tr>
										
										<!-- 게시글이 있으면 -->
										<c:forEach var="dto" items="${list}">
											<tr>
												<td>${dto.b_num}</td>
												<td>${dto.b_writer}</td>
												<td>
													<a href=${path}/board_detailAction.bc?num=${dto.b_num}">${dto.b_title}</a>
												</td>
												<td>${dto.b_regDate}</td>
												<td>${dto.b_readCnt}</td>
											</tr>
										</c:forEach>
										
										<tr>
											<td colspan="5" align="center">
											<!-- 페이징 처리 -->
											<!-- 이전 버튼 활성화 -->
											<c:if test="${paging.startPage > 10}" >
												<a href="${path}/board_list.bc?pageNum=${paging.prev}">[이전]</a>
											</c:if>
											
											<!--  페이지 번호 처리 -->
											<c:forEach var="num" begin="${paging.startPage}" end="${paging.endPage}">
												<a href="${path}/board_list.bc?pageNum=${num}">${num}</a>
											</c:forEach>
											
											<c:if test="${paging.startPage < paging.pageCount}" >
												<a href="${path}/board_list.bc?pageNum=${paging.next}">[다음]</a>
											</c:if>
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