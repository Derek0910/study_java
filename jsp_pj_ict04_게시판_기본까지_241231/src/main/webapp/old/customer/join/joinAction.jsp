<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="wrap">
		<%@ include file="../../common/header.jsp" %>
		<%	
 		int insertCnt = (Integer)request.getAttribute("insertCnt");
		if(insertCnt==1){
		%>
			<script type="text/javascript">
				alert("회원가입 성공!!")
				window.location="/jsp_pj_ict04/login.do"
			</script>
		
		<%
			}
				else{
		%>
			<script type="text/javascript">
				alert("회원가입 실패!!")
				window.location="/jsp_pj_ict04/join.do"
			</script>				
		<%
			} 
			
		%>
		<div>
		<!-- 컨텐츠 끝 -->
		
		
		<!-- footer 시작 -->
			<%@ include file="../../common/footer.jsp" %>
		<!-- footer 끝 -->
		</div>
	</div>

</body>
</html>