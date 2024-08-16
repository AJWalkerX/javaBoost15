package com.ajwalker.assignments.week02.weekend;
//Soru 14. 1 ile 50 arasında rastgele bir sayı üretin ve bu sayının çift mi tek mi olduğunu belirleyin.

import java.util.Random;

public class Quest14 {
	public static void main(String[] args) {
		Random random = new Random();
		int randValue = random.nextInt(1,51);
		if (randValue % 2 == 0){
			System.out.println("Cift sayi "+ randValue);
		}
		else{
			System.out.println("Tek sayi "+ randValue);
		}
	}
}