<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="setting.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 반응형 웹 -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Insert title here</title>
<!-- css -->
<link rel="stylesheet" href="${path}/resources/css/common/header.css">
<link rel="stylesheet" href="${path}/resources/css/common/main.css">
<link rel="stylesheet" href="${path}/resources/css/common/footer.css">

<!-- js -->
<script src="https://kit.fontawesome.com/3f6025c3d2.js" crossorigin="anonymous"></script>
<script src="${path}/resources/js/common/main.js" defer></script>

</head>
<body>
	<div class="wrap">
		<div>
		<!-- header 가져오기 -->
			<%@ include file="./header.jsp" %>
	
		<!-- header 끝-->
		</div>
		
		<div>
		<!-- 컨텐츠 시작 -->
			<center>
				<h1>main</h1>
				<img src="${path}/resources/images/cake_01.jpg" style="width:300px; height: auto">
			</center>
		<!-- 컨텐츠 끝 -->
		</div>
		
		<div>
		<!-- footer 시작 -->
			<%@ include file="./footer.jsp" %>
		<!-- footer 끝 -->
		</div>
	</div>
</body>

</html>