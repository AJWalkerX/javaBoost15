package com.ajwalker.week03.Methods;
//Method overloading: Aynı isimde farklı parametre tipinde veya farklı parametre sayılarında metodlar yazmak.
public class MethodOverloading {
	
	public static void main(String[] args) {
		int sum1 = sum(5, 10);
		int sum2 = sum(5, 10, 15);
		double sum3 = sum(3.25, 7.50, 2.75);
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
		System.out.println("sum3: " + sum3);
	}
	//dışarıdan 2 int sayı parametre olarak alan ve toplamlarını int olarak dönen bir sum metodu yazın.
	public static int sum(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	//dışarıdan 3 int sayı parametre olarak alan ve toplamlarını int olarak dönen bir sum metodu yazın.
	public static int sum(int sayi1, int sayi2,int sayi3) {
		return sayi1 + sayi2+sayi3;
	}
	//dışarıdan 3 double sayı parametre olarak alan ve toplamlarını double olarak dönen bir sum metodu yazın.
	public static double sum(double sayi1, double sayi2,double sayi3) {
		return sayi1 + sayi2+sayi3;
	}
}