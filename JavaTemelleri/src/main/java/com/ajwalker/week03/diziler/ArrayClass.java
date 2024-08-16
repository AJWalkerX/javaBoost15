package com.ajwalker.week03.diziler;

import java.util.*;

public class ArrayClass {
	public static void main(String[] args) {
		int nums[] = {9, 2, 10, 3, 5, 6};
		String names[] = {"Alex", "Joseph", "Helen"};
		
		System.out.println("Original dizi: " + Arrays.toString(nums));
		System.out.println("Original dizi: " + Arrays.toString(names));
		
//		sort();
		Arrays.sort(nums);
		Arrays.sort(names);
		System.out.println("Sort: ");
		System.out.println("Original dizi: " + Arrays.toString(nums));
		System.out.println("Original dizi: " + Arrays.toString(names));
		System.out.println(nums[0]);
		
		//binarySearch(); //Aranan eleman listede yoksa negatif bir deger doner. Varsa kaçıncı sırada olduğunu  verir
		// (Değerini vermez/indexini verir).
		int binary = Arrays.binarySearch(nums,10);
		System.out.println(binary);
		System.out.println((binary>0)? "index var": "index yok");
		
		//equals(); //index değerleri karşılarştırması için sıralarının da aynı sırada olmalı. Aksi taktirde eşit
		// olmadığına dair false degeri döner.
		int arrayToEquals [] = {1,2,3};
		int arrayToEquals2 [] = {1,3,2};
		boolean isEquals = Arrays.equals(arrayToEquals,arrayToEquals2);
		System.out.println(isEquals);
		
		//fill();
		int arrayFill[] = new int[10];
		System.out.println(Arrays.toString(arrayFill));
		Arrays.fill(arrayFill,1);
		System.out.println(Arrays.toString(arrayFill));
		Arrays.fill(arrayFill, 4,7,2);
		System.out.println(Arrays.toString(arrayFill));
		
		//copyOf();
		int arrayCopyOf [] = {5,2,8,4};
		System.out.println(Arrays.toString(arrayCopyOf));
		int arrayCopyOf2 [] = Arrays.copyOf(arrayCopyOf, 10);
		System.out.println(Arrays.toString(arrayCopyOf2));
		
		//copyOfRange();
		int arrayCopyOfRange[] = Arrays.copyOfRange(arrayCopyOf, 0,3);
		System.out.println(Arrays.toString(arrayCopyOfRange));
		
		//stream().sum();
		int sum = Arrays.stream(arrayCopyOf).sum();
		System.out.println(Arrays.toString(arrayCopyOf)+ " toplami: "+ sum);
		
		//stream().average();
		OptionalDouble average = Arrays.stream(arrayCopyOf).average();
		System.out.println(Arrays.toString(arrayCopyOf)+ " Ortalamasi: "+ average.getAsDouble());
		
		//count: eleman sayisi
		long count = Arrays.stream(arrayCopyOf).count();
		System.out.println(Arrays.toString(arrayCopyOf)+ " count: "+ count);
		
		//max-min
		OptionalInt max = Arrays.stream(arrayCopyOf).max();
		System.out.println(Arrays.toString(arrayCopyOf)+ " max deger: "+ max.getAsInt());
		OptionalInt min = Arrays.stream(arrayCopyOf).min();
		System.out.println(Arrays.toString(arrayCopyOf)+ " min deger: "+ min.getAsInt());
		
		//asList();
		int arrayList [] = {8,2,5,6};
		List<int[]> list = Arrays.asList(arrayList);
		System.out.println(list);
		
		Integer arrayList2 [] = {8,2,5,6};
		List<Integer> list2 = Arrays.asList(arrayList2);
		System.out.println(list2);
		
		
		//deepToString
		int[][] twoDimension = {
				{1,2,3},
				{5,6,7},
				{0,19,11,23}
		};
		System.out.println(Arrays.toString(twoDimension));
		System.out.println(Arrays.deepToString(twoDimension));
		
		//BONUS: foreach
		System.out.println();
		for (int [] satir: twoDimension){
			for (int item: satir){
				System.out.print(item+" ");
			}
			System.out.println();
		}
	}
}