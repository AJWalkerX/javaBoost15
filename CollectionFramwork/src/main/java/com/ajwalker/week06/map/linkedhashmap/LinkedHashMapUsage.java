package com.ajwalker.week06.map.linkedhashmap;
/*
Ekleme sırasına göre verileri tutar.
* */

import java.util.LinkedHashMap;

public class LinkedHashMapUsage {
	public static void main(String[] args) {
		LinkedHashMap<String, String> renkler =new LinkedHashMap<>();
		renkler.put("KIRMIZI","#FF0000");
		renkler.put("MAVI","#0000FF");
		renkler.put("GREEN","#00FF00");
		renkler.put("SARI","#FFFF00");
		
		System.out.println(renkler);
	}
}