package com.ajwalker.thread_baslangic;

public class Main {
	public static void main(String[] args){
		
		MyThread myThread1=new MyThread("myThread1");
		MyThread myThread2=new MyThread("myThread2");
		myThread1.start();
		myThread2.start();
		
		String  activeThread= Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(i+": thread="+activeThread);
			//Thread.sleep(1000);
		}
		
		
	}
	
}