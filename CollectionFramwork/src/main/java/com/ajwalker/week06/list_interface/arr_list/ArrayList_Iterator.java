package com.ajwalker.week06.list_interface.arr_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Iterator {
	public static void main(String[] args) {
		//ArrayList oluşturma
		ArrayList<String> musteriler = new ArrayList<>();
		
		//ArrayList eleman ekleme
		musteriler.add("Ali");
		musteriler.add("Veli");
		musteriler.add("Su");
		
		//Iterator ile gezinme:
		System.out.println("Iterator ile gezinme:");
		Iterator<String> iterator = musteriler.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		//for ile gezinm
		System.out.println("for ile gezinme:");
		for (int i = 0; i<musteriler.size(); i++){
			System.out.println(musteriler.get(i));
		}
		
		//foreach ile gezinme
		System.out.println("foreach ile gezinme:");
		for (String musteri: musteriler){
			System.out.println(musteri);
		}
		//foreach methodu ile gezinme
		System.out.println("foreach methodu ile gezinme:");
		musteriler.forEach(System.out::println);
		//listIterator ile gezinme
		System.out.println("listIterator ile gezinme:");
		ListIterator<String> stringListIterator = musteriler.listIterator();
		System.out.println("next: "+ stringListIterator.next());
		System.out.println("next: "+ stringListIterator.next());
		System.out.println("next: "+ stringListIterator.next());
		
		System.out.println("nextIndex: "+stringListIterator.nextIndex());
		
		System.out.println("previous: "+ stringListIterator.previous());
		System.out.println("previous: "+ stringListIterator.previous());
		System.out.println("previous: "+ stringListIterator.previous());
		
		System.out.println("nextIndex: "+stringListIterator.previousIndex());
		
		stringListIterator.add("Tolga");
		stringListIterator.previous();
		while (stringListIterator.hasNext()){
			System.out.println(stringListIterator.next());
		}
		stringListIterator.remove();
		System.out.println("Geriye saran döngü:");
		while (stringListIterator.hasPrevious()){
			System.out.println(stringListIterator.previous());
		}
		stringListIterator.remove();
		System.out.println("-----------");
		while (stringListIterator.hasNext()){
			System.out.println(stringListIterator.next());
		}
	}
}