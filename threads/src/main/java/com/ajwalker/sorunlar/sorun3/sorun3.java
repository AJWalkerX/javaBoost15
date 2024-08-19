package com.ajwalker.sorunlar.sorun3;

public class sorun3 {
	//Volatile: bir değişkenin değeri direkt olarak bellekten alınması istendiğinde kullanılır.
	public static volatile boolean flag = false;
	
	public static void main(String[] args) {
		Thread thread = new Thread(()->{
			System.out.println("Thread 1 çalıştı.");
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			flag = true;
			System.out.println("flag true oldu.");
		});
		
		Thread thread2 = new Thread(()->{
			System.out.println("Thread 2 çalıştı.");
			while (!flag){
				System.out.println("thread 2 çalışıyor.");
				System.out.println(flag);
			}
			System.out.println("thread iki bittigh: "+ flag);
		});
		thread.start();
		thread2.start();
	}
}