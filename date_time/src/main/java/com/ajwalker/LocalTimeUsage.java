package com.ajwalker;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeUsage {
	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		LocalTime localTime1 = LocalTime.of(02,15,30);
		System.out.println(localTime1);
		System.out.println(localTime1.getHour());
		System.out.println(localTime1.getMinute());
		System.out.println(localTime1.getSecond());
		System.out.println(localTime1.getNano());
		
		System.out.println("İki saat sonra: "+ localTime1.plusHours(2));
		System.out.println("10 dakika sonra: "+ localTime1.plusMinutes(10));
		System.out.println("iki milisaniye sonra: "+ localTime1.plus(2, ChronoUnit.MILLIS));
	}
}