package com.ajwalker.exeption_usage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
Exeption;
 - Sizin tanımladığınız exeptionlar (User-defined Exeption)
 - Hazır gelen exeptionlar (Built-in Exeptions)
 - Checked (ClassNotFoundException, InterruptedException, IOException, FileNotFoundException)
        Derleme zamanında mutlaka kontrol sağlamasını zorunlu kılar.
        Bu kontrol için 2 yol vardır.
        1. YOL: Try-Catch
        2.YOL: İçinde bulunduğumuz motodun imzasına throws ile exception adını yazarak.
 - Unchecked (ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException).
        : RuntimeException'dan türetilen sınıflar.
    
*/
public class TryCatchUsage {
	public static void main(String[] args) {
		try {
			dosyaOku();
			beklet();
		}
		catch (FileNotFoundException | InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Program devam ediyor");
	}
	private static void beklet() throws InterruptedException{
		Thread.sleep(2000);
	}
	
	private static void dosyaOku() throws FileNotFoundException {
		FileInputStream fis = null;
		fis = new FileInputStream("C:/javaFiles/Hello.txt");
	}
}