package com.ajwalker.week02.sorular.week02;
/*
* Bir seyahat uygulaması yazıyorsunuz ve kullanıcının gideceği şehre göre bilet fiyatını hesaplamanız gerekiyor. Ankara'ya gidecek kullanıcılara 100 TL, İstanbul'a gidecek kullanıcılara 200 TL, izmir'e gidecek kullanıcılara 150 TL, diğer şehirlere gidecek kullanıcılara ise "Geçerli bir şehir seçiniz." mesajı gösterilmelidir
.*/
public class soru02 {
	public static void main(String[] args) {
		String city = "Ankara";
		int price = 0;
		
		if (city == "Ankara"){
			price = 100;
		}
		else if (city == "İstanbul") {
			price = 200;
		}
		else if (city == "İzmir"){
			price = 150;
		}
		else {
			System.out.println("Geçerli bir şehir seçiniz!");
		}
		System.out.println(price + "tl ödeme yapmalısınız");
	}
}