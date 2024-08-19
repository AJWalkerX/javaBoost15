package com.ajwalker.thread_baslangic;

public class Main3 {
	public static void main(String[] args)  {
		
		MyThread3  myThread3 = new MyThread3("myThread3");
//		myThread3.start(); -> Thread sınıfından extends edilmediği için strat methodu yok.
		Thread thread = new Thread(new MyThread3("tread0"));
		Thread thread2 = new Thread(new MyThread("tread1"));
		thread.start();
		thread2.start();
		
		System.out.println("Main thread bittig");
	}
	
}