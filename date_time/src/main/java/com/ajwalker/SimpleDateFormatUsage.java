package com.ajwalker;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatUsage {
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		//https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd - MM - yyyy");
		System.out.println(simpleDateFormat.format(date));
		SimpleDateFormat simpleDateFormatTR = new SimpleDateFormat("(dd-MM-yyyy) : HH:mm:ss");
		System.out.println("TR format : "+ simpleDateFormatTR.format(date));
		
		LocalDate localDate = LocalDate.now();
//		System.out.println(simpleDateFormatTR.format(localDate)); -> Hata verir.
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(simpleDateFormatTR.format(calendar.getTime()));
	}
}