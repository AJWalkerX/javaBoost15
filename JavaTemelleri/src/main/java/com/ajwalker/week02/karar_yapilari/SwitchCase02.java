package com.ajwalker.week02.karar_yapilari;
public class SwitchCase02 {
	public static void main(String[] args) {
		int month = 1;
		
		String ay = switch (month){
			case 1->  "Ocak";
			case 2->  "Subat";
			default -> "Yanlis deger girdin!";
		};
		
		switch (month){
			case 1:
				ay = "Ocak";
				break;
				
			case 2:
				ay = "Subat";
				break;
			default :
				System.out.println("Yanlis deger girdin!");
		}
		System.out.println(ay);
		
		int day= 2;
		String typeOfDay = switch (day){
			case 1,2,3,4,5 -> "Hafta ici";
			case 6,7 -> "Hafta sonu";
			default -> "Haftada 7 gün var. 1-7 arasi deger giriniz!";
		};
		System.out.println(typeOfDay);
	}
}