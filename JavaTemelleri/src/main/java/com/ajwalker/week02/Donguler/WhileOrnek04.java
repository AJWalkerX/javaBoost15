package com.ajwalker.week02.Donguler;
/*1'den 100'e kadar olan sayilarin toplami*/
public class WhileOrnek04 {
	public static void main(String[] args) {
		int num = 1, sum = 0;
		while (num <=100){
			sum += num;
			num++;
		}
		System.out.println(sum);
		sum = 0;
		sum = (100*101)/2;
		System.out.println(sum);
	}
}