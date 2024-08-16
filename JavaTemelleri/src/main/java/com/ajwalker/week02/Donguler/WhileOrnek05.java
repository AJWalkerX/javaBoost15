package com.ajwalker.week02.Donguler;

import java.util.Scanner;

/*
Kullanıcıdan alınan sayının faktöryelini bulan programı while kullanarak yazınız.
5! = 5*4*3*2*1 = 120

 */
public class WhileOrnek05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Faktoryeli alınacak sayıyı giriniz: ");
		int sayi = sc.nextInt();
		long factorial = 1;
		System.out.print(sayi+"! = ");
		while (sayi > 0) {
			if (sayi == 1) {
				System.out.print(sayi);
			}
			else {
				System.out.print(sayi + "*");
			}
			factorial *= sayi;
			sayi--;
			
		}
		System.out.println("=" + factorial);
		}
	}