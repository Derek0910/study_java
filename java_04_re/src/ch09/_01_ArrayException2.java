package ch09;

import java.util.HashMap;

public class _01_ArrayException2 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "중견수");
		map.put(2, "우익수");
		map.put(3, "좌익수");
		map.put(4, "1루");
//		map.put(5, "3루");
//		map.put(6, "포수");
		
		int i = 1;
		
		for(i = 1; i <= map.size() ; i++){
			System.out.println(i + "번 타자 : " + map.get(i));
		}

	}
}
