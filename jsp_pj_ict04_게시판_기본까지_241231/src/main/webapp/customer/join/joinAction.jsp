<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/setting.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="wrap">
		<%@ include file="../../common/header.jsp" %>
		<c:if test="${insertCnt == 1}">
			<script type="text/javascript">
				alert("회원가입 성공!!")
				window.location="${path}/login.do"
			</script>
		</c:if>
		
		<c:if test="${insertCnt != 1}">
			<script type="text/javascript">
				alert("회원가입 실패!!")
				window.location="${path}/join.do"
			</script>				
		</c:if>
		<div>
		<!-- 컨텐츠 끝 -->
		
		
		<!-- footer 시작 -->
			<%@ include file="/common/footer.jsp" %>
		<!-- footer 끝 -->
		</div>
	</div>

</body>
</html>