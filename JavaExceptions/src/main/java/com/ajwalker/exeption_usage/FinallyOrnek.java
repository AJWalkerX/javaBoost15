package com.ajwalker.exeption_usage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyOrnek {
	public static void main(String[] args) {
		FileInputStream fileData = null;
		try {
			fileData = new FileInputStream("C:/javaFiles/Hello.txt");
			int readedData;
			System.out.println("Dosya İçeriği: ");
			while ((readedData = fileData.read()) != -1){
				System.out.print((char) readedData);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fileData.close();
			}
			catch (IOException |NullPointerException e) {
				e.printStackTrace();
			}
			System.out.println();
		}
		System.out.println("Devam ediyor");
	}
}