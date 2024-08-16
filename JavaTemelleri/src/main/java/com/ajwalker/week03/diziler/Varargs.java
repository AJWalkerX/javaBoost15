package com.ajwalker.week03.diziler;

public class Varargs {
	public static void main(String[] args) {
//		varargs(variable arguments) : Bir metoda aynı tipte değişken sayıda değer göndermek için kullanılır.
//		metod parametresinde dizi kullanımının alternetifidir.
//		main metod parametre olarak String[] args almaktadır. Yani bir String dizisini parametre olarak alabiliyor
//		burada String[] args yerine String... args da kullanılabilir. Bu yönteme varargs denir.
		int toplam = topla(5, 10, 40, 50, 1, 2, 3);
		System.out.println(toplam);
	}
	
	public static int topla(int... sayilar) { //varags yöntemi
		int toplam = 0;
		for (int item : sayilar) {
			toplam += item;
		}
		return toplam;
	}
}