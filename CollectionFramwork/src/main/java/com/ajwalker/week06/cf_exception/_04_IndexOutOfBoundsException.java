package com.ajwalker.week06.cf_exception;

import java.util.ArrayList;
import java.util.List;

public class _04_IndexOutOfBoundsException {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(List.of("A", "B", "C"));
		
		System.out.println(list);
		list.add("D");
		System.out.println(list);
		//System.out.println(list.get(4)); // Hata verir. IndexOutOfBoundsException
		
		List<String> list2 = List.of("A", "B", "C");
		list2.add("D"); // Hata verir. UnsupportedOperationException
	}
}