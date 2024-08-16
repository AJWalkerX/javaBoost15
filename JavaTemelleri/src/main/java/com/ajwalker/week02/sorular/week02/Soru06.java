package com.ajwalker.week02.sorular.week02;

import java.util.Scanner;
/*
* Kullanıcının girdiği sayının
pozitif,
negatif veya
sıfır olduğunu belirleyen bir program yazmanız gerekiyor.
 Bu durumda if-else-if-else yapısı kullanarak bir program yazabilirsiniz.
 * */
public class Soru06 {
	public static void main(String[] args) {
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		input = sc.nextInt();
		
		if (input == 0){
			System.out.println("Girdiginiz sayi 0 degerine esittir!");
		}
		else if (input < 0) {
			System.out.println("Girdiginiz sayi -(Neg) bir sayidir!");
		}
		else {
			System.out.println("Girdiginiz sayi +(Poz) bir sayidir!");
		}
	}
}