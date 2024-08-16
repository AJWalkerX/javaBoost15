package com.ajwalker.week06.map.hashmap;

import java.io.FilterOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
(k,v) key, value
(k,v) entry
(6,"Ankara")
(34, "İstanbul")
(35, "İzmir")

key kısmında tekrarsız veri tutulurken value kısmında tekrarlı veri tutulabilir.
* */
public class HashmapUsage {
	public static void main(String[] args) {
		HashMap<String, Integer> yaslar= new HashMap<>();
		yaslar.put("Berkay", 26);
		yaslar.put("Emine", 24);
		yaslar.put("Emirhan", 23);
		yaslar.put("Mehmet", 24);
		yaslar.put("Mehmet", 26);
		yaslar.put("Mehmet", 32); // put methodu key tekrarı olduğunda value içerisini günceller.
		yaslar.putIfAbsent("Mehmet", 30); // eğer key yoksa ekleme yapar.
		System.out.println(yaslar);
		
		//keySet() methodu ile birlikte sadece key'leri geri döner.
		Set<String> yaslarMapindekiIsismler = yaslar.keySet();
		System.out.println(yaslarMapindekiIsismler);
		
		//Valueları getirme
		Collection<Integer> values = yaslar.values();
		System.out.println(values);
		
		//Entry getirme
		Set<Map.Entry<String, Integer>> entries = yaslar.entrySet();
		System.out.println(entries);
		
		Integer evrimValue = yaslar.get("Emine");
		System.out.println(evrimValue);
		
		//Aranan key yoksa default değeri döner.
		Integer samiValue = yaslar.getOrDefault("Sami", 0);
		System.out.println(samiValue);
		
		Integer berkayEskiValue = yaslar.replace("Berkay", 40);
		System.out.println(berkayEskiValue);
		System.out.println(yaslar);
		
		yaslar.replace("Berkay", 20,60);
		System.out.println(yaslar);
		
		yaslar.replaceAll((k,v)->{
			v+=10;
			k=k.toUpperCase(); //Keyler üzerinde bir değişiklik yapılamaz.
			return v;
		});
		System.out.println(yaslar);
		System.out.println(yaslar.size()); // map içerisindeki entry sayısını verir.
	}
}