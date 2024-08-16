package com.ajwalker.week02.sorular.week02;

import java.util.Scanner;
/*
* Kullanıcının girdiği ürün fiyatına göre(scanner) indirim uygulayan bir program yazmanız gerekiyor.
 Ürün fiyatı 1000 TL veya üzerinde ise %20,
  500-999 TL arası %10,
  100-499 TL arası %5 indirim uygulanacaktır.
  Bu durumda if-else-if-else yapısı kullanarak bir program yazabilirsiniz.
  * */
public class Soru05 {
	public static void main(String[] args) {
		int price;
		double discount;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Urun fiyatini giriniz: ");
		price = sc.nextInt();
		
		if (price >= 1000){
			discount = price * 0.8;
			System.out.println("Indirimli fiyat: " + discount);
		}
		else if (price >= 500){
			discount = price * 0.9;
			System.out.println("Indirimli fiyat: " + discount);
		}
		else if (price >= 100){
			discount = price * 0.95;
			System.out.println("Indirimli fiyat: " + discount);
		}
	}
}