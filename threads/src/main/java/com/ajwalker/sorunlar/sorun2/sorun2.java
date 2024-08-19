package com.ajwalker.sorunlar.sorun2;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class sorun2 {
	public static void main(String[] args) {
		AtomicInteger i = new AtomicInteger(1); // int ile lambda içerisinde değer artırımı yapılamıyor.
		List<String> isimler = List.of("Özkan","Ahmet","Emine", "Alex","Muzaffer","Emirhan");
		isimler.forEach(isim->{
			System.out.println(i+ ".kisi= "+isim);
			i.getAndIncrement();
		});
	}
}