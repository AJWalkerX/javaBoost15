package com.ajwalker._00_Singleton._01_EagerOrnek;

public class ArabaEager {
	private static ArabaEager instance = new ArabaEager();
	private String marka;
	private ArabaEager() {
		System.out.println("Araba constructor çalıştı.");
	}
	
	public static ArabaEager getInstance(String marka) {
		instance.marka = marka;
		return instance;
	}
}