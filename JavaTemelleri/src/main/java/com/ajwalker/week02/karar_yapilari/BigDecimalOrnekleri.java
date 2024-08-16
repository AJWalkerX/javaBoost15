package com.ajwalker.week02.karar_yapilari;

import java.math.BigDecimal;

public class BigDecimalOrnekleri {
	
	public static void main(String[] args) {
		float sonucFloat = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
		System.out.println(sonucFloat);
		
		double sonucDouble = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
		System.out.println(sonucDouble);
		sonucDouble = 0.1 *0.1;
		System.out.println(sonucDouble);
		
		BigDecimal sayi = new BigDecimal("0.1");
		
		BigDecimal sonucBigDec = sayi.add(sayi).add(sayi).add(sayi).add(sayi);
		System.out.println(sonucBigDec);
		
		sonucBigDec = sayi.multiply(sayi);
		System.out.println(sonucBigDec);
	}
}