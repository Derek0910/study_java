package ch01;

public class _04_VariableEx {
	public static void main(String[] conversion) {
		byte bNum = 127;
		int iNum = bNum;
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 32767;
		float fNum = iNum2;
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
	}
}

/*
 * 결과값
 * 127
 * 127
 * 127
 * 32767.0
 * 32894.0
*/