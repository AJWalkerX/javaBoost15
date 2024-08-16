package com.ajwalker.week02.sorular.week02;

import java.util.Scanner;

/*Kulacıdan alınan boyut kadar * ile ile üçgen yapımı
  *
 **
***
Şekilinde olsun

* */
public class Soru14 {
	public static void main(String[] args) {
		int boyut;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ucgen boyutu giriniz: ");
		boyut = sc.nextInt();
		
		String yildiz = "";
		for (int i = 0; i < boyut; i++){
			for (int j = boyut-1; j > i; j--){
				System.out.print(" ");
			}
			yildiz += "*";
			System.out.println(yildiz);
		}
	}
}