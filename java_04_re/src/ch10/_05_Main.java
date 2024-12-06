package ch10;

import java.util.ArrayList;
import java.util.List;

public class _05_Main {
	public static void main(String[] args) {
		_05_EnumEx mush = new _05_EnumEx(Vege.Mush, "버섯");
		_05_EnumEx lett = new _05_EnumEx(Vege.Lettuce, "상추");
		_05_EnumEx chic = new _05_EnumEx(Vege.Chicory, "치커리");
		
		List<_05_EnumEx> list = new ArrayList<_05_EnumEx>();
		
		list.add(mush);
		list.add(lett);
		list.add(chic);
		
		for (_05_EnumEx i : list) {
			System.out.println(i.getVege());
		}
	}
}
