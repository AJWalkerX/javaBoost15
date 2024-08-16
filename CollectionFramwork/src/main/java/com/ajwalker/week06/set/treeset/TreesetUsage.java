package com.ajwalker.week06.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

/*
* Eşsiz elemanlardan oluşur.
* Elemanları doğal sıralı olarak tutar.
* Elemanlara erişim hızlıdır.
* Eleman sayısı artıkça logaritmik olarak tüm işlemlerin sırası artar.
*/
public class TreesetUsage {
	public static void main(String[] args) {
		TreeSet<String> sehirler = new TreeSet<>();
		sehirler.add("A");
		sehirler.add("D");
		sehirler.add("C");
		sehirler.add("E");
		System.out.println(sehirler);
		
		//uzunluğa göre sıralı getiren treeset
		TreeSet<String> isimler = new TreeSet<>(Comparator.comparing(String::length));
		isimler.add("Ahmet"); //5
		isimler.add("Alex"); //4
		isimler.add("Alper"); // 5 olduğu için almadı
		isimler.add("Alperen"); // 7
		isimler.add("Anıl"); // 4 olduğu için  eklemedi
		isimler.add("Berkay"); //6
		
		System.out.println(isimler);
	}
}