package com.ajwalker.assignments.week02.weekend;
//Soru 17.  Bir char değeri int'e dönüştürün ve sonucu ekrana yazdırın. (implicit/explicit)

public class Quest17 {
	public static void main(String[] args) {
		char a = 'a';
		int asciiOfa = a; //cast işlemine gerek yok. Otomatik oluyor
		System.out.println(asciiOfa);
	}
}