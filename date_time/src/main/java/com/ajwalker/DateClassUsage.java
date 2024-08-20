package com.ajwalker;

import java.util.Date;
/*
 Date class içindeki çoğu method deprecated olmuş durumdadır.
 Yani yeni java sürümünde tamamen kaldırma ihtimali vardır.
*/
public class DateClassUsage {
	public static void main(String[] args) {
		System.out.println(new Date());
		
		Date date = new Date();
		System.out.println("Tarih: "+ date);
		System.out.println("Tarih: "+ date.getTime()); //CurrentTimeMillis ile aynı değeri döner
		
	}
}