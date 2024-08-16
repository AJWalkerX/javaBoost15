package com.ajwalker.week02.strings;

import java.util.Scanner;

public class StringEquals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "alex";
		System.out.println("kullanici adinizi giriniz: ");
		String input = sc.nextLine();
		if (name.equals(input)){// equalsIgnoreCase'de olur
			System.out.println("Hosgeldiniz!");
		}else{
			System.out.println("Kullanici adi hatali!");
		}
	}
}