package com.ajwalker.week02.Donguler.break_continue;

public class LabeledBreak {
	public static void main(String[] args) {
		
		//ilk durum:
		System.out.println("Ilk Durum:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if(i==3 && j==2){
					break; //sadece iç döngüyü kırdı.
				}
				System.out.println("i: "+i+",j: "+j);
			}
			
		}
		System.out.println("Donguler sonlandı.");
		
		//Etiketli durum:
		System.out.println("Etiketli Durum:");
		etiket:
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if(i==3 && j==2){
					break etiket; //dış döngüyü de kırdı.
				}
				System.out.println("i: "+i+",j: "+j);
			}
			
		}
		System.out.println("Donguler sonlandı.");
	}
}