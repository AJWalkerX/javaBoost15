package com.ajwalker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeUsage {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		//2024-08-20 T 10:40:18.322786700
		
		LocalDateTime localDateTime = LocalDateTime.of(2024,10,5,10,30);
		System.out.println(localDateTime);
		
		LocalDate localDate = LocalDate.of(2043, 10,5);
		LocalTime localTime = LocalTime.of(20, 10, 5);
		LocalDateTime localDateTime1 = LocalDateTime.of(localDate,localTime);
		System.out.println(localDateTime1);
	}
}