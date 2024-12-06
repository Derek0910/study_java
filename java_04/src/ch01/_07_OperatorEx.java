package ch01;

public class _07_OperatorEx {
	public static void main(String[] operation) {
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 2.0;
		System.out.println(avgScore);
		
		// 다항연산자
		int a = 5;
		int b = 3;
		int result = (a>b)?1:0;
		System.out.println(result);
			result = (a<b)?1:0;
		System.out.println(result);
		
		/*
		 * 연산
		 * 1. 사칙연산자 
		 */
		System.out.println();
		System.out.println("==== 1. 사칙연산자 ====");
		// p74
		
		/*
		 * 연산
		 * 2. 증감연산자 => 매우 중요 ★5
		 */
		
		System.out.println("==== 2. 증감연산자 ====");
		// 전위연산자
		System.out.println("*** 전위연산자 ***");		
		int num = 5;
		int val = ++num;
			System.out.println(num); //6
			System.out.println(val); //6
			
		// 후위연산자
		System.out.println();
		System.out.println("*** 후위연산자-1 ***");		
			num = 5;
			val = num++;
			System.out.println("val : " + val); // 5
			System.out.println("num : " + num); // 6
			System.out.println();
		System.out.println("*** 후위연산자-2 ***");	
			val = num++;
			System.out.println("val : " + val); // 6
			System.out.println("num : " + num); // 7
		
		
			System.out.println();
			System.out.println("------------");
			int e = 2, f = 3, result1 = 0;
			System.out.println(e++ + --f * e--); 
			// (E=2++=> E'=3) + (--F => --3 = 2)*(E'--=>3-- = 2 )
			// (2 + 2 * 3) = 8 
			// 값이 먼저 정해진 후에 연산이 이루어 진다!!!!!!!!!!!!!!!
			System.out.println("e : " + e); // 2
			System.out.println("f : " + f); // 2
			
			System.out.println();
			System.out.println("----- result 실행 -----");
			result1 = ++e + --f * e--;
			System.out.println("result : " + result1); // 3 + 1 * 3 = 6 
			System.out.println("e : " + e); // 2
			System.out.println("f : " + f); // 1
			double z = ((double) f/ (double) e);
			System.out.println(z);
			
			/*
			 * 연산
			 * 3. 관계연산자 => 매우 중요
			 * >,<,>=,<=,==,!=
			 * 결과값은 boolean 타입 : true, false
			 */
			System.out.println("=== 3.관계연산자 ===");
			
			int c1 = 10;
			int c2 = 20;
			System.out.println("c1 == c2 : " + (c1==c2)); //false
			System.out.println("c1 != c2 : " + (c1!=c2)); //true
			System.out.println("c1 > c2 : " + (c1>c2));   //false
			System.out.println("c1 < c2 : " + (c1<c2));   //true
			System.out.println("c1 >= c2 : " + (c1>=c2)); //false
			System.out.println("c1 <= c2 : " + (c1<=c2)); //true
			
			/*
			 * 연산
			 * 4.논리연산자 => 매우 중요
			 * 1 => true | 0 => false
			 * &&(논리곱)
			 * ||(논리합)
			 */
			
			System.out.println("=== 4.논리연산자 ===");
			int z1= 4, y1 = 5;
			System.out.println(z1==4 && y1==5);  // T && T = 1 * 1 = 1 => true
			System.out.println(z1==4 && y1==10); // T && F = 1 * 0 = 0 => false
			System.out.println(z1==4 || y1==7);  // T || F = 1 + 0 = 1 => true
			System.out.println(z1==7 || y1==5);  // F || T = 0 + 1 = 1 => true
			System.out.println(z1==7 || y1==7);  // F || F = 0 + 0 = 0 => false
			
			/*
			 * 연산
			 * 5.복합대입연산자 => 매우 중요
			 */
			
			System.out.println();
			System.out.println("=== 5.복합대입연산자 ===");
			
			int i1 = 5;
			
				i1 += 10; // => i1 = i1 + 10; 
			System.out.println("i1 : " + i1 ); // i1 : 15
			
				i1 -= 10; // => i1 = i1 - 10; 
			System.out.println("i1 : " + i1 ); // i1 : 5
			
				i1 *= 10; // => i1 = i1 * 10; 
			System.out.println("i1 : " + i1 ); // i1 : 50
			
				i1 /= 10; // => i1 = i1 / 10; 
			System.out.println("i1 : " + i1 ); // i1 : 5
			
				i1 %= 10; // => i1 = i1 % 10; 
			System.out.println("i1 : " + i1 ); // i1 : 5
			
			System.out.println();
			System.out.println("=== 5-3.비트연산자 ===");
			
			int num4 = 102, v2 = 153, v3 = 255;
			System.out.println(num4 &= v2);
			System.out.println(num4 |= v2);
			System.out.println(num4 ^= v2);
			System.out.println(num4 ^= v3);

	}
}