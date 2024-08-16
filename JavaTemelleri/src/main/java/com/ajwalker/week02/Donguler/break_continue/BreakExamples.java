package com.ajwalker.week02.Donguler.break_continue;

public class BreakExamples {
	public static void main(String[] args) {
		//	While example
		
		int i = 0;
		while (i < 10) {
			
			if (i == 3) {
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("Döngü sonlandı.");
		
//		for example
		for (int j = 0; j < 10; j++) {
			if(j==3){
				break;
			}
			System.out.println(j);
		}
		System.out.println("for döngüsü sonlandı.");
	}
}