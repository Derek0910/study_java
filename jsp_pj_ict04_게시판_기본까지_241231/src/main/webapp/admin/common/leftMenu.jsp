<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/setting.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 좌측메뉴</title>
	<!-- css -->
	<link rel="stylesheet" href="${path}/resources/css/admin/ad_boardList.css">
</head>
<body>
	<!-- 좌측메뉴 시작 -->
	<div id="left">
		<div class="left_inside">
			<!-- 좌측 메뉴바 시작 -->
				<div class="inside_wrap">
					<h3>관리자 메뉴</h3>
					<hr>
					<ul class="left_menubar">
						<li>
							<h4>상품관리</h4>
							<ul class="product_menu">
								<li><a href="#">상품목록</a></li>
								<li><a href="#">상품등록</a></li>
								<li><a href="#">카테고리</a></li>
							</ul>
						</li> <!-- 상품관리 -->
						<li>
							<h4>주문관리</h4>
							<ul class="product_menu">
								<li><a href="#">주문목록</a></li>
								<li><a href="#">주문승인</a></li>
								<li><a href="#">환불요청</a></li>
								<li><a href="#">환불완료</a></li>
								<li><a href="#">환불취소</a></li>
							</ul>
						</li> <!-- 주문관리 -->
						
						<li>
							<a href="#">회원목록</a>
						</li> <!-- 회원목록 -->
						
						<li>
							<a href="#">게시판</a>
						</li> <!-- 게시판 -->
						
						<li>
							<a href="#">결산</a>
						</li> <!-- 결산 -->
						
						<li>
							<a href="#">로그아웃</a>
						</li> <!-- 로그아웃 -->
					</ul>
				</div>
				
			<!-- 좌측 메뉴바 끝 -->
		</div>
	
	</div>

</body>
</html>