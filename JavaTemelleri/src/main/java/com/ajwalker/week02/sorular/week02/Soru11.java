package com.ajwalker.week02.sorular.week02;

import java.util.Scanner;

/*Kullanıcıdan alınan sayı kadar satır ve sütuna sahip yıldız karakteri yazdır.*/
public class Soru11 {
	public static void main(String[] args) {
		int yildiz;
		Scanner sc = new Scanner(System.in);
		System.out.print("kare boyutu giriniz: ");
		yildiz = sc.nextInt();
		
		for (int i = 0; i < yildiz; i++){
			for (int j = 0; j < yildiz; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		
		String kenar = "";
		for (int i = 0; i < yildiz; i++){
			kenar += "+ ";
		}
		for (int i = 0; i < yildiz; i++){
			System.out.println(kenar);
		}
	}
}