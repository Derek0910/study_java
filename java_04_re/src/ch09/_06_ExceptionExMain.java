package ch09;

import java.util.Scanner;

public class _06_ExceptionExMain {
	public static void main(String[] args) {
		_06_ExceptionExGetSet num = new _06_ExceptionExGetSet();
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요. (입력범위는 0~100 사이 입니다) : ");
		int numinput = sc.nextInt();
				
		try {
			num.setNum(numinput);
			num.getNum();
		}
		catch(_06_ExceptionExClass e) {
			System.out.println("입력범위를 벗어났습니다!!!");
			System.out.println(e.getMessage());
			
		}
		finally {
			sc.close();
		}
		System.out.println("수식입력 끝~!!");
		
	}
}
