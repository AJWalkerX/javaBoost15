package com.ajwalker.week06.cf_exception;

import java.util.List;

public class _01_NullPointerException {
	public static void main(String[] args) {
		List<String> list=null;
		list.add("Ankara"); // NullPointerException
		
		if(list != null){
			list.add("Ankara");
		}
		
		System.out.println("Son satır");
	}
}