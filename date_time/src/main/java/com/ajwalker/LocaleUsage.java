package com.ajwalker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocaleUsage {
	public static void main(String[] args) {
		//https://www.oracle.com/java/technologies/javase/jdk8-jre8-suported-locales.html
		//Hangi gün doğdum
		Locale tr = new Locale("tr", "TR");
		LocalDate localDate = LocalDate.of(1999,10,01);
		System.out.println(localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, tr));
		System.out.println(localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE");
		System.out.println(dateTimeFormatter.format(localDate));
	}
}