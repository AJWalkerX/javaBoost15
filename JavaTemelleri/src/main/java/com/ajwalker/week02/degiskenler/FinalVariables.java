package com.ajwalker.week02.degiskenler;

public class FinalVariables {
	public static void main(String[] args) {
		//Değişken kullanımı
		int i=5;
		System.out.println(i);
		
		i=10;
		System.out.println(i);
		
		//Sabit kullanımı:
		final int a=5;
		System.out.println(a);
		
		//a=10; //HATA!!! final keywordü ile tanımlanan değişkenlere sadece 1 kere değer atanır.
		//Sonradan o değer değiştirilemez.
		System.out.println(a);
		
		final int b; // sabit tanımlama
		b=10;  // sabite ilk değer aktarımı
		
		//b=20; //HATA!!! sabitin değeri değiştirilemez.
		
		int c;
		c=10;
		c=20;
		//Math sınıfındaki PI sabitinin kullanımı:
		System.out.println(Math.PI);
		float r=5f;
		final double DAIRE_CEVRE=2 * Math.PI * r;
		final String MARKA="Bilge Adam";
	}
}