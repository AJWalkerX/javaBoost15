package com.ajwalker.exeption_usage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionMessageTypes {
	public static void main(String[] args) {
		try {
			dosyaOku();
		}
		catch (FileNotFoundException e) {
			System.out.println("e.getMessage()..............: "+e.getMessage());
			System.out.println("e.getLocalizedMessage()..............: "+e.getLocalizedMessage());
			System.out.println("e.toString()..............: "+e.toString());
			System.out.println("e..............: "+e);
		}
		System.out.println("Program devam ediyor");
	}
	
	private static void dosyaOku() throws FileNotFoundException {
		FileInputStream fis = null;
		fis = new FileInputStream("C:/javaFiles/Hello.txt");
	}
}