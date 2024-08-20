package com.ajwalker;

import java.time.Duration;
import java.time.Instant;

public class InstantAndDuration {
	public static void main(String[] args) {
		long islemAdet = 5_000_000_000L;
		long toplam = 0;
		
		//1.Yöntem:
		long start = System.currentTimeMillis();
		for (long i = 0; i<islemAdet; i++){
			toplam+=i;
		}
		System.out.println(toplam);
		long end = System.currentTimeMillis();
		System.out.println((end-start)+ "ms.");
		
		//2.Yöntem
		toplam = 0;
		start = System.nanoTime();
		for (long i = 0; i<islemAdet; i++){
			toplam+=i;
		}
		System.out.println(toplam);
		end = System.nanoTime();
		System.out.println((end-start)+ "ms.");
		
		//3.Yöntem
		toplam = 0;
		Instant baslama = Instant.now();
		for (long i = 0; i<islemAdet; i++){
			toplam+=i;
		}
		System.out.println(toplam);
		Instant bitti = Instant.now();
		Duration between = Duration.between(baslama, bitti);
		System.out.println(between);
		System.out.println(between.toSeconds()+"s");
		System.out.println(between.toMillis()+"ms.");
		System.out.println(between.toNanos()+"ns");
	}
}