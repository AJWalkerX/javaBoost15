package com.ajwalker.week02.sorular.week02;

import java.util.Scanner;

/*Kullanıcıdan girilen girdi sonucunda * ile ters üçgen yaptırma*/
public class Soru13 {
	public static void main(String[] args) {
		int yildizMiktar;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ucgen boyutu giriniz: ");
		yildizMiktar = sc.nextInt();
		// i = 3,2,1,0
		// j = 0,1,2
		
		String yildiz = "";
		for (int i = yildizMiktar; i > 0; i--){
			for (int j = 0; j<i; j++){
				System.out.print(" ");
			}
			yildiz += "*";
			System.out.println(yildiz);
		}
		
	}
}