package ch08;

import java.util.Hashtable;
import java.util.Scanner;

public class _03_Login {
	public static void main(String[] args) {
		Hashtable<String, String> hstable = new Hashtable<String, String>();
		
		hstable.put("park", "part1234");  
		hstable.put("kim", "kim1234");  
		hstable.put("lee", "lee1234");  
		hstable.put("son", "son1234");
		
		System.out.println(hstable);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요. : ");
		String inputID = scan.next();
		int k = 0;
		if(inputID.equals("Q") || inputID.equals("q")) {
			System.out.println("프로그램을 종료합니다.");
		}else {
			while(true) {
				while(hstable.containsKey(inputID)){
					if(k<5){
						System.out.println("비밀번호를 입력해주세요.");
						String inputPW = scan.next();
						boolean pwcheck = inputPW.equals(hstable.get(inputID));
						if(pwcheck) {
							System.out.println("로그인에 성공하셨습니다.");
							scan.close();
							return;
						} else{
							k=k+1;
							System.out.println(k);
							continue;
						}
	
					} else {
						System.out.println("입력횟수를 초과하였습니다.");
						k=0;
						break;
					}
				
				}
				System.out.print("아이디를 다시 입력해주세요. : ");
				inputID = scan.next();
			}
		}

	}
}
