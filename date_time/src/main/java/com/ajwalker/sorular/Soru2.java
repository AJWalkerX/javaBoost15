package com.ajwalker.sorular;

import java.time.LocalTime;

public class Soru2 {
	private static final LocalTime OPENING_TIME = LocalTime.of(10, 0); // 10:00
	private static final LocalTime CLOSING_TIME = LocalTime.of(23, 0); // 23:00
	public static void main(String[] args) {
		//Soru 2: Restoran rezervasyon sisteminde belirli tarih ve saate rezarvasyon yapabilir.
		//Ama restoran saat 23:00'de kapanıyor ve 10:00'da açılıyor.
		//Seçilen rezervasyon saatinin bu aralıkta olduğunu kontrol eden bir method
		System.out.println(isReservationTimeValid(LocalTime.of(10, 11)));
		System.out.println(isReservationTimeValid(LocalTime.of(23, 11)));
	}
	public static boolean isReservationTimeValid(LocalTime reservationTime) {
		return !reservationTime.isBefore(OPENING_TIME) && !reservationTime.isAfter(CLOSING_TIME);
	}
}