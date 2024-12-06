package ch04;

public class _03_Me {
	private String name;
	private int age;
	private String gender;
	private String hobby;
	private String doWell;
	
	// getter setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getHobby() {
		return hobby;
		
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public String getDoWell() {
		return doWell;
		
	}
	
	public void setDoWell(String doWell) {
		this.doWell = doWell;
	}
	
	// getterInfo
	public void getterInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("취미 : " + hobby);
		System.out.println("잘하는 것 : " + doWell);
	}
}
