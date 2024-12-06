package ch05;

public class _01_ArrayEx {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},
					{4,5,6},	
					{7,8,9}};  
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----");
		
		String[][] hangeul = {{"가","나","다"},
							{"라","마","바"},
							{"사","아","자"},
							{"차","카","타"}};
		
		for(int k=0; k <hangeul.length; k++) {
			for(int l=0; l<hangeul[k].length; l++) {
				System.out.print(hangeul[k][l]+" ");
			}
			System.out.println();
		}
		
		
	}
}

/* 결과값
1 2 3 
4 5 6 
7 8 9 
-----
가 나 다 
라 마 바 
사 아 자 
차 카 타 
*/