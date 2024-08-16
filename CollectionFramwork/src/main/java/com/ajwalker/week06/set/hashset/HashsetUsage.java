package com.ajwalker.week06.set.hashset;

import java.util.Arrays;
import java.util.HashSet;

/*
* Set: Küme , bir kümede aynı elemanlar olamaz.
* Listeden farkı tekrarlı eleman barındırmaz.
*
* Hash: 30 -> ATDG56AV
*/
public class HashsetUsage {
	public static void main(String[] args) {
//		//hashcode hesaplama:
//		Integer sayi = 50;
//		System.out.println(sayi.hashCode());
//
//		String isim = "Alex";
//		System.out.println(isim.hashCode());
		
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Elma");
		hashSet.add("Portakal");
		hashSet.add("Mandilina");
		hashSet.add("Kiraz");
		
		System.out.println(hashSet);
		
		String cumle="Merhaba Java15 sınıfı . Java15 sınıfı set konusunu öğreniyor. set konusu çok kolay.";
		String[] kelimeler = cumle.split(" ");
		HashSet<String> kelimeSet = new HashSet<>(Arrays.asList(kelimeler));
//		for (String kelime: kelimeler){
//			kelimeSet.add(kelime);
//		}
		System.out.println(kelimeSet);
		
	}
}