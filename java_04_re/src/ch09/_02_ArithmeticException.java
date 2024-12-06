package ch09;

import java.util.Scanner;

public class _02_ArithmeticException {
	public static void main(String[] args) {
		Scanner n1sc = new Scanner(System.in);
		Scanner n2sc = new Scanner(System.in);
		System.out.println("두 개의 숫자를 입력해 주세요.");
		
		try {

			System.out.print("첫번째 숫자 : ");
			int n1 = n1sc.nextInt();
			
			System.out.print("두번째 숫자 : ");
			int n2 = n2sc.nextInt();
			
			System.out.println("두 수를 나눈 몫은 : " + (n1 / n2));
			System.out.println("두 수를 나눈 나머지는 : " + (n1 % n2));
			
		}catch(ArithmeticException em) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println("에러 메세지 : " + em.getMessage());
			
		}finally {
			n1sc.close();
			n2sc.close();
		}
		
		System.out.println("<** 나눗셈 종료 **>");
	}
}
