package com.ajwalker.sorunlar.sorun1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Sorun1Cozum2 {
	private  static int sayac = 0;
	private static Lock lock = new ReentrantLock();
	
	public static void sayacArttir(){
		try {
			lock.lock();
			sayac++;
		}finally {
			lock.unlock();
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(() ->{
			for (int i = 0; i< 5000; i++){
				sayacArttir();
			}
			System.out.println("thread1: "+ sayac);
		});
		Thread thread2 = new Thread(() ->{
			for (int i = 0; i< 5000; i++){
				sayacArttir();
				
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