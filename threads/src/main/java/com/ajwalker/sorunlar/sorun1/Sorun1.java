package com.ajwalker.sorunlar.sorun1;

public class Sorun1 {
	private  static int sayac = 0;
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(() ->{
			for (int i = 0; i< 5000; i++){
				sayac++;
			}
			System.out.println("thread1: "+ sayac);
		});
		Thread thread2 = new Thread(() ->{
			for (int i = 0; i< 5000; i++){
				sayac++;
			}
			System.out.println("thread2: "+ sayac);
		});
		thread.start();
		thread2.start();
		thread2.join();
		thread.join();
	}
}