package com.ajwalker.week06.list_interface.arr_list;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorUsage {
	public static void main(String[] args) {
		ArrayList<Integer> sayilar = new ArrayList<>();
		sayilar.add(1);
		sayilar.add(3);
		sayilar.add(6);
		sayilar.add(4);
		sayilar.add(2);
		
		System.out.println("Sayilar arraylist ilk hali: ");
		for (Integer sayi: sayilar){
			System.out.print(sayi+ " ");
		}
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		};
		// aynısı
		Comparator<Integer> comparator1 = (o1, o2) -> o1-o2;
		// aynısı
		Comparator<Integer> comparator2 = Comparator.comparingInt(o -> o);
		
		// notlarını barış hocanın kodlarından kontrol et!
	}
	
}