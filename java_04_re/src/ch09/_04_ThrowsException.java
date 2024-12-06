package ch09;

import java.util.Scanner;

public class _04_ThrowsException {
	
	static Scanner sc = new Scanner(System.in);
	static int age;
	
	public static void main(String[] args) {
		try {
			age = readAge();
			if(age <= 10)
			System.out.println("나이 : " + age + "살");
			else
			System.out.println("나이 : " + age + "세");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("메세지 : " + e.getMessage());
		} finally {
			try {
				sc.close();
			}
			catch(Exception e) {
				System.out.println("0 이상의 숫자를 입력해주세요.");
				e.printStackTrace();
			}
			System.out.println("=== 정상종료 ===");
		}
	}
	
	public static int readAge() throws Exception{
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		if(age<0) {
			throw new Exception("나이는 0보다 작을 수 없습니다.");
		}
		return age;
	}
}
