package com.ajwalker.assignments.week02.day05;

import java.util.Scanner;

/*
artarak giden üçgenler(önce aşağıdakinin aynısı sonra kullanıcıdan alınan değer ile)
*
*
**
*
**
***
*
**
***
****

*/
public class Triangle03 {
	public static void main(String[] args) {
		int sizeOfLoop;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dongunun boyutunu giriniz: ");
		sizeOfLoop = sc.nextInt();
		
		for (int i = 0; i < sizeOfLoop; i++){
			for (int j = 1; j <= i; j++){
				for (int k = 0; k<j; k++){
					System.out.print("*");
				}
				System.out.println();
			}
			
			
		}
	}
}