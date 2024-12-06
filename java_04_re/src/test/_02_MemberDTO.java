package test;

public class _02_MemberDTO {
	private String id;
	private String password;
	private String gender;
	private String email;
	private String address;

	public _02_MemberDTO getInfo(String id, String password, String gender, String email, String address) {
		_02_MemberDTO mdto = new _02_MemberDTO();
		this.id = id;
		this.password = password;
		this.gender = gender;
		this.email = email;
		this.address = address;
		System.out.println("회원정보 출력~");
		System.out.println(id);
		System.out.println(password);
		System.out.println(gender);
		System.out.println(email);
		System.out.println(address);
		
		return mdto ;
	}
	
	//getter
	public String getId() {
		System.out.println(id + "님 안녕하세요.");
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPassword() {
		System.out.println("입력하신 비밀번호는 " + password + "입니다.");
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	//setter
	
	//method

}
