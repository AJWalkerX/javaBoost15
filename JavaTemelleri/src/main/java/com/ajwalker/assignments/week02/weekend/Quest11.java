package com.ajwalker.assignments.week02.weekend;
//Soru 11. Kullanıcıdan bir metin alın ve bu metindeki sesli harfleri sayın. (String fonksiyonları)

import java.util.Scanner;

public class Quest11 {
	public static void main(String[] args) {
		String userInput;
		int inputLength, vowelCounter = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir metin giriniz: ");
		userInput = sc.nextLine();
		userInput = userInput.toLowerCase();
		
		inputLength = userInput.length();
		for (int i = 0; i < inputLength; i++){
			switch (userInput.charAt(i)){
				case 'a', 'e', 'ı', 'ü', 'i', 'ö', 'u', 'o':
					vowelCounter++;
			}
		}
		System.out.println("Toplam sesli harf: "+ vowelCounter);
	}
}