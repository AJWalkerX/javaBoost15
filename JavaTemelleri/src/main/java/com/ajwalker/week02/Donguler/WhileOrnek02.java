package com.ajwalker.week02.Donguler;

import java.util.Scanner;

public class WhileOrnek02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir kelime giriniz: ");
		String input = sc.nextLine();
//		int lengthOfString = input.length();
		int i = 0;
		/*while (lengthOfString > 0){
			System.out.println(input.charAt(i));
			i++;
			lengthOfString--;
		}*/
		while (true) {
			try {
				input.charAt(i);
				i++;
			}
			catch (Exception e) {
				break;
			}
		}
		System.out.println(input + "harf sayisi= " + i);
	}
}