package com.ajwalker.week02.Donguler.break_continue;

public class ContinueExamples {
	public static void main(String[] args) {
//		for example
		for (int j = 0; j < 5; j++) {
			if (j == 3) {
				continue; // bir sonraki iterasyon ile devam et.
			}
			System.out.println(j);
		}
		
		System.out.println("Dongu sonlandı.");
		// While example
		int i = 0;
		while (i < 10) {
			i++;
			if (i == 3) {
				continue; // continue komutu ile iterasyon döngünün en başından devam eder. alt satırlar işlenmez.
			}
			System.out.println(i);
			
		}
		System.out.println("Dongu sonlandı.");
	}
}