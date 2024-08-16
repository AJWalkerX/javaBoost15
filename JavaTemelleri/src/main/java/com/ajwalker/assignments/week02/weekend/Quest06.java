package com.ajwalker.assignments.week02.weekend;
//Soru 6. Kullanıcıdan negatif bir sayı girene kadar sayı girmesini isteyin ve girilen pozitif sayıları toplayın. (Do-While)

import java.util.Scanner;

public class Quest06 {
	public static void main(String[] args) {
		int userInput, result = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Sayi giriniz: ");
			userInput = sc.nextInt();
			if (userInput > 0){
				result += userInput;
			}
		}while (userInput >= 0);
		System.out.println("Girilen sayilarin toplami: "+ result);
	}
}