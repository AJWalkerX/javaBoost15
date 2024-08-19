package com.ajwalker.sorunlar.thread_list;

import java.util.ArrayList;
import java.util.Random;

public class Threadli {
	ArrayList<Integer> list1 = new ArrayList<>();
	ArrayList<Integer> list2 = new ArrayList<>();
	
	Random random = new Random();
	
	public static void main(String[] args) {
		Threadli threadli = new Threadli();
		long start = System.nanoTime();
		threadli.threadIleDegerEkle();
		long end = System.nanoTime();
		System.out.println("Geçen süre: "+ (end-start));
	}
	
	public void threadIleDegerEkle(){
		Thread t1 = new Thread(()->{
			listelerDegerEkle();
		});
		Thread t2 = new Thread(()->{
			listelerDegerEkle();
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("list1 size: "+list1.size());
		System.out.println("list2 size: "+list2.size());
	}
	
	public void listelerDegerEkle(){
		for (int i = 0; i<1000; i++){
			list1DegerEkle();
			list2DegerEkle();
		}
		
	}
	
	private synchronized void list1DegerEkle() {
		list1.add(random.nextInt(0,101));
	}
	
	private synchronized void list2DegerEkle() {
		list2.add(random.nextInt(0,101));
	}
}