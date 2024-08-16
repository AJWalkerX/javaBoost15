package com.ajwalker.assignments.week02.weekend;
//Soru 8.  Bir tamsayının faktöriyelini, kullanıcı negatif bir sayı girene kadar tekrar tekrar hesaplayın. (While)

import java.util.Scanner;

public class Quest08 {
	public static void main(String[] args) {
		int userInput = 0, result = 1;
		Scanner sc = new Scanner(System.in);
		while (userInput > -1){
			System.out.print("Bir sayi giriniz: ");
			userInput = sc.nextInt();
			for (int i = 1; i <=userInput; i++){
				result *= i;
			}
			System.out.println("Girdiginiz sayinin faktoriyeli: " + result);
			result = 1;
		}
	}
}