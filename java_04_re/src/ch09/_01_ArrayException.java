package ch09;

public class _01_ArrayException {
	public static void main(String[] args) {
		
		int[] arr = new int[8];  
				
		try {
			for(int i = 1; i <= arr.length ; i++){
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println("에러가 발생했습니다.");
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("해당 문을 종료합니다.");
		}
		System.out.println("시스템 종료");
	}
}
