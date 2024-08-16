package com.ajwalker.assignments.week02.weekend;
//Soru 10.  Kullanıcıdan bir cümle alın ve bu cümledeki kelimeleri tek tek ekrana yazdırın. (String fonksiyonları)

import java.util.Scanner;

public class Quest10 {
	public static void main(String[] args) {
		String userSentence;
		int startIndex = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir cümle giriniz: ");
		userSentence = sc.nextLine();
		userSentence.trim();
		int sentenceLength = userSentence.length();
		for (int i = 0; i < sentenceLength; i++){
		 if (userSentence.charAt(i) == ' '){
			 System.out.println(userSentence.substring(startIndex, i));
			 startIndex = i+1;
		 }
		}
		System.out.println(userSentence.substring(startIndex));
	}
}