<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/setting.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<%-- 반응형 웹 --%>
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<title>회원정보수정</title>

	<%-- css --%>
	<link rel="stylesheet" href="${path}/resources/css/common/header.css" />
	<link rel="stylesheet" href="${path}/resources/css/common/footer.css" />
	<link rel="stylesheet" href="${path}/resources/css/customer/join.css" />

	<%-- js --%>
	<script src="https://kit.fontawesome.com/7e4a37168e.js" crossorigin="anonymous"></script>
	<%-- (3-3-2). 햄버거버튼 - 자바스크립트 소스 연결 --%>
	<%-- defer : html을 다 읽은 후에 자바스크립트를 실행한다.
		페이지가 모두 로드된 후에 해당 외부 스크립트가 실행된다. --%>
	<script src="${path}/resources/js/customer/main.js" defer></script>

	<%-- join.js --%>
	<script src="${path}/resources/js/customer/join.js" defer></script>

</head>
<body>
	<div>
		<%-- header 시작 --%>
		<%-- <jsp:include page="header.jsp" /> --%>
		<%@ include file="/common/header.jsp" %>

		<%-- header 끝 --%>
		<c:if test="${updateCnt==1}">
			처리결과 ${updateCnt} : 성공
			<script type="text/javascript">
				alert("정보수정 성공!!");
				window.location = "main.do";
			</script>
		</c:if>
		<c:if test="${updateCnt!=1}">
			처리결과 ${updateCnt} : 실패
			<script type="text/javascript">
				alert("정보수정 실패!!");
				window.location = "${path}/modifyDetailAction.do";
			</script>
		</c:if>
		
		<%-- footer 시작 --%>
		<%@ include file="/common/footer.jsp" %>

		<%-- footer 끝 --%>
	</div>
</body>
</html>