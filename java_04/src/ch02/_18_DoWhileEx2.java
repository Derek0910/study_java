package ch02;

import java.util.Scanner;

public class _18_DoWhileEx2 {
	public static void main(String[] args) {
		// 클래스명 변수 = new 클래스명();
		Scanner scan = new Scanner(System.in);
		int month;

		do {
			System.out.print("월을 입력하세요 : ");
			month = scan.nextInt();
			if(month<0 || month>12) {
				System.out.println("잘못된 월입니다.");
				System.out.println("============");
				continue;
			}else {
				System.out.println("입력월은 " + month + "입니다.");
				break;
			}
		
		} while (month<0||month>12);
	}		
}

