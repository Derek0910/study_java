<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 반응형 웹 -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<title>로그인 페이지</title>
	<!-- css -->
	<link rel="stylesheet" href="/jsp_pj_ict04/resources/css/common/header.css">
	<link rel="stylesheet" href="/jsp_pj_ict04/resources/css/common/footer.css">
	<link rel="stylesheet" href="/jsp_pj_ict04/resources/css/customer/login.css">
	
	<!-- js -->
	<script src="https://kit.fontawesome.com/3f6025c3d2.js" crossorigin="anonymous"></script>
	<!-- (3-3-2). 햄버거버튼 - 자바스크립트 소스 연결 -->
	<!-- defer : html을 다 읽은 후에 자바스크립트를 실행한다. 페이지가 모두 로드된 후에 해당 외부 스크립트가 실행된다. -->
	<script src="/jsp_pj_ict04/resources/js/common/main.js" defer /></script>
</head>
<body>
	<div class="wrap">
		<div>
		<!-- header 가져오기 -->
			<%@ include file="../../common/header.jsp" %>
	
		<!-- header 끝-->
		</div>
		
		<div>
		<!-- 컨텐츠 시작 -->
		<div id="container">
			<div id="contents">
				<!-- 상단 중앙1 시작 -->
				<div id="section1">
					<h1 align="center"> 로그인 </h1>
				</div>
				
				<!-- 상단 중앙2 시작 -->
				<div id="section2">
					<div id="s2_inner">
						<div class="login">
						
							<form name="loginform" action="loginAction.do" method="post">
							
							<table>
								<tr>
									<th> * 아이디 </th>
									<td>
										<input type="text" class="input" name="user_id" size="20" placeholder="공백없이 20자 이내로 작성" required autofocus>
									</td>
								</tr>
								<tr>
									<th> 비밀번호 </th>
									<td>
										<input type="password" class="input" name="user_password" size="20" placeholder="공백없이 20자 이내로 작성" required >
									</td>
								</tr>
																
								<tr>
									<td colspan="2" style="text-align:right;">
										<div>
											<input class="inputButton" type="submit" value="로그인">
											<input class="inputButton" type="reset" value="초기화">
											<input class="inputButton" type="button" value="회원가입" onclick="window.location='join.do'">
										</div>
									</td>
								</tr>
								
							</table>
							
							
							</form>
							
						</div>
					</div>
				</div>
			</div>
		</div>
			
		<!-- 컨텐츠 끝 -->
		</div>
		
		<div>
		<!-- footer 시작 -->
			<%@ include file="../../common/footer.jsp" %>
		<!-- footer 끝 -->
		</div>
	</div>
</body>
</html>