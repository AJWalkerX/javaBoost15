package com.ajwalker.week03.diziler;
//Kullanıcıdan alınan degerleri 5 index boyutlu bir int dizisine kaydedip dizinin sırasını terse çevirip ekrana yazdır
import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {
	public static void main(String[] args) {
		int nums[] = new int[5];
		int item = 0, userInput;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print(item+". degeri giriniz: ");
			nums[item] = sc.nextInt();
			item++;
		}while( item< nums.length);
		
		System.out.println(Arrays.toString(nums));
		
		int temp;
		for (int i = 0; i < nums.length/2; i++){
			temp = nums[i];
			nums[i] = nums[nums.length-1-i];
			nums[nums.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(nums));
	}
}