package com.ajwalker.assignments.week02.weekend;

import java.util.Scanner;

//Soru 2. Kullanıcıdan bir sayı girmesini isteyin ve bu sayının 1-12 arasında bir değer olduğunu varsayarak, ayın
// ismini ekrana yazdırın. (Switch-Case)
public class Quest02 {
	public static void main(String[] args) {
		int month = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ayin numarik degerini giriniz: ");
		month = sc.nextInt();
		
		if (month >= 1 == month <= 12) {
			switch (month) {
				case 1:
					System.out.println("Ocak");
					break;
				case 2:
					System.out.println("Subat");
					break;
				case 3:
					System.out.println("Mart");
					break;
				case 4:
					System.out.println("Nisan");
					break;
				case 5:
					System.out.println("Mayis");
					break;
				case 6:
					System.out.println("Haziran");
					break;
				case 7:
					System.out.println("Temmuz");
					break;
				case 8:
					System.out.println("Agustos");
					break;
				case 9:
					System.out.println("Eylul");
					break;
				case 10:
					System.out.println("Ekim");
					break;
				case 11:
					System.out.println("Kasim");
					break;
				case 12:
					System.out.println("Aralik");
					break;
				default:
					System.out.println("1-12 arasinda bir deger girmelisiniz!");
			}
			
		}
	}
}