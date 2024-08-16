package com.ajwalker.week02.randomClass;

import java.util.Random;

public class RandomC {
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println(rand.nextInt(10)+1); // 10 değerini de vermesi için +1 çünkü başlangı. degeri 0
		
		System.out.println(rand.nextDouble(3)); // 0, 1, 2 degerlerinden biri
		System.out.println(rand.nextDouble(3, 4));
	}
}