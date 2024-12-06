package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_IOException {
	public static void main(String[] args) throws IOException  {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("files.hwp");
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
		} finally {
			
			if(fis!=null) {
				fis.close();
				System.out.println("finally 출력");
			}
			System.out.println("fis 값이 null 입니다."); // Cannot invoke "java.io.FileInputStream.close()" because "fis" is null
		}
		
		System.out.println("해당 문을 종료합니다.");
	}

}
