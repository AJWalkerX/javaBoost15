package com.ajwalker.assignments.week02.weekend;
//Soru 13. Kullanıcıdan bir sayı alın ve bu sayının en yakın tam sayıya yuvarlanmış halini bulun. (Math fonksiyonları)

import java.util.Scanner;

public class Quest13 {
	public static void main(String[] args) {
		double decimalInput;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ondalikli bir sayi giriniz: ");
		decimalInput = sc.nextDouble();
		System.out.println("Yuvarlama islemi sonucu:" + Math.round(decimalInput));
	}
}