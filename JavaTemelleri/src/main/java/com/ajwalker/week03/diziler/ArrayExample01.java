package com.ajwalker.week03.diziler;

import java.util.Random;

//Rastgele int degerlerden oluşan 10 elemanlı bir dizi oluşturup, ekrana degeri yazdıralım.
public class ArrayExample01 {
	public static void main(String[] args) {
		int randNumbers[] = new int[10];
		Random rand = new Random();
		
		for (int item: randNumbers){
			randNumbers[item] =rand.nextInt(0,101);
			System.out.println(randNumbers[item]);
		}
	}
}