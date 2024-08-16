package com.ajwalker.week06.map.hashmap.ogrenci;

import java.util.HashMap;

public class OgrenciMap {
	public static void main(String[] args) {
		HashMap<Integer,Ogrenci> ogrenciHashMap = new HashMap<>();
		Ogrenci ogr1 = new Ogrenci("Tolga",101,"Kömeç");
		Ogrenci ogr2 = new Ogrenci("Selin",102,"Sancak");
		Ogrenci ogr3 = new Ogrenci("Özkan",103,"Sargın");
		
		ogrenciHashMap.put(ogr1.getOgrenciNo(), ogr1);
		ogrenciHashMap.put(ogr2.getOgrenciNo(), ogr2);
		ogrenciHashMap.put(ogr3.getOgrenciNo(), ogr3);
		
		System.out.println(ogrenciHashMap);
		
		//101 nolu öğrencinin bilgileri
		System.out.println(ogrenciHashMap.get(101));
	}
}