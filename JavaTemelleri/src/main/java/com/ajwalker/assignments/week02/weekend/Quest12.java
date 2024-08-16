package com.ajwalker.assignments.week02.weekend;
//Soru 12. Kullanıcıdan bir taban ve üs değeri alın ve üssü hesaplayın. (Math fonksiyonları)

import java.util.Scanner;

public class Quest12 {
	public static void main(String[] args) {
		int base, exponent;
		Scanner sc = new Scanner(System.in);
		System.out.print("Taban degerini giriniz: ");
		base = sc.nextInt();
		System.out.print("Us degerini giriniz: ");
		exponent = sc.nextInt();
		System.out.println(base +" sayisinin " + exponent+". ussu: "+ (int)Math.pow(base,exponent));
	}
}