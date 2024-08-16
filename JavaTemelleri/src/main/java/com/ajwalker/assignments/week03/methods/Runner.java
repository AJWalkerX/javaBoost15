package com.ajwalker.assignments.week03.methods;

import java.util.Arrays;

public class Runner {
	public static void main(String[] args) {
		MethodsQuests methods = new MethodsQuests();
		int[] arr = {10,15,20,25,5,1};
		//Soru 1
		double average = methods.findAverageOfArr(arr);
		System.out.println("ortalama: " + average);
		
		//Soru 2
		if (methods.tekMi(5)){
			System.out.println("tek");
		}
		else{
			System.out.println("cift");
		}
		
		//Soru 3
		int[] sortedArr = methods.sortArr(arr);
		System.out.println(Arrays.toString(sortedArr));
		System.out.println(Arrays.toString(arr));
		
		//Soru 4
		System.out.println(methods.power(2,5));
		
		//Soru 5
		String metin = "Merhaba, benim adim Alex";
		System.out.println(methods.reverseWord(methods.findWords(metin)));
		
		//Soru 6
		System.out.println(methods.asalMi(13));
		
		//soru7
		System.out.println(Arrays.toString(methods.MaxNumberOfArr(arr, 2)));
		
		//Soru8 -> kucuk
		System.out.println(methods.countSmallLetter(metin));
		//Soru8.1 -> buyuk
		System.out.println(methods.countCapitalLetter(metin));
		//Soru 8.2: rakam harfleri sayan method.
		System.out.println(methods.countNumericLetter("123"));
		//Soru 8.3: rakam haric harfleri sayan method.
		System.out.println(methods.countOnlyLetter("1233abc"));
		//Soru 9: dizilerin değerlerini çarpıp yeni dizi yapan method
		System.out.println(Arrays.toString(methods.multiplyArr(arr, 2)));
		//Soru 10: MEtin dizisini String'e cevirme
		String[] textArr = {"Alex", "Alexander", "Jo.", "Joseph", "Walker"};
		System.out.println(methods.mergeArr(textArr, ", "));
	}
}