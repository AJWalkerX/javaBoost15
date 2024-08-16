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
			//burada 10 faklı stream sorusu yazın ve çözün
		});
	}
}