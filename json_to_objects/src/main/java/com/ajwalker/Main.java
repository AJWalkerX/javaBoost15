package com.ajwalker;

import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
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
		List<User> users = UserRepository.getUsers(100);
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
		
		System.out.println();
		System.out.println("SORU: 5");
//		groupByMails(users);
		
		System.out.println();
		System.out.println("SORU: 6");
//		averageAgeByGender(users);
		
		System.out.println();
		System.out.println("SORU: 7");
//		getYoungUsers(users);
		
		System.out.println();
		System.out.println("SORU: 8");
//		groupUserByAreaCode(users);
		
		System.out.println();
		System.out.println("SORU: 9");
		getFullNameLongerThan15(users);
		
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
	private static void groupByMails(List<User> users){
		users.stream().collect(Collectors.groupingBy(User::getEmail)).forEach((s, users1)->{
			System.out.println(s+" :");
			int counter = 0;
			for (User user: users1){
				System.out.println( (++counter)+ "- "+user);
			}
			System.out.println();
		});
	}
	//6.Kullanıcıları cinsiyetlerine göre ayırın ve her cinsiyetin yaş ortalamasını hesaplayın.
	private static void averageAgeByGender(List<User> users){
		AtomicInteger fAverage = new AtomicInteger(0);
		AtomicInteger fCounter = new AtomicInteger(0);
		AtomicInteger mCounter = new AtomicInteger(0);
		AtomicInteger mAverage = new AtomicInteger(0);
		users.stream().collect(Collectors.groupingBy(User::getGender)).forEach((gender,user)-> {
			
			for (User user1: user){
				if (user1.getGender().equals("female")){
					fAverage.addAndGet((int)user1.getDob().getAge());
					fCounter.getAndIncrement();
				}else if (user1.getGender().equals("male")){
					mAverage.addAndGet((int)user1.getDob().getAge());
					mCounter.getAndIncrement();
				}
			}
			if (fAverage.get() != 0 && mAverage.get() != 0){
				System.out.println("average female age: "+fAverage.get()/fCounter.get());
				System.out.println("average male age: "+mAverage.get()/mCounter.get());
			}
		});
	}
	//7.30 yaşından küçük kullanıcıları bulun ve isimleriyle birlikte yaşlarını küçükten büyüğe sıralayarak
	// listeyin.
	private static void getYoungUsers(List<User> users){
		users.stream()
		     .filter(user -> user.getDob().getAge() < 30)
		     .sorted(Comparator.comparingInt(user -> Math.toIntExact(user.getDob().getAge())))
		     .map(user -> user.getDob().getAge() + " - " + user.getName().getFirst())
		     .forEach(System.out::println);
	}
	//8.Kullanıcıların telefon numaralarının alan kodlarına göre gruplandırın ve her alan kodundan kaç kişi
	private static void groupUserByAreaCode(List<User> users){
		users.stream().collect(Collectors.groupingBy(User::getNat)).forEach((s, users1) -> {
			int counter = 0;
			for (User user : users1){
				counter++;
			}
			System.out.println(s +" - "+ counter);
		});
	}
	//9.İsim ve soyisimlerinin toplam uzunluğu 15 karakterden fazla olan kullanıcıları bulun ve bu kullanıcıların
	// tam adlarını büyük harfle yazdırın.
	private static void  getFullNameLongerThan15(List<User> users){
		users.stream().filter(user -> user.getName().getFirst().length()+user.getName().getLast().length() > 16)
		     .map(user -> user.getName().getFirst()+ " "+ user.getName().getLast()).forEach(System.out::println);
	}
	
}