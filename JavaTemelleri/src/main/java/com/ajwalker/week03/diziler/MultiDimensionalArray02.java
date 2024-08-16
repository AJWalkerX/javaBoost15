package com.ajwalker.week03.diziler;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class MultiDimensionalArray02 {
	public static void main(String[] args) {
		int [][] nums = {
				{1,2,3},
				{10,20,33},
				{123,4,57,9}
		};
		//Her satırın ortalamasını bul
		System.out.println();
		OptionalDouble ortalma;
		for (int satir[]: nums){
			ortalma = Arrays.stream(satir).average();
			System.out.println("orlama: " + ortalma.getAsDouble());
		}
		System.out.println();
		
		//İkinci çözüm:
		int sum;
		for (int i = 0; i < nums.length; i++){
			sum = 0;
			for (int j = 0; j < nums[i].length; j++){
				sum += nums[i][j];
			}
			double average = sum/(nums[i].length);
			System.out.println("toplam: "+ sum + " ortalma: "+ average);
		}
	}
}