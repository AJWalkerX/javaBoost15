package com.ajwalker.week06.set.hashset;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		int[] dizi = {1,2,3,1,2,4,2,2,1,1,5};
		tekrarEdenleriBul(dizi);
	}
	
	private static void tekrarEdenleriBul(int[] dizi) {
		HashSet<Integer> tekrarEdenler = new HashSet<>();
		HashSet<Integer> tekrarsiz = new HashSet<>();
		for (int sayi : dizi){
			if (!tekrarsiz.add(sayi)){
				tekrarEdenler.add(sayi);
			}
		}
		tekrarsiz.removeAll(tekrarEdenler);
		System.out.println(tekrarEdenler);
		System.out.println(tekrarsiz);
	}
}