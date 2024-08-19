package com.ajwalker.sorunlar.thread_list;

import java.util.ArrayList;
import java.util.Random;

public class ThreadsizListe {
	ArrayList<Integer> list1 = new ArrayList<>();
	ArrayList<Integer> list2 = new ArrayList<>();
	
	Random random = new Random();
	
	public static void main(String[] args) {
		ThreadsizListe threadsizListe = new ThreadsizListe();
		long start = System.nanoTime();
		threadsizListe.listelerDegerEkle();
		long end = System.nanoTime();
		System.out.println("Geçen süre: "+ (end-start));
	}
	public void listelerDegerEkle(){
		for (int i = 0; i<1000; i++){
			list1DegerEkle();
			list2DegerEkle();
		}
		System.out.println("list1 size: "+list1.size());
		System.out.println("list2 size: "+list2.size());
	}
	
	private void list1DegerEkle() {
		list1.add(random.nextInt(0,101));
	}
	
	private void list2DegerEkle() {
		list2.add(random.nextInt(0,101));
	}
}