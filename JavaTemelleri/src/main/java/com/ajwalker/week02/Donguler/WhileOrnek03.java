package com.ajwalker.week02.Donguler;

import java.util.Scanner;

/*Kullanıcıdan alınan kelimenin Polindrom olup olmadığını bulan kod*/
public class WhileOrnek03 {
	public static void main(String[] args) {
		String input = "", reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir kelime giriniz: ");
		input = sc.nextLine();
		int inputLength = input.length();
		
		while (inputLength > 0) {
			inputLength--;
			reverse += input.charAt(inputLength);
		}
		if (input.equalsIgnoreCase(reverse)) {
			System.out.println("Bu kelime Polindrom'dur. " + reverse);
		}
		else {
			System.out.println("Bu kelime Polindrom degildir. " + reverse);
		}
	}
}