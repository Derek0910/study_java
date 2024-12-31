/**
 * join.js
 */
 
// 3-1. join.jsp selectEmailChk


let hostIndex = location.href.indexOf( location.host ) + location.host.length;
let contextPath = location.href.substring( hostIndex, location.href.indexOf('/', hostIndex + 1) );

const path = contextPath;
function selectEmailChk(){
	if(document.joinform.user_email3.value == "0"){
		document.joinform.user_email2.value = "";
		document.joinform.user_email2.focus();
		return 1;
	} else{
		document.joinform.user_email2.value = document.joinform.user_email3.value;
		return false;
	}
}


// 3-2. modifyCustomerAction.jsp u_selectEmailChk
function u_selectEmailChk(){
	if(document.modifyform.user_email3.value == "0"){
		document.modifyform.user_email2.value = "";
		document.modifyform.user_email2.focus();
		return 1;
	} else{
		document.modifyform.user_email2.value = document.modifyform.user_email3.value;
		return false;
	}
}

// 2. join.jsp onclick
function confirmID(path){
	if(!document.joinform.user_id.value){
		alert("아이디를 입력하세요.");
		document.joinform.user_id.focus();
		return false;
	}
	
	let url = path+"/idConfirmAction.do?user_id=" + document.joinform.user_id.value;
	window.open(url, "confirm", "menubar=no, width=700, height=400, top=800, left= 200")
}
 
 // join.jsp = onsubmit - 회원기입페이지 필수 체크
 function signInChk(){
	// <!-- 2-1. 중복확인-->
 	// <input type="hidden" name="hiddenUserid" value="0">
 	// hiddenUserid : 중복확인 버튼 클릭여부 확인용(0 : 클릭안함, 1 : 클릭함)
	// 중복확인을 누르지 않았을 때
	
	
	// 2-2. 중복확인 버튼을 클릭하지 않은 경우 "중복확인 해주세요!!" 메세지를 띄운다.
	if(document.joinform.hiddenUserid.value == "0"){
		alert("중복확인 해주세요!!!!!!!")
		document.joinform.dubChk.focus();
		return false;
	}
	
}

// 3. idConfirm.jsp - submit
/*
function idConfirmFocus(){
	document.joinform.user_id.focus();
}
*/

// 4. idConfirmAction.jsp - onload => 페이지 로딩 되자마자 포커스 이동
function idConfirmChk(){
	if(!document.confirmform.user_id.value){
		alert("아이디를 입력하세요!!");
		document.confirmform.user_id.focus();
		return false;
	}
}


// 5. 자식창에서 부모창으로 user_id 전달 => 사용가능한 id를 찾은 경우
/*
	opener : window 객체의 open() 메서드로 열린 자식창(=중복확인창)에서 부모창(=회원가입창)에 접근할 때 사용
	// hiddenUserid : 중복확인 버튼 클릭여부 확인용(0 : 클릭안함, 1 : 클릭함)
	// 중복확인을 누르지 않았을 때 
	// self.close(); //자식창 닫기
*/
function setUserid(user_id){
	alert(user_id);
	opener.document.joinform.user_id.value = user_id;
	opener.document.joinform.hiddenUserid.value = "1";
	self.close();
}

function modifyCheck() {
   let inputform = document.modifyform;

   if (inputform.user_password.value != inputform.re_password.value) {
      alert("비밀번호가 (확인)과 같지 않습니다.");
      return false;
   }
}




