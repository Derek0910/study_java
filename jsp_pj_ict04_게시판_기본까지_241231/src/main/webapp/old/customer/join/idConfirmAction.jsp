<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ID 중복확인</title>
<link rel="stylesheet" href="/jsp_pj_ict04/resources/css/customer/join.css">
<script src="/jsp_pj_ict04/resources/js/customer/join.js" defer></script>


</head>
<!--  <body onload="idConfirmFocus()">-->
<body>
<div class="wrap">
<div id="container">
	<div id="contents">
		<!-- 상단 중앙1 시작 -->
		<div id="section1">
			<h1 align="center"> ID 중복확인 </h1>
			</div>
				<!-- 상단 중앙2 시작 -->
				<div id="section2">
					<div id="s2_inner">
						<div class="join">
						
							<form name="confirmform" action="idConfirmAction.do" method="post" onsubmit="return idConfirmChk()">

								<%
									int selectCnt = (Integer)request.getAttribute("selectCnt");
									String user_id = (String)request.getAttribute("user_id");
									
									// id 중복일 때	, id를 입력받아 다시 중복체크	
									if(selectCnt==1){
									
								%> 
								<script>
									alert(<%=user_id %> + "는 사용할 수 없습니다.");
								</script>
														
								<table align="center" width="500px">
									<tr>
										<th colspan="2" align="center">
											<span> <%=user_id %>는 사용할 수 없습니다.</span>
										<td>
									</tr>
									<tr>
										<th align="center"> * 아이디</th>
										<td>
											<input class="input" type="text" name="user_id" size="20" placeholder="공백없이 20자 이내로 작성" required autofocus/>
										</td>
									</tr>
									
									<tr>
										<td colspan="2" style="border-bottom:none;">
											<br>
											<div align="right">
												<input class="inputButton" type="submit" value="확인" onclick="setUserid('<%=user_id%>')">
											</div>
											
										</td>
									</tr>
								</table>
								<%
									}
									// id 중복 아닐 때
									else{
								%>
								
								<table align="center" width="500px">
									<tr>
										<th colspan="2" align="center"> 
											<span><%=user_id %>는 사용할 수 있습니다.</span>
										</th>
									</tr>
									<tr>
										<th align="center"> * 아이디 </th>
										<td>
											<div>
												<input class="input" type="text" name="user_id" size="20" placeholder="공백없이 20자 이내로 작성" required autofocus />
											</div>
										</td>
									</tr>
									<tr>
										<td colspan="2" style="border-bottom:none;">
											<br>
											<div align="right">
												<input class="inputButton" type="submit" value="확인" onclick="setUserid('<%=user_id%>')">
											</div>
										</td>
									</tr>
								</table>
								
								<%
									}
								%>
								<!--  <table>
									<tr>
										<th> </th>
										<td>	
											<input type="text" class="input" name="user_id" required autofocus>
										</td>
									</tr>
									<tr>
										<td colspan="2" style="border-bottm:none">
											<br>
											<div align="right">
												<input class="inputButton" type="submit" value="확인">
												<input class="inputButton" type="reset" value="초기화">
											</div>
									</tr>
								</table>-->
							
							</form>
							
						</div>
					</div>
				</div>
			</div>
		</div>
	<!-- 컨텐츠 끝 -->
	</div>
</div>

</body>
</html>