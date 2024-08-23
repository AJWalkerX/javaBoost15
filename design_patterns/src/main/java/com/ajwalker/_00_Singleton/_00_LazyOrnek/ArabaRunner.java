package com.ajwalker._00_Singleton._00_LazyOrnek;

import java.util.ArrayList;

public class ArabaRunner {
	public static void main(String[] args) {
		/*Araba a1=new Araba();
		a1.getInstance();
		System.out.println(a1);
		a1=new Araba();
		System.out.println(a1);
		a1=new Araba();
		System.out.println(a1);*/
		
		ArrayList<ArabaLazy> arabaArrayList=new ArrayList<>();
		
		ArabaLazy a1= ArabaLazy.getInstance("Audi");
		arabaArrayList.add(a1);
		System.out.println(a1);
		
		a1= ArabaLazy.getInstance("Opel");
		arabaArrayList.add(a1);
		System.out.println(a1);
		
		a1= ArabaLazy.getInstance("BMW");
		arabaArrayList.add(a1);
		System.out.println(a1);
		
		System.out.println(arabaArrayList.size()); //3
		arabaArrayList.forEach(araba -> System.out.println(araba.getMarka()));
	}
}