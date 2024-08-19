package com.ajwalker.sorunlar.sorun1;

import java.util.concurrent.atomic.AtomicInteger;

public class Sorun1Cozum3 {
	private  static AtomicInteger sayac = new AtomicInteger(0);
	
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(() ->{
			for (int i = 0; i< 5000; i++){
				sayac.getAndIncrement();
			}
			System.out.println("thread1: "+ sayac);
		});
		Thread thread2 = new Thread(() ->{
			for (int i = 0; i< 5000; i++){
				sayac.getAndIncrement();
				
			}
			System.out.println("thread2: "+ sayac);
		});
		thread.start();
		thread2.start();
		thread2.join();
		thread.join();
		System.out.println("main: "+ sayac);
	}
}