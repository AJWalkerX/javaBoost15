package com.ajwalker.week06.map.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
* Key kısmında öğrenci adı, value kısmında öğrencinin vize ve final notunu tutabileceğimiz bir Map hazırlayın.
* Ardından 4 tane kayıt girin
* En sonunda da öğrenci adını ve vize final notunu + ortalamasını yazdırın.
* */
public class MapOrnek {
	public static void main(String[] args) {
		Map<String, Integer[]> ogrenciNotlar = new HashMap<>();
		ogrenciNotlar.put("Alex", new Integer[]{60,90});
		ogrenciNotlar.put("Ahmet", new Integer[]{40,83});
		ogrenciNotlar.put("Evrim", new  Integer[]{55,67});
		ogrenciNotlar.put("Cansu", new Integer[]{77,83});
		
		for (Map.Entry<String,Integer[]> entry : ogrenciNotlar.entrySet()){
			System.out.print(entry.getKey()+ "Notlar: ");
			Integer[] notlar = entry.getValue();
			double toplam = 0;
			for (Integer not : notlar){
				toplam += not;
				System.out.print(not+ " ");
			}
			System.out.print(" Ort: "+ toplam/ notlar.length);
			System.out.println();
		}
	}
}