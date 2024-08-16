package com.ajwalker.week03.diziler;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int sayilar [] = {5,6,7};
		int[][] koordinatlar= {
				{1,2},
				{3,4},
				{8,7}
		};
		
		int koordinatlar2[][] = new int[3][2]; //3 satır 2 sütun
		
		koordinatlar2[0][0]=1;
		koordinatlar2[0][1]=2;
		koordinatlar2[1][0]=3;
		koordinatlar2[1][1]=4;
		koordinatlar2[2][0]=8;
		koordinatlar2[2][1]=7;
		
		System.out.println(koordinatlar2.length); // satır sayısını getirir. //Kısaca satır
		System.out.println(koordinatlar2[0].length); // 0.satırın sütun sayısını getirir. // Kısaca sütun
		
		System.out.println();
		for (int i = 0; i<koordinatlar2.length; i++){
			for (int j = 0; j<koordinatlar2[0].length; j++){
				System.out.print(koordinatlar2[i][j]+ " ");
			}
			System.out.println();
		}
	}
}