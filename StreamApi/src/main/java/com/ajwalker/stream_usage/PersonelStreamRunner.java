package com.ajwalker.stream_usage;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonelStreamRunner {
	public static void main(String[] args) {
		List<Personel> personelList = new ArrayList<>();
		personelList.add(new Personel(1,"Cem","Yılmaz","Sinema",100.0));
		personelList.add(new Personel(2,"Tarkan","Tevetoğlu","Müzik",200.0));
		personelList.add(new Personel(3,"Elon","Musk","Space",1_000.0));
		personelList.add(new Personel(4,"Tarık","Akan","Sinema",5_000.0));
		personelList.add(new Personel(5,"Ayşe","Kulin","Edebiyat",7_000.0));
		personelList.add(new Personel(6,"Mauro","Icardi","Futbol",10_000.0));
		personelList.add(new Personel(7,"Yusuf","Dikeç","Spor",5_000.0));
		personelList.add(new Personel(8,"Demet","Akalın","Müzik",3_000.0));
		personelList.add(new Personel(9,"Albert","Einstein","Fizik",35_000.0));
		personelList.add(new Personel(10,"Arda","Güler","Futbol",4_000.0));
		personelList.add(new Personel(10,"Arda","Turan","Futbol",4_000.0));
		
		//
		Stream<Personel> stream1 = personelList.stream();
		Stream<Personel> stream2 = Stream.of(personelList.toArray(new Personel[personelList.size()]));
		Stream<Personel> stream3 = Arrays.stream(personelList.toArray(new Personel[personelList.size()]));
		personelList.stream();
		
		// 1. foreach() : Bir terminal metoddur. Yani sonlandırıcıdır.
//		stream1.forEach(p-> System.out.println(p)); // lamda exp
//		stream1.forEach(System.out::println);// metodreferans
		
		//stream bir terminal operatör ile kullanıldığında içindeki elemanlar tükenir. Tekrar kullanmaya çalışırsak
		//Hara alarız. (IllegalStateException)
		stream1.forEach(p-> System.out.println(p));
//		stream1.forEach(System.out::println);//!Hata verir
		System.out.println("--------------------------------");
		personelList.stream().forEach(p->{
			p.maasArtir(10);
			System.out.println(p);
		});
		System.out.println("---------------------");
		System.out.println(personelList);
		System.out.println("---------------------");
		
		//2.filter() ->
		System.out.println("filter() ile adında e geçen personelleri yazdıralım:");
		personelList.stream().filter(p->p.getName().contains("e")).forEach(System.out::println);
		System.out.println("--------------------------");
		
		//adına a harfi geçenlere %20 zam yap ve yazdır.
		personelList.stream().filter(p-> p.getName().toLowerCase().contains("a")).forEach(p->{
			p.maasArtir(20);
			System.out.println(p);
		});
		System.out.println("--------------------------");
		
		//maası 5_000_000 üzerinde olanlara %1 zam yap.
		personelList.stream().filter(personel -> personel.getMaas()>5_000_000).forEach(personel -> {
			personel.maasArtir(1);
			System.out.println(personel);
		});
		System.out.println("--------------------------");
		
		//3. collect : Stream'dan bir collection oluşturur.
		System.out.println("-------------- Collect toList---------------------");
		//departmanı sinema olan personelleri bir listede tutalım.
		List<Personel> sinema =
				personelList.stream()
				            .filter(p -> p.getDepartman().equals("Sinema")).filter(p ->p.getMaas()>80000)
				            .collect(Collectors.toList());
		System.out.println(sinema);
		
		//4. map
		System.out.println("-------------- map ---------------------");
		personelList.stream().map(Personel::getName).filter(isim ->isim.contains("a"))
		            .forEach(System.out::println);
		
		System.out.println("------------------------------------------------------");
		personelList.stream().map(p-> p.getMaas()+9).forEach(System.out::println);
		System.out.println(personelList); // Maas artmadı
		
		System.out.println("------------------------------------------------------");
		List<Integer> sayilar = List.of(1,2,3,4,5);
		List<Double> collectPow = sayilar.stream().map(sayi -> Math.pow(sayi, 2)).collect(Collectors.toList());
		System.out.println(sayilar);
		System.out.println(collectPow);
		
		//5.distinct
		System.out.println();
		System.out.println("------------------------- distinct -----------------------------");
		personelList.stream().map(Personel::getDepartman).distinct().forEach(System.out::println);
		
		//6.sorted
		System.out.println();
		System.out.println("------------------------- sorted -----------------------------");
		personelList.stream().sorted().forEach(System.out::println);
		
		//7.reversedOrder sorted
		System.out.println();
		System.out.println("------------------------- reversedOrder sorted -----------------------------");
		personelList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//8.limit
		System.out.println();
		System.out.println("------------------------- limit -----------------------------");
		personelList.stream().limit(5).forEach(System.out::println);
		
		//en düşük maaşı alan personelin adı
		System.out.println();
		System.out.println("------------------------- en düşük maaşı alan personelin adı " +
				                   "-----------------------------");
		personelList.stream().sorted().map(Personel::getName).limit(1).forEach(System.out::println);
		
		//9.skip
		System.out.println();
		System.out.println("------------------------- skip -----------------------------");
		personelList.stream().skip(3).limit(3).forEach(System.out::println);
		
		//10.count: eleman sayısı getirir.
		//kaç farklı departman var
		System.out.println();
		System.out.println("------------------------- count -----------------------------");
		System.out.println(personelList.stream().map(Personel::getDepartman).distinct().count());
		System.out.println(personelList.stream().map(Personel::getDepartman).distinct().toList());
		
		System.out.println(personelList.stream().map(Personel::getDepartman).count());
		System.out.println(personelList.stream().map(Personel::getDepartman).toList());
		
		//11. anyMatch ||
		System.out.println();
		System.out.println("------------------------- anyMatch -----------------------------");
		System.out.println(personelList.stream().anyMatch(p -> p.getMaas() < 40_000));
		;
		
		//12. allMatch &&
		System.out.println();
		System.out.println("------------------------- allMatch -----------------------------");
		System.out.println(personelList.stream().allMatch(p -> p.getMaas() > 30_000));
		
		//13.noneMatch !
		System.out.println();
		System.out.println("------------------------- noneMatch -----------------------------");
		System.out.println(personelList.stream().noneMatch(p -> p.getMaas() < 30_000));
		
		//14.reduce
		System.out.println();
		System.out.println("------------------------- reduce -----------------------------");
		List<Integer> sayilarList = Arrays.asList(5,3,2,2);
		Integer sonuc = sayilarList.stream().reduce(0, Integer::sum);
		System.out.println(sonuc);
		sonuc = sayilarList.stream().reduce(1, (carpim, sayi) -> carpim * sayi);
		System.out.println(sonuc);
		
//		Optional<Integer> maxdeger = sayilarList.stream().reduce((sayi1,sayi2) -> sayi1 > sayi2 ? sayi1 : sayi2);
		Optional<Integer> maxdeger = sayilarList.stream().reduce(Integer::max);
		maxdeger.ifPresent(System.out::println); // listenin içi boş ise hata vermemesini sağlar.
	
		//personelList içindeki departmanların adlarını getirip sette toplayalım.
		System.out.println();
		System.out.println("------------------------- -----------------------------");
		Set<String> departmanSet = personelList.stream().map(Personel::getDepartman).collect(Collectors.toSet());
		departmanSet.forEach(System.out::println);
		
		//personelList içindeki personellerin adlarını ve ad uzunluklarını bir map'te toplayınız.
		System.out.println();
		System.out.println("------------------------- -----------------------------");
		Map<String, Integer> isimVeUzunlukMap = personelList.stream().map(Personel::getName).distinct()
		                                           .collect(Collectors.toMap(ad -> ad, String::length));
		isimVeUzunlukMap.forEach((k,v)-> System.out.println(k+ " " +v));
	
		//15.peek
		System.out.println();
		System.out.println("------------------------- peek -----------------------------");
		List<Double> zamliMaasList =
				personelList.stream().peek(p -> System.out.println("Zamdan önceki maaşı: " + p.getMaas()))
				            .map(p -> p.getMaas() * 2)
				            .peek(zamliMaas -> System.out.println("Zamdan sonraki maas: " + zamliMaas))
				            .toList();
		zamliMaasList.forEach(System.out::println);
		System.out.println();
		System.out.println("---- Personel ----");
		personelList.forEach(System.out::println);
		
		//16.joining
		System.out.println();
		System.out.println("------------------------- joining -----------------------------");
		String personelAdlar = personelList.stream().map(Personel::getName).collect(Collectors.joining(" - "));
		System.out.println(personelAdlar);
	}
}