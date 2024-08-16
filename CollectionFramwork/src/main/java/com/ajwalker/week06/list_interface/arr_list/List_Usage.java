package com.ajwalker.week06.list_interface.arr_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_Usage {
	public static void main(String[] args) {
		ArrayList<String> isimler = new ArrayList<>();
		
		isimler.add("Kemal");
		isimler.add("Ayşe");
		isimler.add("Duygu");
		isimler.add(2,"Evrim");
		System.out.println(isimler);
		isimler.set(0,"Kenan");
		System.out.println(isimler);
		isimler.remove(2);
		System.out.println(isimler);
		int size = isimler.size();
		System.out.println(size);
		
		ArrayList<String> voleybolcular = new ArrayList<>();
		voleybolcular.add("Eda");
		voleybolcular.add("Başak");
		
		isimler.addAll(0,voleybolcular);
		System.out.println(isimler);
		
		ArrayList<String> oyuncular = new ArrayList<>();
		oyuncular.add("Neymar");
		oyuncular.add("Messi");
		
		isimler.addAll(0,oyuncular);
		
		oyuncular.clear();
		
		int i = isimler.indexOf("Kenan");
		System.out.println(i);
		i = isimler.lastIndexOf("Kenan");
		System.out.println(i);
		
		i = isimler.indexOf("Alex");
		System.out.println(i);
		
		boolean isContains = isimler.contains("Neymar");
		System.out.println(isContains);
		isContains = isimler.contains("Alex");
		System.out.println(isContains);
		
		isContains = isimler.containsAll(oyuncular);
		System.out.println(isContains);
		
		System.out.println(isimler);
		
		List<String> subList = isimler.subList(2, 5);
		System.out.println(subList);
		
		Object[] isimlerArray = isimler.toArray();
		System.out.println(Arrays.toString(isimlerArray));
		
		System.out.println(isimler.getFirst());
		System.out.println(isimler.get(0));
		System.out.println(isimler.getLast());
		System.out.println(isimler.get(isimler.size()-1));
		
		//predicate lamda expr. koşullu ifade.
		boolean isRemoved = isimler.removeIf(x ->{
			return x.equals("Ferdi");
		});
		System.out.println(isimler);
		System.out.println(isRemoved);
		
		
	}

}