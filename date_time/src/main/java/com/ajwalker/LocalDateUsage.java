package com.ajwalker;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/*
* 1.8 sürümünde eklendi*/
public class LocalDateUsage {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2024,6,26);
		System.out.println(localDate);
		System.out.println(localDate.getYear());//2024
		System.out.println(localDate.getMonth());//June
		System.out.println(localDate.getMonthValue()); //6
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.getEra());
		System.out.println("---------------------");
		
		LocalDate localDateYarin =localDate.plusDays(1);
		System.out.println("Yarının tarihi: "+ localDateYarin);
		LocalDate ucAySonrasi = localDate.plusMonths(3);
		System.out.println("Uc ay sonrasi: "+ ucAySonrasi);
		LocalDate ikiHaftaSonrasi = localDate.plusWeeks(2);
		System.out.println("İki hafta sonrası: "+ ikiHaftaSonrasi);
		System.out.println("------------------------------------------------");
		LocalDate localDate1 = LocalDate.of(2024,6,26);
		System.out.println(localDate1.minusDays(5));
		System.out.println(LocalDate.now().minusYears(100));
		System.out.println(LocalDate.now().minus(100, ChronoUnit.DECADES));
	
		//12 taksitli satış yapıldı ödeme tarihlerini ver
		LocalDate baslangicTarihi = LocalDate.now();
		System.out.println("Odeme tarihleri: ");
		for (int i = 0; i < 12; i++){
			LocalDate odemeTarihi = baslangicTarihi.plusMonths(1+i);
			System.out.println((1+i)+". odeme tarihi: "+ odemeTarihi);
		}
		System.out.println("--------------------------------");
		LocalDate parseEdilmisTarih = LocalDate.parse("2008-05-28");
		System.out.println(parseEdilmisTarih);
		System.out.println("--------------------------------");
	}
}