package com.ajwalker.week02.karar_yapilari;

public class SwitchCase {
	public static void main(String[] args) {
		/*
		switch (ifade){
			case sabitDeger:
				*buraya kodlar geliyor.
				break;
			case sabitDeger01:
			.
			.
			.
			default:
				*Buraya kodlar geliyor.
		}
	    */
		
		switch (10) {
			case 10:
				System.out.println(10);
				break;
			case 20:
				System.out.println(20);
				break;
			case 30:
				System.out.println(30);
				break;
			default:
				System.out.println("10-20-30 degildir!");
		}
	}
}