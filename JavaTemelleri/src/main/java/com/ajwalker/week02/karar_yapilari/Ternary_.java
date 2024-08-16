package com.ajwalker.week02.karar_yapilari;

public class Ternary_ {
	public static void main(String[] args) {
		/*
Bir öğrencinin notunu aldığımızda,
notu 50'den büyük veya eşitse "Geçer",
küçükse "Kaldı" şeklinde bir durum göstermek için ternary operatörü kullanılarak programı yazınız.

 */
		int not = 20;
		String sonuc = (not <= 50 && not > 0) ? (not > 30) ? "DD" : "Kaldı" : "Geçti";
		System.out.println(sonuc);
		
		/*
	Bir sayının tek / çift olduğunu ternary operatörü ile belirleyen programı yazınız.
 */
		int sayi=10;
		sonuc=(sayi%2==0)?"Çift":"Tek";
		
		System.out.println(sonuc);
	}
	
}