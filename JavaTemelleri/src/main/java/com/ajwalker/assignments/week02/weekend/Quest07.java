package com.ajwalker.assignments.week02.weekend;
//Soru 7. Kullanıcıdan bir sayı alın ve bu sayının basamakları toplamını hesaplayın. (While)

import java.util.Scanner;

public class Quest07 {
	public static void main(String[] args) {
		int userInput, digit, result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		userInput = sc.nextInt();
		while (userInput > 0){
			digit = userInput % 10;
			result += digit;
			userInput = userInput /10;
		}
		System.out.println("Basamaklar toplami: "+ result);
	}
}