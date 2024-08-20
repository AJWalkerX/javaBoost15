package com.ajwalker;

import java.time.LocalDate;
import java.time.Period;

public class PeriodUsage {
	public static void main(String[] args) {
		LocalDate dogumGunu = LocalDate.of(1990, 1,1);
		Period gecenZaman = Period.between(dogumGunu, LocalDate.now());
		System.out.println(gecenZaman);
		int years = gecenZaman.getYears();
		int months = gecenZaman.getMonths();
		int days = gecenZaman.getDays();
		System.out.println(years+ " yıl "+months+ " ay "+ days+ " günlüksünüz.");
		Period onBesGunlukPeriod = Period.of(0,0,15);
		System.out.println(dogumGunu.plus(onBesGunlukPeriod));
	}
}