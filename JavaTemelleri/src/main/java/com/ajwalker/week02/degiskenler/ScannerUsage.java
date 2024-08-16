package com.ajwalker.week02.degiskenler;

import java.util.Scanner;

public class ScannerUsage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sayi1,sayi2,sonuc;
		System.out.println("1. sayıyı giriniz:");
		sayi1=sc.nextInt();
		
		System.out.println("2. sayıyı giriniz:");
		sayi2=sc.nextInt();
		
		sonuc=sayi1+sayi2;
		System.out.println("Sonuç: "   +   sonuc);
		
		Scanner sc2=new Scanner(System.in); //sc referance olarak kullanılacak.
		
		/*System.out.println("Bir girdi yazınız:");
		String girdi=sc.next();
		System.out.println("Terminalden alınan değer:"+girdi);*/
		
		/*System.out.println("İkinci bir girdi yazınız:");
		String girdi2=sc.nextLine();
		System.out.println("Terminalden alınan değer:"+girdi2);*/
	}
}