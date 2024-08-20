package com.ajwalker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
public class DateTimeFormatterUsage {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		LocalDate yasGunu= LocalDate.of(2017,12,5);
		System.out.println(yasGunu +" formatsız olan");
		System.out.println(yasGunu.format(dtf));
	}
}