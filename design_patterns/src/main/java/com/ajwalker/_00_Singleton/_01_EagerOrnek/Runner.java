package com.ajwalker._00_Singleton._01_EagerOrnek;


public class Runner {
	public static void main(String[] args) {
		ArabaEager a1= ArabaEager.getInstance("BMW");
		System.out.println(a1);
		ArabaEager a2= ArabaEager.getInstance("Audi");
		System.out.println(a2);
		ArabaEager a3= ArabaEager.getInstance("Mercedes");
		System.out.println(a3);
	}
}