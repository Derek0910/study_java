package ch01;

public class _07_OperatorEx {
	public static void main(String[] operation01) {
		int javaScore = 95;
		int N1 = 90;
		int N2 = 85;
		int N3 = 80;
		int japScore = N2;
		System.out.println(japScore);
		
		int totScore = javaScore + japScore;
		System.out.println(totScore);
		
		double avgScore = totScore / 2;
		System.out.println(avgScore);
		
		/*
		 * 결과값
		 * 85
		 * 180
		 * 90.0
		 */
		
		/*
		 * 1. 사칙연산자 
		 */
		
		System.out.println("=== 1. 사칙연산자 ===");
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 + num2 : " + (num1 + num2));
		System.out.println("num1 - num2 : " + (num1 - num2));
		System.out.println("num1 * num2 : " + (num1 * num2));
		System.out.println("num1 / num2 : " + (num1 / num2));
		System.out.println("num1 % num2 : " + (num1 % num2));
		
		/*
		 * 결과값
		 * === 1. 사칙연산자 ===
		 * num1 + num2 : 30
		 * num1 - num2 : -10
		 * num1 * num2 : 200
		 * num1 / num2 : 0
		 * num1 % num2 : 10
		 */
		
		/*
		 * 2. 증감연산자  
		 */
		System.out.println();
		System.out.println("=== 2. 증감연산자 ===");
		// 전위연산자
		int val = ++num1;
		System.out.println(val);
		System.out.println(num1);
			val = --num1;
		System.out.println(num1);
		System.out.println(val);
		// 후위연산자
			val = num1--;
		System.out.println(val);
		System.out.println(num1);
		
		int result = 0;
		System.out.println(num1++ + --num2 * num1-- ); // 9 + (19*10);
		System.out.println("num1 : " + num1); // 9
		System.out.println("num2 : " + num2); // 19
		
		/*
		 * 결과값
		 * === 2. 증감연산자 ===
		 * 11
		 * 11
		 * 10
		 * 10
		 * 10
		 * 9
		 * 199
		 * num1 : 9
		 * num2 : 19
		 */
		
		/*
		 * 연산
		 * 3. 관계연산자
		 */
		System.out.println();
		System.out.println("=== 3.관계연산자 ===");
		
		int r1 = 5, r2 = 8;
		System.out.println("r1 == r2 : " + (r1==r2));
		System.out.println("r1 != r2 : " + (r1!=r2));
		System.out.println("r1 > r2 : " + (r1>r2));
		System.out.println("r1 < r2 : " + (r1<r2));
		System.out.println("r1 >= r2 : " + (r1>=r2));
		System.out.println("r1 <= r2 : " + (r1<=r2));
		
		/*
		 * 결과값
		 * === 3.관계연산자 ===
		 * r1 == r2 : false
		 * r1 != r2 : true
		 * r1 > r2 : false
		 * r1 < r2 : true
		 * r1 >= r2 : false
		 * r1 <= r2 : true
		 */
		
		/*
		 * 연산
		 * 4.논리연산자
		 */
		System.out.println();
		System.out.println("=== 4.논리연산자 ===");
		int l1 = 1, l2 = 0;
		//논리곱
		System.out.println(l1==1 && l2==0); 
		System.out.println(l1==0 && l2==1);
		//논리합
		System.out.println(l1==1 || l2==1);
		System.out.println(l1==0 || l2==0);
		System.out.println(l1==0 || l2==1);
		//부정
		int l3 = 8;
		System.out.println(l3!=8);
		System.out.println(l3==8);
		
		
		/*
		 * 연산
		 * 5.복합대입연산자
		 */
		System.out.println();
		System.out.println("=== 5.복합대입연산자 ===");
		
		int num3 = 3, v1 = 2;
		System.out.println(num3 += v1); // 3 + 2 = 5;
		System.out.println(num3 -= v1); // 5 - 2 = 3;
		System.out.println(num3 *= v1); // 3 * 2 = 6;
		System.out.println(num3 /= v1); // 6 / 2 = 3;
		System.out.println(num3 %= v1); // 3 % 2 = 1;
		
		/*
		 * 결과값
		 * === 5.복합대입연산자 ===
		 * 5
		 * 3
		 * 6
		 * 3
		 * 1
		 */
		
	}
}
