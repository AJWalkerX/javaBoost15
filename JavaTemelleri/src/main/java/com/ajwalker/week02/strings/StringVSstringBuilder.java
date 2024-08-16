package com.ajwalker.week02.strings;

public class StringVSstringBuilder {
	public static void main(String[] args) {
		long islemAdet = 100_000;
		long startTime = System.currentTimeMillis();
		String metin ="Hello";
		for (int i = 0; i<islemAdet; i++){
			metin+=i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("String icin: "+ (endTime-startTime));
		
		startTime = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		for (int i = 0; i <islemAdet; i++){
			sb.append(i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder icin: "+ (endTime-startTime));
	}
}