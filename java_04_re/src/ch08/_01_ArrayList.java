package ch08;

import java.util.ArrayList;
import java.util.Iterator;

public class _01_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(4);
		a.add(6);
		a.add(8);
		a.add(10);
		System.out.println(a);
		
		System.out.println("a의 배열 : " + a);
		System.out.println("a의 size() : " + a.size());
		
		
		System.out.println();
		System.out.println("일반 for문");
		for (int i = 0 ; i< a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println();
		System.out.println("향상된 for문");
		for (int b : a) {
			System.out.println(b);
		}
		
		System.out.println();
		System.out.println("Iterator");
		Iterator<Integer> it = a.iterator();
		
		while(it.hasNext()) {
			int aa = it.next();
			System.out.println(aa);
		}
		
		System.out.println("4의 인덱스 값은 ? " + a.indexOf(4));
		System.out.println("10의 인덱스 값은 ? " + a.indexOf(10));
		System.out.println("2의 인덱스 값은 ? " + a.indexOf(2));
		
		
		System.out.println();
		System.out.println("▽▼ remove 메서드 ▼▽");
		a.remove(2);
		
		Iterator<Integer> aaa = a.iterator();
		while(aaa.hasNext()) {
			int aaaa = aaa.next();
			System.out.println(aaaa);
		}
		
		System.out.println();
		System.out.println("▽▼ clear 메서드 ▼▽");
		a.clear();
		System.out.println(a);
	}

}
