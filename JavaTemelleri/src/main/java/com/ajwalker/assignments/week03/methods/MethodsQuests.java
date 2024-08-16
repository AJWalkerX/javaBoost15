package com.ajwalker.assignments.week03.methods;

import java.util.Arrays;

public class MethodsQuests {
	//Soru1: Bir tam sayı dizisini parametre olarak alan ve dizideki sayıların ortalamasını hesaplayarak geri döndüren
	// bir ortalamaHesapla metodunu yazınız.
	
	double findAverageOfArr(int[] numArr) {
		int sum = 0;
		double average = 0;
		for (int item : numArr) {
			sum += item;
		}
		average = (double) sum / numArr.length;
		return average;
	}
	
	//Soru2:Bir tamsayı parametre alan ve sayının tek olup olmadığını kontrol eden
	// tekMi metodunu yazınız.
	
	boolean tekMi(int num){
		return num % 2 == 1;
	}
	//Soru3: Bir tam sayı dizisi parametre alan ve diziyi küçükten büyüğe doğru sıralayarak geri döndürenbir metod yazınız.
	int[] sortArr(int[] numArr){
		Arrays.sort(numArr); // Orjinal diziyi de küçükten büyüye sıralar.
		return Arrays.stream(numArr).sorted().toArray();
	}
	
	//Soru 4: İki tam sayı al taban ve üs işlemi yaparak sonucu dön
	int power(int base, int pow){
		int result = 1;
		for (int i = 0; i<pow; i++){
			result *=base;
		}
		return result;
	}
	
	// Soru 5. Bir metin parametre alan ve metindeki her kelimeyi tersine çevirerek geri döndüren bir metod yazınız.
	String[] findWords(String word){
		return word.split(" ");
	}
	String reverseWord (String[] words){
		StringBuilder sb = new StringBuilder();
		for (String item: words){
			sb.append((new StringBuilder(item).reverse().append(" ")));
		}
		return sb.toString().trim();
	}
	//Soru 6 asal sayi mi
	
	boolean asalMi(int num){
		if (num <= 1){
			return false;
		}
		else if (num == 2 ) {
			return true;
		}
		else{
			for (int i = 3; i <= Math.sqrt(num); i+=2){
				if (num % i == 0){
					return false;
				}
			}
			return true;
		}
	}
	
	//Soru 7 : Tam sayı dizisinden en büyük iki sayiyi dönen method
	int[] MaxNumberOfArr (int[] numsArr, int n){
		int[] maxNums = new int[n];
		int[] sortedArr = Arrays.stream(numsArr).sorted().toArray();
		for (int i = 0; i < n; i++){
			maxNums[i] = numsArr[numsArr.length-1-i];
		}
		return maxNums;
	}
	
	//Soru 8 : kucuk harfleri sayan method.
	int countSmallLetter(String word){
		int counter = 0;
		for (int i = 0; i < word.length(); i++){
			if (Character.isLowerCase(word.charAt(i))){
				counter++;
			}
		}
		return counter;
	}
	//Soru 8.1: buyuk harfleri sayan method.
	int countCapitalLetter(String word){
		int counter = 0;
		for (int i = 0; i < word.length(); i++){
			if (Character.isUpperCase(word.charAt(i))){
				counter++;
			}
		}
		return counter;
	}
	//Soru 8.2: rakam harfleri sayan method.
	int countNumericLetter(String word){
		int counter = 0;
		for (int i = 0; i < word.length(); i++){
			if (Character.isDigit(word.charAt(i))){
				counter++;
			}
		}
		return counter;
	}
	//Soru 8.3: rakam haric harfleri sayan method.
	int countOnlyLetter(String word){
		int counter = 0;
		for (int i = 0; i < word.length(); i++){
			if (Character.isLetter(word.charAt(i))){
				counter++;
			}
		}
		return counter;
	}
	// Soru 9: Bir tam sayı dizisi ve bir tamsayı parametre alan ve dizideki her sayıyı, girilen 2. parametredeki
	//değer ile çarparak yeni bir dizi oluşturan ve geri döndüren bir metod yazınız
	int[] multiplyArr(int[] numbersArr, int multiplier){
		int[] multipliedArr = new int[numbersArr.length];
		int i = 0;
		for (int number: numbersArr){
			multipliedArr[i] = number*multiplier;
			i++;
		}
		return multipliedArr;
	}
	//Soru 10: Bir metin dizisi ve bir ayırıcı parametre alan ve dizideki tüm kelimeleri ayırıcı ile birleştirerek geri
	//döndüren bir metod.
	String mergeArr(String[] textArr, String separator){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < textArr.length; i++){
			sb = sb.append(new StringBuilder().append(textArr[i]).append(separator));
		}
		return sb.toString().trim();
	}
}