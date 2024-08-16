package com.ajwalker.week06.list_interface.linked_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		//Eleman ekleme
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10_000_000; i++){
			arrayList.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start + " for arrayList");
		
		start = System.currentTimeMillis();
		for (int i = 0; i < 10_000_000; i++){
			linkedList.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println(end-start + " for arrayList");
		
		
		//Eleman listeleme
		start = System.nanoTime();
		System.out.println(arrayList.get(5_000_000));
		end = System.nanoTime();
		System.out.println(end-start + " for arrayList");
		
		start = System.nanoTime();
		System.out.println(linkedList.get(5_000_000));
		end = System.nanoTime();
		System.out.println(end-start + " for linkedList");
		System.out.println("----- Araya eleman ekleme -----");
		//Araya eleman ekleme
		start = System.nanoTime();
		for (int i = 0; i < 1_000; i++){
			arrayList.add(5_000_000,i);
		}
		end = System.nanoTime();
		System.out.println(end-start + " for arrayList");
		
		start = System.nanoTime();
		for (int i = 0; i < 1_000; i++){
			linkedList.add(5_000_000,i);
		}
		end = System.nanoTime();
		System.out.println(end-start + " for linkedList");
	}
}