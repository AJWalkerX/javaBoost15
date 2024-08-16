package com.ajwalker.week02.sorular.week02;

import java.util.Scanner;

/*Kullanıcıdan girilen girdi sonucunda * ile üçgen yaptırma*/
public class Soru12 {
	public static void main(String[] args) {
		int yildiz;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ucgen boyutu giriniz: ");
		yildiz = sc.nextInt();
		for (int i = 0; i < yildiz; i++){
			for (int j = 0; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		
		String shape = "";
		for (int i = 1; i <= yildiz; i++){
			shape += "+";
			System.out.println(shape);
		}
	}
}