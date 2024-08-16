package com.ajwalker.exeption_usage;

import java.io.FileNotFoundException;

/*
Error
1- CompileTime : IDE'nin program çalışmaya başlamadan tespit ettiği hatalar. (Syntax hataları)
2- RunTime : Program çalışırken oluşan hatalar
	a-Exeption (handle edilebilir hatalar)
		-Checked
		-UnChecked
	b-Error (handle edilemeyen hatalar) ör. StackOverFlow
3- Logical -> en zor tespit edilen hatalar.
*/
public class Main {
	public static void main(String[] args) {
//		try {
//			bolmeIslemi();
//		}
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		//Örnek 2:
		Personel p1 = new Personel("Sami", "Sarı");
		System.out.println(p1.getName());
		
		Personel p2 = null;
		try {
			System.out.println(p2.getName());
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("Program devam ediyor");
		
		//Örnek 3
		int[] sayiDizisi = {3,5};
		System.out.println(sayiDizisi[1]);
		try {
			System.out.println(sayiDizisi[5]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("Program devam ediyor 2");
		
	}
	
	public static void bolmeIslemi() throws FileNotFoundException {
		//ArithmeticException try catch ile sarmalamaya
		// zorlamıyorken FileNotFoundException try catch içerisine sarmalamaya zorluyor
		int payda = 0;
		int pay = 20;
		//Bu hata unchecked bir hatadır. Çünkü yazarken ide hiç bir uyarıda bulunmadı.
		int sonuc = pay / payda; //-> ArithmeticException: / by zero
	}
}