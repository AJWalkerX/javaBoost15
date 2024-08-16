package com.ajwalker.week02.sorular.week02;

public class Soru07 {
	public static void main(String[] args) {
		/*
		 * Bir öğrencinin notunu aldığmızda,
		 * notu 50'den büyük veya eşitse "Geçer",
		 * küçükse "Kaldı" yazdırcaz*/
		int grade = 40;
		String result = (grade <=50) ? "Kaldi" : "Gecti";
		System.out.println(result);
		
		/*
		* Bir sayinin tek mi çift mi olduğunu ternary ile belirleyen program
		* */
		int num = 4;
		result = (num%2 == 0)? "Cift": "Tek";
		System.out.println(result);
	}
}