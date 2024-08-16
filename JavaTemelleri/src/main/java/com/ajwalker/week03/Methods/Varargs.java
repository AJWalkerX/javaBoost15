package com.ajwalker.week03.Methods;

public class Varargs {
	public static void main(String[] args) {
		sum(1,2);
		sum(1,2,3,4,5,6);
	}
	//Dışarından 2 int sayi parametre olarak alan ve toplamlarını int olarak dönen bir sum methodu
	public static int sum(int num, int num1){
		return num +num1;
	}
	public static int sum(int ... nums){
		int sum = 0;
		for (int item:nums){
			sum+=item;
		}
		return sum;
	}
	// İki tane alakasız işlemi tek bir method'da kullanmamalısın yaş ve isim ayrı metodlarda olması daha güzel olur
	public static int IsimYas(String ad, int ... nums){ //varargs en son parametre olmalıdır.
		int yas = 19;
		ad = "Ahmet";
		System.out.println(ad);
		return yas;
	}
}