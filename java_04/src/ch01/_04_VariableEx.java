package ch01;

public class _04_VariableEx {
	public static void main(String[] Conversion) {
		System.out.println("=== 문시적 형변환(p65) ===");
		byte bNum = 10;
		int iNum = bNum;
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum65;
		dNum65 = fNum + iNum;
		System.out.println(dNum65);
		
		System.out.println(); //빈 줄 생성
		System.out.println("=== 명시적 형변환(p68) ===");
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
//		int addNums = dNum1 + fNum2;
		double addNums = dNum1 + fNum2;
		
		System.out.println(dNum1);
		System.out.println(fNum2);
		System.out.println("addNums : " + addNums);
		
		byte bNum2 = (byte)dNum1; 
		int iNum3 = (int)fNum2;
		
		int addNums2 = bNum2 + iNum3;
		
		System.out.println(bNum2);
		System.out.println(iNum3);
		System.out.println(addNums2);
		
		double dNum2 = 1.2;
		float fNum3 = 0.9F;
		
		int iNum4 = (int)dNum2 + (int)fNum3;
		int iNum5 = (int)(dNum2 + fNum3);
		System.out.println(iNum4);
		System.out.println(iNum5);
		
		int iNum3f = (int)dNum2;
		int iNum4f = (int)fNum3;
		System.out.println(iNum3f);
		System.out.println(iNum4f);
		
		System.out.println("=== 문자형 형변환 ===");
		
	}
}
