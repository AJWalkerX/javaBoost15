package com.ajwalker.week06.cf_exception;

import java.util.ArrayList;
import java.util.List;

public class _02_ClassCastException {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add(10);
		
		String deger = (String) list.get(1);
		
	/*	Integer sayi=10;
		String sayi2=(String) sayi;*/
		
		// Çözüm mutlaka içindeki elemanların tipini belirtin.
		// List<String> list = new ArrayList();
	}
}