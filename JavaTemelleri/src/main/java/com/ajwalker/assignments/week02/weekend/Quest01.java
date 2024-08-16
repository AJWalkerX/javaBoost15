package com.ajwalker.assignments.week02.weekend;

import java.util.Scanner;

//Soru 1. Kullanıcıdan bir üçgenin üç kenar uzunluğunu girmesini isteyin ve bu üçgenin eşkenar, ikizkenar veya
// çeşitkenar olduğunu belirleyin. (if-else if-else)
public class Quest01 {
	public static void main(String[] args) {
		double sideLengthA, sideLengthB, sideLengthC;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ucgenin kenar uzunluğunu giriniz (a): ");
		sideLengthA = sc.nextInt();
		System.out.print("Ucgenin kenar uzunluğunu giriniz (b): ");
		sideLengthB = sc.nextInt();
		System.out.print("Ucgenin kenar uzunluğunu giriniz (c): ");
		sideLengthC = sc.nextInt();
		if (sideLengthA == sideLengthB && sideLengthA == sideLengthC) {
			System.out.print("eskenar ucgen!");
		}
		else if (sideLengthA == sideLengthB || sideLengthA == sideLengthC || sideLengthC == sideLengthB) {
			System.out.print("ikizkenar ucgen!");
		}
		else if (sideLengthA != sideLengthB && sideLengthA != sideLengthC && sideLengthC != sideLengthB) {
			System.out.print("cesitkenar ucgen!");
		}
		else {
			System.out.print("Birseyler yanlıs gitti!");
		}
		
	}
}