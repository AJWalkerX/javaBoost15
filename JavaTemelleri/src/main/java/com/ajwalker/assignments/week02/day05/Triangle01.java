package com.ajwalker.assignments.week02.day05;

import java.util.Scanner;

/*
Kullanıcıdan alınan değer boyutunda üçgen yaptırma

Üçgenboyutu:3
  *
 ***
*****

Birinci deneme :
*/
public class Triangle01 {
	public static void main(String[] args) {
		int sizeOfTriangle;
		String star = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Ucgenin boyutunu giriniz: ");
		sizeOfTriangle = sc.nextInt();
		for (int i= 0; i <sizeOfTriangle; i++){
			for (int j = sizeOfTriangle-1; j>i; j--){
				System.out.print(" ");
			}
			star += "*";
			System.out.println(star);
			star += "*";
		}
	}
}