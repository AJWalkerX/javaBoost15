package com.ajwalker;

import java.util.Calendar;
/*
* 1.1 sürümünden beri var!
* */
public class CalendarUsage {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println();
		System.out.println(calendar);
		System.out.println();
		System.out.println(calendar.getCalendarType()); //gregory
		System.out.println();
		System.out.println(calendar.getFirstDayOfWeek()); //2
		System.out.println(calendar.getWeekYear()); //2024
		//TODO:Devamını al!!!
	}
}