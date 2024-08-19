package com.ajwalker;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/*
* JSON: JavaScript Object Notation
* Hangi dili kullandığınız farketmeksizin, veri taşımak için kullanılan ortak bir yapıdır.
* xml'e göre çok daha az boyut kapladığı için tercih edilmektedir.
* Json ile sistemler arasında veri aktarımı yapılır.
* [
*   {
*       "ad": "Barış",
*       "yas": 30,
*       "araba": null
*   }//Bir Json objesi
* ]
* [
*   {
*       "ad": "Ahmet",
*       "yas": 32,
*       "araba": null
*   }//Bir Json objesi
* ]
*
* {}: Json obje
* []: Json array
* API: Application Programming Interface
*/
/*
	{
		"employees":[
			{"ad":"Selim", "soyad":"Taş", "maas": 50000},
			{"ad":"Ayşe", "soyad":"Taş", "maas": 30000},
			{"ad":"Kenan", "soyad":"Taş", "maas": 60000},
		]
	}
*/
public class Main {
	public static void main(String[] args) {
		UserRepository.getUsers(100).stream()
				.filter(user -> user.getLocation().getCountry().equalsIgnoreCase("Turkey"))
		              .forEach(user -> {
			System.out.println();
			System.out.println("users Array List.....:"+user);
		});
		//1.Kullanıcılar arasında en yaşlı kişiyi bulun.
		//2.Kullanıcıların yaş ortalamasını hesaplayın.
		//3.İsmi "A" harfi ile başlayan kullanıcıları filtreleyip listeyin.
		//4.Kullanıcıları ülkelerine göre gruplandırın ve her ülkeden kaç kullanıcı olduğunu gösterin.
		//5.En çok kullanılan 5 e-posta servis sağlayıcısını (gmail.com, yahoo.com gibi) ve kullanım sayılarını bulun.
		//6.Kullanıcıları cinsiyetlerine göre ayırın ve her cinsiyetin yaş ortalamasını hesaplayın.
		//7.30 yaşından küçük kullanıcıları bulun ve isimleriyle birlikte yaşlarını küçükten büyüğe sıralayarak
		// listeyin.
		//8.Kullanıcıların telefon numaralarının alan kodlarına göre gruplandırın ve her alan kodundan kaç kişi
		// olduğunu gösterin.
		//9.İsim ve soyisimlerinin toplam uzunluğu 15 karakterden fazla olan kullanıcıları bulun ve bu kullanıcıların
		// tam adlarını büyük harfle yazdırın.
		//10.Kullanıcıların doğum tarihlerine göre, hangi ayda kaç kişinin doğduğunu hesaplayın ve sonuçları ay
		// isimlerine göre sıralayın.
	}
}