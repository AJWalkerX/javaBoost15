package com.ajwalker.assignments.week02.weekend;
//Soru 15. Rastgele bir sayı üretin ve bu sayının 1 ile 10 arasında olup olmadığını kontrol edin.

import java.util.Random;

public class Quest15 {
	public static void main(String[] args) {
		Random random = new Random();
		int randValue = random.nextInt(-10,20);
		if (randValue > 0 && randValue <= 10){
			System.out.println(randValue);
		}
		else {
			System.out.println("1-10 arasinda degil");
		}
	}
}