<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/setting.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%-- 반응형 웹 --%>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>회원탈퇴</title>

<%-- css --%>
<link rel="stylesheet" href="/jsp_pj_ict04/resources/css/common/header.css" />
<link rel="stylesheet" href="/jsp_pj_ict04/resources/css/common/footer.css" />
<link rel="stylesheet" href="/jsp_pj_ict04/resources/css/customer/join.css" />

<%-- js --%>
<script src="https://kit.fontawesome.com/7e4a37168e.js" crossorigin="anonymous"></script>
<%-- (3-3-2). 햄버거버튼 - 자바스크립트 소스 연결 --%>
<%-- defer : html을 다 읽은 후에 자바스크립트를 실행한다.
	페이지가 모두 로드된 후에 해당 외부 스크립트가 실행된다. --%>
<script src="${path}/resources/js/common/main.js" defer></script>

<%-- join.js --%>
<script src="${path}/resources/js/customer/join.js" defer></script>

</head>
<body>
	<div class="wrap">
		<%-- header 시작 --%>
		<%-- <jsp:include page="header.jsp" /> --%>
		<%@ include file="/common/header.jsp" %>

		<%-- header 끝 --%>
		

		<%-- 컨텐츠 시작 --%>
		<div id="container">
			<div id="contents">
				<%-- 상단 중앙1 시작 --%>
				<div id="section1">
					<h1 align="center"> 회원탈퇴 - 확인 </h1>
				</div>

				<%-- 상단 중앙2 시작 --%>
				<div id="section2">
					<div id="s2_inner">
						<div class="join">

							<form name="deleteform" action="deleteCustomerAction.do" method="POST">

								<table>
									 <tr><th colspan="2" align="center">
										<span style="color:#FF82AA">
											<b><%= request.getSession().getAttribute("sessionID") %></b>
										</span>님 비밀번호를 입력하세요!!
									</th></tr>

									<tr>
										<th> * 비밀번호 </th>
										<td>
											<input type="password" class="input" name="user_password" size="20" placeholder="공백없이 20자 이내로 작성" required autofocus />
										</td>
									</tr>

									<tr>
										<td colspan="2" style="border-bottom:none">
											<br>
											<div align="right">
												<input class="inputButton" type="submit" value="회원탈퇴" />
												<input class="inputButton" type="button" value="취소" onclick="window.location='${path}/main.do'" />
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
		<%-- 컨텐츠 끝 --%>
		

		<%-- footer 시작 --%>
		<%@ include file="/common/footer.jsp" %>
		

		<%-- footer 끝 --%>
		
	</div>
</body>
</html>