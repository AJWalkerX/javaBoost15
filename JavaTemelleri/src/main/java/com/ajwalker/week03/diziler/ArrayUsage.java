package com.ajwalker.week03.diziler;
//Dizilerde elemanlar atnı tip veri olmalıdır.
//Dizinin eleman sayısı başlangıçta belirtilmelidir.
public class ArrayUsage {
	public static void main(String[] args) {
		String students[] = new String[]{"Ahmet Eris", "Alexander J. Walker", "Alper Guler"};
		String students2[] = {"Ahmet Eris", "Alexander J. Walker", "Alper Guler"};
		//[] parantezi ister değişken isminin başına ister sonuna ekle. Çalışır
		
		int intDizi[]; //Tercihen bu
		int []intDizi1;
		
		//5 adet veri girişi yeri açıldı.
		intDizi = new int[5];
		
		intDizi[0] = 1;
//		intDizi[5] = 3; //HATA
		
		System.out.println(students[1]);
		//Varsayılan deger olarak false deger atar
		boolean booleanDizi[] = new boolean[3];
		System.out.println(booleanDizi[0]);
//		Varsayılan olarak 0 degerini atar.
		System.out.println(intDizi[1]);
//		Varsayılan olarak null degeri taşır.
		String s[] = new String[10];
		System.out.println(s[1]);
		
		s[0] = "Ahmet";
		s[1] = "Ayse";
		s[8] = "Berhat";
		System.out.println("--------------Donguler--------------");
		for (int i = 0; i < s.length; i++){
			System.out.println(s[i]);
		}
		System.out.println("-----------------Foreach-------------------");
		for (String item:students){
			System.out.println(item);
		}
		students = new String[5]; // dizinin boyutunu büyütebiliriz. Fakat verilerin hepsi uçar.
		
		for (String item:students){
			System.out.println(item);
		}
	}
}