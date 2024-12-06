package ch01;

public class Aja2 {

	public static void main(String[] school_information) {
		System.out.println("※※※ 서강대학교 ※※※");
		int established = 1948;
		System.out.println("설립 연도 : " + established + "년");
		
		String founder = "게페르트 신부";
		System.out.println("설립자 : " + founder);
		
		String motto = "Obey to the truth(진리에 순종하라)";
		System.out.println("교훈 : " + motto);
		
		String ideology = "학문을 탐구하고 진리를 추구하면서 정의를 실천하고 인간의 존엄성과 생명의 가치를 존중하는, 사랑과 믿음을 갖춘 전인교육을 지향한다.";
		System.out.println("이념 : " + ideology);
		
		char smallbus = '7';
		System.out.println("학교까지 오는 마을버스 : " + smallbus);
		
		smallbus = '9';       

		System.out.println("-----------------------");
		System.out.println("설립 연도 : " + established + "년" + "\t설립자 : " + founder + "\t교훈 : " + motto+ "\t이념 : " + ideology + "\t학교까지 오는 마을버스 : " + smallbus);
		
		System.out.println("\n-----------------------");
		System.out.println("설립 연도 : " + established + "년" + "\n설립자 : " + founder + "\n교훈 : " + motto+ "\n이념 : " + ideology + "\n학교까지 오는 마을버스 : " + smallbus);
	}

}