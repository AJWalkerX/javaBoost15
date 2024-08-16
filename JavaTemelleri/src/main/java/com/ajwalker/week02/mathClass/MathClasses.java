package com.ajwalker.week02.mathClass;

public class MathClasses {
	public static void main(String[] args) {
//		Math m1 = new Math(); -> Math sınıfı constructor'ı private olduğu için nesne oluşturamazsınız.
	int number = 10, number2 = -20;
		System.out.println(Math.abs(number2)); // abs(); -> mutlak deger alir.
		
		System.out.println(Math.max(number,number2)); // Büyük sayıyı döndürür. ikiden fazla değer alabilir.
		
		System.out.println(Math.min(number,number2)); // Küçük sayıyı döndürür. ikiden fazla değer alabilir.
		
		System.out.println(Math.pow(2,5)); // 2 üzeri 5 işlemini gerçeleştirdi.
		
		System.out.println(Math.sqrt(25)); //Karekök işlemini yapar.
		
		//Yuvarlama işlemleri
		System.out.println(Math.ceil(5.00001)); // Yukarı yuvarlar
		System.out.println(Math.floor(5.9999)); // Aşağı yuvarlar
		// En yakın olan sayıya yuvarlar.
		System.out.println(Math.round(5.4));
		System.out.println(Math.round(5.5001));
		
		//Random();
		System.out.println(Math.random()); // 0-1 arasında rasgele bir sayı üretir.
	}
}