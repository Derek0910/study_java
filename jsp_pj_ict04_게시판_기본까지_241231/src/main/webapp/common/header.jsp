<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/setting.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>header</title>
 </head>
<body>

	<!-- header 시작 -->
	<nav class="navbar">
		<ul class="navbar_title">
			<li>
				<i class="fa-solid fa-microchip"></i>
				<i class="fa-solid fa-hexagon-nodes"></i>
				<i class="fa-solid fa-fire-extinguisher"></i>
			</li>
		</ul>

		<ul class="navbar_menu">
			<li><a href="${path}/main.do"><i class="fa-solid fa-house"></i></a></li>
			<li><a href="#">제품소개</a></li>
			<li><a href="#">Q&A</a></li>
		</ul>

		<ul class="navbar_icons">
			<li>
				<a href="https://x.com/"><i class="fa-brands fa-x-twitter"></i></a>
			</li>
			<li>
				<a href="https://www.facebook.com/"><i class="fa-brands fa-facebook"></i></a>
			</li>
			<li>
				<a href="${path}/login.do">LOGIN</a>
			</li>
			<li>
				<a href="${path}/join.do">JOIN</a>
			</li>
			<li>
				<a href="#"><i class="fa-solid fa-cart-shopping"></i></a>
			</li>
			<li>
				<a href="${path}/join.do"><i class="fa-solid fa-user"></i></a>
			</li>
		</ul>
	
		<!-- 반응형웹 (1). 햄버거 아이콘 : -->
		<a href="#" class="navbar_toggleBtn">
			<i class="fa-solid fa-burger"></i>
		</a>
	</nav>
	
	<!-- header 끝 -->
</body>
</html>