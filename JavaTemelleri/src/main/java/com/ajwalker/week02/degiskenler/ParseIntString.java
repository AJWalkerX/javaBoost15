package com.ajwalker.week02.degiskenler;

public class ParseIntString {
	public static void main(String[] args) {
		//String >> int dönüşümü:
		String metin="150";
		Integer sayi=Integer.parseInt(metin);
		System.out.println(sayi);
		
		//int >> String dönüşümü:
		int sayi2=150;
		String metin2=String.valueOf(sayi2);
		System.out.println(metin2);
		
		double sqrt = Math.sqrt((5 * 5) - (4 * 4)); //square root> karekök 9 = 3
		System.out.println(sqrt);
		
		double random = Math.random();
		System.out.println(random);
		
		// round metodu en yakın tam sayıya yuvarlar.
		int round = Math.round(10.3f);
		System.out.println(round);
		long round1 = Math.round(10.5);
		System.out.println(round1);
	}
}