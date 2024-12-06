package ch04;

public class _03_MeMain {
	public static void main(String[] me01) {
		_03_Me me = new _03_Me();
		
		me.setName("문희재");
		me.setAge(41);
		me.setGender("남");
		me.setHobby("걷기");
		me.setDoWell("꾸준히 하기");
		
		
		System.out.println("=== getter 값 출력 ===");
		System.out.println(me.getName());
		System.out.println(me.getAge());
		System.out.println(me.getGender());
		System.out.println(me.getHobby());
		System.out.println(me.getDoWell());
		
		System.out.println();
		System.out.println("=== getter 메서드 출력 ===");
		me.getterInfo();
	}
}

/*
 * === getter 값 출력 ===
 * 문희재
 * 41
 * 남
 * 걷기
 * 꾸준히 하기 
 */
