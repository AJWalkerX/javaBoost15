package com.ajwalker.assignments.week02.weekend;

import java.util.Scanner;

//Soru 4. Kullanıcıdan bir sayı alın ve bu sayıya kadar olan çift sayıları ekrana yazdırın. (For)
public class Quest04 {
	public static void main(String[] args) {
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		input = sc.nextInt();
		for (int i = 0; i <=input; i+=2){
			System.out.println(i);
		}
	}
}