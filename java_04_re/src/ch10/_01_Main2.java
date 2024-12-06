package ch10;

import java.util.ArrayList;
import java.util.List;

public class _01_Main2 {
	public static void main(String[] args) {
		_01_Class choi = _01_Class.getInstance();
		choi.setStudent("최민식");
		
		choi.gotoSchool("최민식");
		System.out.println(choi.getStudent());
		_01_Class park = _01_Class.getInstance();
		park.setStudent("박정민");
		
		System.out.println();
		park.gotoSchool("박정민");
		
		System.out.println();
//		System.out.println(park.gotoSchool("박정민"));
		List<_01_Class> list = new ArrayList<_01_Class>();
		
//		list.arr("park");		list.arr("choi");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(park.getStudent());
		
//		for(String aa : list) {
//			System.out.println(aa);
//		}


		
//		_01_Class.
//		System.out.println(list.size());
//		System.out.println("list 0 : " + list.get(0));
//		System.out.println(list.get(1));
		
//		for(_01_Class e : list) { //for문을 통한 전체출력
//			System.out.println(e.toString());
//		} // 같은 메모리에 위치해서 뒤에 입력된 값이 덮는다?
		
	}
}
