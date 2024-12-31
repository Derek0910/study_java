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
<link rel="stylesheet" href="${path}/resources/css/common/header.css" />
<link rel="stylesheet" href="${path}/resources/css/common/footer.css" />
<link rel="stylesheet" href="${path}/resources/css/customer/join.css" />

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
							<c:if test="${deleteCnt==1}">
								<table>
									 <tr><td colspan="2" align="center">
										<span style="color:#FF82AA">
											<b>${sessionScope.sessionID}</b>
										</span>님 탈퇴가 완료되었습니다.
									</td></tr>
	
									<tr>
										<td colspan="2" style="border-bottom:none">
											<br>
											<div align="right">
												<input class="inputButton" type="button" value="확인" onclick="window.location='${path}/main.do'" />
											</div>
										</td>
									</tr>
								</table>
							</c:if>
							<c:if test="${deleteCnt==0}">
								<script type="text/javascript">
									alert("회원삭제 실패!");
									window.location="${path}/deleteCustomer.do";
								</script>
							</c:if>
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