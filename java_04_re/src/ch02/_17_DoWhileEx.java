package ch02;

import java.util.Scanner;

public class _17_DoWhileEx {
	public static void main(String[] ForEx07){
		int diceans = 5;
		int dice ;
		
		System.out.println("주사위 게임을 시작합니다.");
		Scanner dicein = new Scanner(System.in);
		System.out.print("굴려서 나올 숫자를 입력하세요. : ");
		dice = dicein.nextInt();
		do {
			if (dice<0 || dice>6) {
				System.out.println("1~6 사이의 숫자를 입력해주세요. : ");
			}else {
				System.out.print("틀렸습니다. 다시 한번 입력해 주세요. : ");
			}
			dice = dicein.nextInt();
		} while(dice != diceans);
			System.out.println("맞았습니다. 탈출에 성공하셨습니다.");
			dicein.close();
				
	}
}
