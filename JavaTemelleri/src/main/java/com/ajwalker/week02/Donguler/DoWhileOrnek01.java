package com.ajwalker.week02.Donguler;

import java.util.Scanner;

/*
	While'dan farkı: koşul sağlanmasa bile en az bir kere çalışır.
	
	do {
		yapılacak_işlemler;
	}while(koşul);
*/// 0 girilene kadar toplama işlemi yapan program.
public class DoWhileOrnek01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, sum = 0;
		
		do{
			System.out.print("Bir sayi giriniz: ");
			num = sc.nextInt();
			sum += num;
		}while (num != 0);
		System.out.println(sum);
		
		num = 5;
		while (num < 5){
			System.out.println(num); // bu çıktı YAZMAZ!
		}
		do {
			System.out.println(num); // Bu çıktı bir kere gelecek!
		}while (num < 5);
	
	}
}