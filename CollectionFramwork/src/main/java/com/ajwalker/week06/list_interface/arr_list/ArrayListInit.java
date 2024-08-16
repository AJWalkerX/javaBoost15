package com.ajwalker.week06.list_interface.arr_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListInit {
	public static void main(String[] args) {
		//Array'den arrayList'e dönüştürme: Arrays.asList
		
		String[] futbolcular = {"Neymar", "Messi", "Ronaldo"};
		List<String> futbolcularList = Arrays.asList(futbolcular);
		System.out.println(futbolcularList);
		
		//Arrays.asList ile initilization
		ArrayList<String> voleybolcular = new ArrayList<>(Arrays.asList("Eda","Tuğçe", "Bahar"));
		System.out.println(voleybolcular);
		
		ArrayList<String> okcuList = new ArrayList<>(List.of("Mete","Alp","Cenk"));
		System.out.println(okcuList);
		
		ArrayList<String> yuzucuList = new ArrayList<>();
		Collections.addAll(yuzucuList, "Duygu", "Canan", "Şule");
		System.out.println(yuzucuList);
		
		//Stream:
		ArrayList<String> harfler = Stream
				.of("A", "B", "C", "F")
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(harfler);
	}
}