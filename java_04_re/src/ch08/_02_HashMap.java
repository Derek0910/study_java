package ch08;

import java.util.HashMap;

public class _02_HashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hsmap = new HashMap<Integer, String>();
		
		hsmap.put(2, "복습");
		hsmap.put(4, "할거야?");
		
		System.out.println(hsmap);
		int i = 1;
		int a = i;
		System.out.println();
		for (i = 1 ; i<=hsmap.size(); i++) {
			a=i * 2;
			System.out.println(hsmap.get(a));
			System.out.println("a = " + a);
		}
		
		System.out.println();
		System.out.println("hsmap.containsKey(1) " + hsmap.containsKey(1));
		System.out.println();
		System.out.println("hsmap.containsKey(2) " + hsmap.containsKey(2));
		System.out.println();
		System.out.println("hsmap.containsValue(\"복스\") is " + hsmap.containsValue("복스"));
		System.out.println();
		System.out.println("hsmap.containsValue(\"복습\") is " + hsmap.containsValue("복습"));
		
		System.out.println();
		hsmap.remove(2);
		System.out.println("hsmap.isEmpty() is " + hsmap.isEmpty());
		hsmap.remove(4);
		System.out.println("hsmap.isEmpty() is " + hsmap.isEmpty());
		
	}
} 
