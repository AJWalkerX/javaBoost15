package com.ajwalker.user_defined_exception2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MatIslemleri {
	static Scanner sc =new Scanner(System.in);
	static int userInput;
	
	
	public static void main(String[] args) {
		int sayi = 10;
		int sayi2 = 20;
		
		System.out.println("MATEMATİK İŞLEMLERİ");
		System.out.println("1-Çarpma");
		System.out.println("2-Bölme");
		System.out.println("3-Toplama");
		System.out.println("4-Çıkarma");
		System.out.println("0-Çıkış");
		System.out.print("selection: ");
		try {
			userInputControl();
		}
		catch (WrongChoiceException | InputMismatchException e){
			e.printStackTrace();
		}
		finally {
			sc.nextLine();
		}
		System.out.println("Program devamı...");
	}
	
	private static void userInputControl() throws WrongChoiceException{
		userInput = sc.nextInt();
		if (userInput < 0 ||userInput > 4){
			throw new WrongChoiceException("0-4 arasında bir değer giriniz!");
		}
	}
}