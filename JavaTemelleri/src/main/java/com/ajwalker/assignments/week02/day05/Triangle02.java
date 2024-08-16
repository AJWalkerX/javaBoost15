package com.ajwalker.assignments.week02.day05;

import java.util.Scanner;

/*
Kullanıcıdan alınan değer boyutunda üçgen yaptırma

Üçgenboyutu:3
*****
 ***
  *

*/
public class Triangle02 {
	public static void main(String[] args) {
		int sizeOfTriangle;
		String space = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Ucgenin boyutunu giriniz: ");
		sizeOfTriangle = sc.nextInt();
		for (int i= 0; i <sizeOfTriangle; i++){
			System.out.print(space);
			space += " ";
			for (int j = sizeOfTriangle*2-1; j>i*2; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}