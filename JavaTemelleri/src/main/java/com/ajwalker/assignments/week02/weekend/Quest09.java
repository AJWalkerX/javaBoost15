package com.ajwalker.assignments.week02.weekend;
//Soru 9. Kullanıcıdan bir sayı alın ve bu sayının basamaklarını tersine çevirin. (While)

import java.util.Scanner;

public class Quest09 {
	public static void main(String[] args) {
		int userInput, digit;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		userInput = sc.nextInt();
		while (userInput > 0){
			digit = userInput % 10;
			System.out.print(digit);
			userInput = userInput /10;
		}
	}
}