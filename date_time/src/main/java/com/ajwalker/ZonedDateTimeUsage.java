package com.ajwalker;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeUsage {
	public static void main(String[] args) {
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Australia/Darwin"));
		System.out.println(zonedDateTime);
		ZoneId.getAvailableZoneIds().forEach(System.out::println);
	}
}