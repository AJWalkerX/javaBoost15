package com.ajwalker.week06.set.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetExample2 {
	public static void main(String[] args) {
		HashSet<Integer> sayilarSet = new HashSet<>();
		
		sayilarSet.add(1);
		sayilarSet.add(10);
		sayilarSet.add(100);
		sayilarSet.add(1000);
		System.out.println(sayilarSet);
		
//		Collections.sort(sayilarSet);
		//!Hatalı kod
		
		ArrayList<Integer> sayilarList =new ArrayList<>(sayilarSet);
		Collections.sort(sayilarList);
		System.out.println(sayilarList);
	}
	
}