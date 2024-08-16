package com.ajwalker.week06.list_interface.linked_list;

import java.util.LinkedList;

public class LinkedList_Usage {
	public static void main(String[] args) {
		LinkedList<String> bagliList = new LinkedList<>();
		bagliList.add("Deniz");
		bagliList.add("Muzaffer");
		bagliList.add("Mehmet");
		bagliList.add("Harun");
		
		String firstElement = bagliList.element();
		System.out.println(firstElement);
		
		//Sona eleman ekleme
		bagliList.offer("Evrim");
		System.out.println(bagliList);
		bagliList.offerFirst("Emirhan");
		System.out.println(bagliList);
		
		System.out.println(bagliList.peek());
		
		System.out.println(bagliList.peekLast());
		
		System.out.println(bagliList.poll());
		System.out.println(bagliList);
		
		String popedElement = bagliList.pop();
		System.out.println(popedElement);
		System.out.println(bagliList);
		
		bagliList.push(popedElement);
		System.out.println(bagliList);
	}
}