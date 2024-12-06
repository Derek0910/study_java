package ch09;

import java.util.ArrayList;
import java.util.List;

public class _01_ListException3 {
	public static void main(String[] args) {
		List<String> season = new ArrayList<String>(); // 다형성 적용
		
		season.add("중견수");
		season.add("우익수");
		season.add("좌익수");
		season.add("1루");
//		season.add("3루");
//		season.add("포수");
		System.out.println(season);
		
		int i = 0;
		
		for(i = 1; i <= season.size() ; i++){
			System.out.println(i + "번 타자 : " + season.get(i));
		}

	}
}
