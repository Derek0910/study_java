<%@page import="pj.mvc.jsp.dto.BookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/setting.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 반응형 웹 -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>main</title>

<!-- CSS -->
<link rel="stylesheet" href="${path}/resources/css/common/header.css">
<link rel="stylesheet" href="${path}/resources/css/common/footer.css">
<link rel="stylesheet" href="${path}/resources/css/customer/join.css">

<!-- JS -->
<script src="https://kit.fontawesome.com/c32217cc00.js" crossorigin="anonymous"></script>
<!-- 3-3-2. 자바스크립트 소스 연결(햄버거 버튼) -->
<!-- defer: HTML을 다 읽은 후에 자바스크립트를 실행한다. 페이지가 모두 로드된 후에 해당 외부 스크립트가 실행된다. -->
<script src="${path}/resources/js/common/main.js" defer></script>

<!-- join.js -->
<script src="${path}/resources/js/customer/join.js" defer></script>

</head>
<body>
   <div class="wrap"> <!-- 스타일을 해주려고 class명을 지정함  -->
      
      <!-- header 시작 -->
      <%@include file= "/common/header.jsp"%>
      
      <!-- header 끝 -->
      <hr>
      <!-- 컨텐츠 시작 -->
      <div id= "container">
         <div id="contents">
            <!-- 상단 중앙1 시작 -->
            <div id="section1">
               <h1 align="center">상세페이지</h1>
            </div>
            <!-- 상단 중앙2 시작 -->
            <div id="section2">
               <div id="s2_inner">
                  <div class="join">
                     
						<form name="modifyform" action="modifyCustomerAction.do" method="POST"
								onsubmit="return modifyCheck()">
                        <%
                        	BookDTO dto = null;
           					String[] hpArr = null, emailArr = null;
                        %>
                        
                        <c:if test="${selectCnt==1}">
                        
						   <%-- 2-1. 중복확인 --%>
						   <input type="hidden" name="hiddenUserid" value="0" />

						   <table>
                           <tr>
                           		<th> * 아이디</th>
                              <%-- <td><%=sessionID%></td> --%>
								<td>
									<input type="text" class="input" name="user_id" size="30" value="${dto.getUser_id()}" placeholder="공백없이 20자 이내로 작성" readonly />
								</td>
                           </tr>
                           
                           <tr>
                              <th> * 비밀번호 </th>
                              <td>
                                 <input type="password" class="input" name="user_password" size="30" placeholder="공백없이 30자이내로 작성" required >
                              </td>
                           </tr>
                           
                           <tr>
                              <th> * 비밀번호(확인) </th>
                              <td>
                                 <input type="password" class="input" name="re_password" size="30" placeholder="비밀번호 확인" required >
                              </td>
                           </tr>
                           
                           <tr>
                              <th> * 이름 </th>
                              <td>
                                 <input type="text" class="input" name="user_name" value="${dto.getUser_name()}" size="50" placeholder="이름 입력" required value=?>
                              </td>
                           </tr>
                           
                           <tr>
                              <th> * 생년월일 </th>
                              <td>
                                 <input type="date" class="input" name="user_birthday" value="${dto.getUser_birthday()}" size="8" placeholder="-없이 생년월일 8자리" required >
                              </td>
                           </tr>
                           <tr>
                              <th> * 주소 </th>
                              <td>
                                 <input type="text" class="input" name="user_address" value="${dto.getUser_address()}" size="50"  placeholder="주소 입력" required >
                              </td>
                           </tr>
                           
                           <tr>
                              <th> 핸드폰번호 </th>
                              <td>
                              <c:if test="${dto.getUser_hp() == null }">
                                 <input type="text" class="input" name="user_hp1" value="" size="3" style="width:50px">
                                 -
                                 <input type="text" class="input" name="user_hp2" value="" size="4" style="width:70px">
                                 -
                                 <input type="text" class="input" name="user_hp3" value="" size="4" style="width:70px">
                              </c:if>
                              <c:if test="${dto.getUser_hp() !=null }">
                              	 <c:set var="hpArr" value="${fn:split(dto.getUser_hp(), '-')}" />
                                 <input type="text" class="input" name="user_hp1" value="${hpArr[0]}" size="3" style="width:50px">
                                 -
                                 <input type="text" class="input" name="user_hp2" value="${hpArr[1]}" size="4" style="width:70px">
                                 -
                                 <input type="text" class="input" name="user_hp3" value="${hpArr[2]}" size="4" style="width:70px">
                              </c:if>
                              </td>
                           </tr>
                           <tr>
                              <th> * 이메일 </th>
                              <td>
                               	 <c:set var="emailArr" value="${fn:split(dto.getUser_email(), '@')}" />
                                 <input type="text" class="input" name="user_email1" value="${emailArr[0]}" size="4" style="width:100px" required>
                                 @
                                 <input type="text" class="input" name="user_email2" value="${emailArr[1]}" size="4" style="width:100px" required>
                                 <select class="input" name="user_email3" style="width:100px" required onchange="u_selectEmailChk()">
                                    <option value="0">직접입력</option>
                                    <option value="naver.com">네이버</option>
                                    <option value="google.com">구글</option>
                                    <option value="daum.net">다음</option>
                                    <option value="nate.com">네이트</option>
                                 </select>
                              </td>
                           </tr>
                           <tr>
                              
                              <td colspan="2" style="border-bottom:none">
                                 <br>
                                 <div align="right">
                                    <input class="inputButton" type="submit" value="수정완료">
                                    <input class="inputButton" type="reset" value="초기화">
                                    <input class="inputButton" type="button" value="수정취소" onclick="window.location='${path}/main.do'"> 
                                 </div>
                              </td>
                           </tr>
                        </table>
                        </c:if>
                        
                         <c:if test="${selectCnt!=1}">
                         
	                         <script type="text/javascript">
	                         	alert{"인증실패!!"}
	                         	window.location="window.location='${path}/modufyCustomer.do'"
	                         </script>
						 </c:if>
                     </form>
                  
                  </div>
               </div>
            </div>
         </div>
      </div>
      <!-- 컨텐츠 끝 -->
      <hr>
      <!-- footer 시작 -->
      <%@include file= "/common/footer.jsp"%>
      
      <!-- footer 끝 -->
   </div>
   
</body>
</html>