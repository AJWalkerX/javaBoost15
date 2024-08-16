package com.ajwalker.week02.degiskenler;

public class Tipler {
	int sayi = 10;
	//var sayi2; // HATA!!! Var ile Nesne veya Sınıf değişken oluşturulamaz.
	
	public static void main(String[] args) {
		boolean acikMi = true;
		acikMi = false;
		/*Boolean aşağıdaki gibi değerleri taşıyamaz.
		acikMi=5;
		acikMi='a';
		acikMi="deneme";
		acikMi=5.0;
		acikMi=10.25f;*/
		
		char karakter = 'a';
		System.out.println(karakter);
		
		karakter = 65;
		System.out.println(karakter);
		karakter = 66;
		System.out.println(karakter);
		karakter = 67;
		System.out.println(karakter);
		karakter = 146;
		System.out.println(karakter);
		
		/*for (int i = 0; i < 255; i++) {
			char ch=(char)i;
			System.out.println(ch);
		}*/
		
		
		karakter = 65535; // char 16 bit olduğu için alabileceği max değer.
		System.out.println(karakter);
		
		/** byte
		 * 8 bit işaretli sayı tutar
		 */
		
		byte byteDegisken = 127;
		byteDegisken = -128;
		System.out.println(byteDegisken);
		
		/**
		 * short
		 * 16 bit işaretli sayı tutar.
		 */
		
		short shortDegisken = 32767;
		shortDegisken = -32768;
		System.out.println(shortDegisken);
		
		/**
		 * int
		 * 32 bit işaretli sayı tutar.
		 */
		
		int intDegisken = 2147483647;
		intDegisken = -2147483648;
		System.out.println(intDegisken);
		
		/**
		 * long
		 * 64 bit işaretli sayı tutar.
		 */
		
		long longDegisken = 9223372036854775807L;
		longDegisken = -9223372036854775808L;
		longDegisken = 2147483648L;
		
		shortDegisken = 'a';
		System.out.println(shortDegisken);
		
		char charDegisken = 'a';
		System.out.println(charDegisken);
		
		byte byteSayi = 50;
		short shortSayi = 150;
		short toplam = (short) (byteSayi + byteSayi);
		System.out.println(toplam);
		
		int sayi1 = Integer.MAX_VALUE;
		int sayi2 = Integer.MAX_VALUE;
		System.out.println(sayi1);
		long toplamLong = (long) sayi1 + (long) sayi2;
		long toplamLong2 = (long) (sayi1 + sayi2);
		System.out.println(toplamLong);
		
		byte byteSayi2 = 29;
		byte byteSayi3 = 100;
		byte toplamByte = (byte) (byteSayi2 + byteSayi3);
		System.out.println(toplamByte);
		
		/**
		 *  0 - 1 arasında kaç sayı vardır? Sonsuz.
		 *  0.854824656879848798789798798798798798797987
		 */
		
		/**
		 * float
		 * 32 bit ondalıklı sayı gösterebilir.
		 */
		
		float floatSayi = Float.MAX_VALUE;
		System.out.println(floatSayi);
		/**
		 * double
		 * 64 bit ondalıklı sayı tutabilir.
		 */
		double doubleSayi = Double.MAX_VALUE;
		System.out.println(doubleSayi);
		
		float floatSayi2 = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
		System.out.println(floatSayi2); //0.70000005 Yanlış sonuç gelebiliyor.
		
		float floatSayi3 = 0.1f * 0.1f;
		System.out.println(floatSayi3); // 0.010000001 Yanlış sonuç gelebiliyor.
		
		double doubleSayi2 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
		System.out.println(doubleSayi2);
		
		double doubleSayi3 = 0.1 * 0.1;
		System.out.println(doubleSayi3); //0.010000000000000002 Burada da hata var.
		
		/**
		 * Big Decimal - Hatasız ondalıklı sayılarla çalışmanızı sağlar.
		 */
		/**
		 * declaration
		 */
		int sayac;
		
		/**
		 * initilization
		 */
		sayac = 10;
		
		/**
		 * defination
		 */
		
		int sayac2 = 10;
		/**
		 * type inference-var ile java literalden tip çıkarım özelliği kazanmıştır.
		 * Ancak sadece Local Değişken oluşturmada kullanılabilir.
		 */
		var kilo = 7.67;
		//kilo="asda"; tip çıkarımı sayesinde kilo değişkeni double olarak ayarlanmıştır. Sonradan string değer
		// taşıyamaz.
		var yas = 17;
		var uyruk = "TC";
		var evliMi = true;
	}
}