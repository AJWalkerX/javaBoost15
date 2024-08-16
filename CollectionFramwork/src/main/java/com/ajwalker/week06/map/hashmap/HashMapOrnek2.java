package com.ajwalker.week06.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// soru ve cevapları tutacağımız bir hashmap tasarlayalım.

// Türkiyenin başkenti neresidir?   Ankara
// Kaç il vardır?                   81
// EN büyük il hangisidir?          Konya
// En kalabalık il hangisidir?      İstanbul
public class HashMapOrnek2 {
	public static void main(String[] args) {
		HashMap<String, String> sorularCevaplar = new HashMap<>();
		sorularCevaplar.put("Türkiyenin başkenti neresidir?","Ankara");
		sorularCevaplar.put("Kaç il vardır?","81");
		sorularCevaplar.put("EN büyük il hangisidir?","Konya");
		sorularCevaplar.put("En kalabalık il hangisidir?","İstanbul");
		
		int dogruCevapS = 0;
		int yanlisCevapS = 0;
		int puan = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("OYUNA HOŞGELDİNİZ");
		
		for(String soru: sorularCevaplar.keySet()){
			System.out.println(soru);
			String kullaniciCevap = sc.nextLine().trim();
			String dogruCevap = sorularCevaplar.get(soru);
			
			if (kullaniciCevap.equalsIgnoreCase(dogruCevap)){
				puan += 10;
				dogruCevapS++;
				System.out.println("Doğru");
			}else{
				System.out.println("Yanlış. Doğru cevap: "+ dogruCevap);
				yanlisCevapS++;
			}
		}
		System.out.println("OYUN BİTTİ");
		System.out.println("Doğru Cevap: "+dogruCevapS+ " Yanlış Cevap:"+yanlisCevapS);
		System.out.println("Puan:"+puan);
		
	}
	
}