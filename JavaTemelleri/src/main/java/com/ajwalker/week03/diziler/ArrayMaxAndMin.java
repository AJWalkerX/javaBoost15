package com.ajwalker.week03.diziler;
/*
	Kullanıcıdan dizinin boyutunu belirlemesini sağla.
	Dizinin değerlerini kullanıcıdan iste.
	Hangi indexin en buyuk olduğunu bul.
	kaçıncı index olduğunu da yazsın.
	
	Aynısının min degerini de bulsun.
*/
import java.util.Scanner;

public class ArrayMaxAndMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dizi kac elemanli olsun?");
		int numbers[] = new int[sc.nextInt()];
		int item =0;
		do {
			System.out.print(item+ ". index degerini giriniz: ");
			numbers[item] = sc.nextInt();
			item++;
		}while (item < numbers.length);
		
		int max = numbers[0], min = numbers[0];
		for (int i = 0; i < numbers.length; i++){
			if (max < numbers[i]){
				max = numbers[i];
			}
			if (min > numbers[i]){
				min = numbers[i];
			}
		}
		System.out.println("Max indis: "+ max + " Min indis: "+ min);
	}
}