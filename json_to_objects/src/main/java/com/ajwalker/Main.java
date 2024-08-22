package com.ajwalker;

import java.io.IOException;
import java.net.URL;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		List<User> users = UserRepository.getUsers(10);
		users.stream()
		     .forEach(user -> {
			     System.out.println();
//			     System.out.println("users Array List.....:"+user);
		     });
		//Soru1:
		System.out.println();
		System.out.println("SORU: 1");
//		showOldestPerson(users);
		
		//Soru2:
		System.out.println();
		System.out.println("SORU: 2");
//		calculateAverageUserAge(users);
		
		//Soru3:
		System.out.println();
		System.out.println("SORU: 3");
//		getUserNameByBeginningWithLetterA(users);
		
		//Soru4:
		System.out.println();
		System.out.println("SORU: 4");
//		groupByCountry(users);
		
		
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
	//1.Kullanıcılar arasında en yaşlı kişiyi bulun.
	private static void showOldestPerson(List<User> users){
		
		Optional<User> max =
				users.stream().max(Comparator.comparingLong(age -> age.getDob().getAge()));
		System.out.println(max.get());
	}
	//2.Kullanıcıların yaş ortalamasını hesaplayın.
	private static void calculateAverageUserAge(List<User> users){
		Double collect =
				users.stream().map(user -> user.getDob().getAge()).collect(Collectors.averagingLong(user -> user));
		System.out.println(collect);
	}
	//3.İsmi "A" harfi ile başlayan kullanıcıları filtreleyip listeyin.
	private static void getUserNameByBeginningWithLetterA(List<User> users){
	users.stream().filter(user -> user.getName().getFirst().contains("A")).forEach(System.out::println);
	
	}
	//4.Kullanıcıları ülkelerine göre gruplandırın ve her ülkeden kaç kullanıcı olduğunu gösterin.
	private static void groupByCountry(List<User> users){
		users.stream().collect(Collectors.groupingBy(user -> user.getLocation().getCountry()))
		     .forEach((s, users1) -> {
			     System.out.println(s+ ": " + users1.size() +" adet kullanıcı var:");
				 int counter = 0;
				 for (User user: users1){
					 System.out.println( (++counter)+ "- "+user);
				 }
				 
		     });
	}
	//5.En çok kullanılan 5 e-posta servis sağlayıcısını (gmail.com, yahoo.com gibi) ve kullanım sayılarını bulun.
	
}