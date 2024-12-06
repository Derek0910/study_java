package ch10;

public class _03_StringEx {
	public static void main(String[] args) {
		String str = "Come back home";
		String s1, s2, s3;
		
		s1 = str.concat(" after review!!" );
		System.out.println(s1);
		
		s2 = s1.replace("C", "c");
		System.out.println(s2);
		
		s3 = s2.substring(5, 14);
		System.out.println(s3.toString());
		
		String information = "이름 : 문희재 : 직업 : 취준생";
		String[] info = information.split(" : ");
		
		for (int i = 0 ; i < info.length ; i++) {
			if(i%2==0) {
				System.out.println("대분류 : " + info[i]);
			}else {
				System.out.println("소분류 : " + info[i]);
			}
		}
	}
}
