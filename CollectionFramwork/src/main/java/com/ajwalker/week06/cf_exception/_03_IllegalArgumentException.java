package com.ajwalker.week06.cf_exception;

import java.util.ArrayList;
import java.util.List;

public class _03_IllegalArgumentException {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(10);
		//List<String> list2 = new ArrayList<String>("a");
		List<String> list3 = new ArrayList<String>(-1); // HATA negatif argüman girilmiş.
	}
}