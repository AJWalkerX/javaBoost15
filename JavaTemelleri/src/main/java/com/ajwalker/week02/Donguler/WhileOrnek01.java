package com.ajwalker.week02.Donguler;

import java.util.Scanner;

public class WhileOrnek01 {
	public static void main(String[] args) {
		/* Birinni örnek:
		int i = 1;
		while (i < 10) {
			System.out.println(i + " 10'dan kucuktur.");
			i++;
		}*/
		
		/*Kullanıcıdan sıfır girilene kadar girilen sayilari toplayan döngü*/
		
		Scanner sc = new Scanner(System.in);
		int num, sum = 0;
		System.out.println("Bir sayi giriniz (0'a basarak sonlandırabilirsiniz)");
		while ((num = sc.nextInt()) != 0) {
			sum += num;
		}
		System.out.println(sum);
	}
	
}