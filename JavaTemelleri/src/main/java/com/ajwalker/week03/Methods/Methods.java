package com.ajwalker.week03.Methods;

import java.util.Arrays;

//method,function, procedure, subprogram, subroutine
//metodlarla genellikle dışarıdan prametreler aracılığıyla değerleri alıp, işlem yapıp, genellikle değer döndürürler
public class Methods {
	public static void main(String[] args) {
		//Topla methodu
		int toplam = topla(3,5);
		System.out.println(topla(3,5));
		//Max deger alma methodu
		System.out.println(max(1,3));
		toplam(3,5);
//		Notlar
		System.out.println(Arrays.toString(notlar()));
		//ortalama hesapla
		int[] sayilar = {6,5,8,7,10,0,1};
		System.out.println(ortalamaHesapla(sayilar));
		//Tek mi
		System.out.println(isEven(5));
		//Kucukten buyuge sirala
		System.out.println(sortArr(sayilar));
		//Us alama islemi
		System.out.println(powerOfNum(2,5));
	}
	public static int topla(int num1, int num2){
		return num1+num2;
	}
	public static int max(int a, int b){ //paramentrelerin scope'u yazıldığı metoddur.
		return (a>b)?a:b;
	}
	public static void toplam(int a, int b){
		System.out.println("void icerisinden merhaba");
		System.out.println(topla(a,b));
	}
	
	public static int[] notlar(){
		int[] notDizisi={5,6,1,3};
		return notDizisi;
	}
	private static double ortalamaHesapla(int[] sayilar){
		int sum = 0;
		for (int number :sayilar){
			sum += number;
		}
		double average = sum/ sayilar.length;
		return average;
	}
	private  static boolean isEven(int number){
		return number % 2 ==1;
	}
	private  static String sortArr (int[] numbers){
		Arrays.sort(numbers);
		return Arrays.toString(numbers);
	}
	private static double powerOfNum(int base, int pow){
		return Math.pow(base,pow);
	}
}