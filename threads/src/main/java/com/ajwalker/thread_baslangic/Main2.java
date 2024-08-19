package com.ajwalker.thread_baslangic;

public class Main2 {
	public static void main(String[] args) throws InterruptedException {
		
		MyThread myThread1=new MyThread("myThread1");
		MyThread myThread2=new MyThread("myThread2");
		myThread1.start();
		myThread2.start();
		myThread1.join();
		myThread2.join();
		String  activeThread= Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(i+": thread="+activeThread);
			Thread.sleep(1000);
		}
		
		System.out.println("MAIN BİTTİİG");
	}
	
}