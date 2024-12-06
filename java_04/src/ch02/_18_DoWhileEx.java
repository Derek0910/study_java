package ch02;

import java.util.Scanner;

public class _18_DoWhileEx {
	public static void main(String[] args) {
		// 클래스명 변수 = new 클래스명();
		Scanner scan = new Scanner(System.in);
		int month;

		do {
			System.out.print("월을 입력하세요. : ");
			month = scan.nextInt();
			if(month<0 || month>12)
			System.out.print("잘못된 월입니다.(1~12월 입력) 월을 다시 입력해주세요. :");
			System.out.println("============");
		
		} while (month<0||month>12);
			if(month>0&&month<=12) ;
			System.out.println("입력월은 " + month + "입니다.");
			scan.close();
	}		
}

