package com.ajwalker.week06.cf_exception;

import java.util.ArrayList;
import java.util.List;

public class _05_StackOverFlow {
	public static void main(String[] args) {
		List<Object> isimler=new ArrayList<>();
		
		isimler.add(isimler);
	}
}