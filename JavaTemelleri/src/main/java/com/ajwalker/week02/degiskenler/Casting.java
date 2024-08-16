package com.ajwalker.week02.degiskenler;

public class Casting {
	public static void main(String[] args) {
		byte b;
		int i=257;
		double d=323.142;
		
		System.out.println("int>>byte dönüşümü:");
		b=(byte)i;
		System.out.println("i="+i+" b = "+b);
		
		System.out.println("double >> int dönüşümü:");
		i=(int)d;
		System.out.println("d="+d+" i = "+i);
		
		System.out.println("double>>byte dönüşümü:");
		b=(byte)d;
		System.out.println("d="+d+" b = "+b);
		
		int x=20;
		long l=x; //int 32bit, long 64bit.
		System.out.println(l);
		
		byte k=10;
		short s=k; //byte 8bit, short 16bit.
		int intSayi=k;
		System.out.println(s);
		
		float f=10.25f;
		double dou=f; //float 32bit, double 64bit
		System.out.println(dou);
		
		long longDeger=Long.MAX_VALUE;
		System.out.println(longDeger);
		float floatDeger=longDeger;
		System.out.println(floatDeger);
		
		long longDeger2=10L+Integer.MAX_VALUE;
		System.out.println(longDeger2);
		
		double d1=Double.MAX_VALUE;
		System.out.println(d1);
		float f1= (float)d1; // Double 64bit. Float 32bit. Otomatik dönüşüm olamaz.
		System.out.println(f1);
		
		int i1=10;
		double d2=5.5;
		System.out.println(i1+d2);
		
		int sayi;
		double y=9.99;
		sayi=(int)y;
		System.out.println(sayi);
		
		int a=2_000_000_000;
		char ch= (char) a;
		System.out.println(ch);
	}
}