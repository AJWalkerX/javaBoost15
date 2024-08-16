package com.ajwalker.week06.map.treemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/*
A.
Ali Eken, İstanbul
Ayşe Eken, Ankara

B.
Betül Kara, Denizli
Beyza Sarı, Bursa

C.
Ceren Kara, Bolu

D.
Demir Sarı, Antalya

F.
Funda Sarı, İzmir
*/
public class Fihrist {
	static TreeMap<Character, ArrayList<Kisi>>  kisilerTreeMap;

	public static void main(String[] args) {
		kisilerTreeMap = new TreeMap<>();
		initKisi();
		mapYazdir();
		mapYazdirKeySet();
	}
	
	private static void mapYazdirKeySet() {
		System.out.println("mapYazdirKeySet");
		for (Character key: kisilerTreeMap.keySet()){
			System.out.println(key+ ".");
			for (Kisi kisi: kisilerTreeMap.get(key)){
				System.out.println(kisi);
			}
			System.out.println();
		}
	}
	
	private static void mapYazdir() {
		System.out.println("mapYazdir");
		//Map yazdırma (entrySet):
		for (Map.Entry<Character,ArrayList<Kisi>> entry:kisilerTreeMap.entrySet()){
			Character key = entry.getKey();
			System.out.println(key+".");
			
			ArrayList<Kisi> value = entry.getValue();
			for (Kisi kisi: value){
				System.out.println(kisi);
			}
			System.out.println();
		}
	}
	
	private static void initKisi() {
		kisiEkle(new Kisi("Ali","Eken","İstanbul"));
		kisiEkle(new Kisi("Ayşe","Eken","Ankara"));
		kisiEkle(new Kisi("Betül","Kara","Denizli"));
		kisiEkle(new Kisi("Ceren","Kara","Bolu"));
		kisiEkle(new Kisi("Demir","Sarı","Antalya"));
		kisiEkle(new Kisi("Funda","Sarı","İzmir"));
	}
	
	private static void kisiEkle(Kisi kisi) {
		char ilkHarf = kisi.getAd().charAt(0);
		kisilerTreeMap.putIfAbsent(ilkHarf,new ArrayList<>());
		kisilerTreeMap.get(ilkHarf).add(kisi);
	}
}