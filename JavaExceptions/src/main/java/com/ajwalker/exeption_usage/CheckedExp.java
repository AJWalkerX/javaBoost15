package com.ajwalker.exeption_usage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExp {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:/JavaFiles/Hello.txt");
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
		//burada exception CheckedExeption'dır. Eğer handle edilmezse Derleme hatası verir.
		
		System.out.println("Program çalışmaya devam ediyor.");
	}
}