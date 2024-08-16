package com.ajwalker.stream_usage;

import java.util.*;
import java.util.stream.IntStream;

public class IntStreamUsage {
	public static void main(String[] args) {
		IntStream intStream = IntStream.of(1,2,3,4,5);
		
		System.out.println(intStream.max().getAsInt());
		
//		System.out.println(intStream.sum());
		System.out.println("-----");
		IntStream.iterate(0, i -> i+2).limit(10).forEach(System.out::println);
		System.out.println("-----");
		IntStream.generate(new Random()::nextInt).limit(5).forEach(System.out::println);
		
		//20-50 arasındaki sayiların toplamı
		System.out.println("-----");
		int sum = IntStream.rangeClosed(20,50).sum();
		System.out.println(sum);
		System.out.println("-----");
		//10 ile 100 arasındaki en büyük sayıyı dön
		OptionalInt max = IntStream.range(10,100).max();
		System.out.println(max.getAsInt());
		
		
		System.out.println("-----");
		// verilen listedeki çift sayıların sayısını bulunuz.
		List<Integer> sayilar = Arrays.asList(5,20,30,10,15);
		long count = sayilar.stream().filter(sayi -> sayi % 2 == 0).count();
		System.out.println(count);
		//mapToInt : Integer nesnelerini primitive int değerlere döüştürür. (Unboxing)
		long count1 = sayilar.stream().mapToInt(Integer::intValue).filter(sayi -> sayi % 2 == 0).count();
		System.out.println(count1);
		
		//boxing: primitive data type'ı wrapper nesnesine çevirmek.
		IntStream intStream1 = IntStream.rangeClosed(0,4); // 0, 5000
		intStream1.boxed().toList().forEach(System.out::println);
	}
}