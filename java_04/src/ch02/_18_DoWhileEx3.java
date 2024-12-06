package ch02;

import java.util.Scanner;

public class _18_DoWhileEx3 {
	public static void main(String[] args) {
		// 클래스명 변수 = new 클래스명();
		Scanner scan = new Scanner(System.in);
		int month;
		System.out.print("월을 입력하세요. : ");
		do {
			month = scan.nextInt();
			if(month>0&&month<=12) {
				break;
			}
			System.out.print("잘못된 월입니다.(1~12월 입력) 월을 다시 입력해주세요. :");
		
		} while (month<0||month>12);
//			if(month>0&&month<=12) ;
			System.out.println("입력월은 " + month + "입니다.");
			scan.close();
	}		
}

