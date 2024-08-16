package com.ajwalker.week06.list_interface.arr_list.arr_sort.comparator_exmple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonelCompare {
	public static void main(String[] args) {
		ArrayList<Personel> personelArrayList = new ArrayList<>();
		
		personelArrayList.add(new Personel("Alex",500000.0,"Walker",30));
		personelArrayList.add(new Personel("Alexander Joseph",400000.0,"Saçak",25));
		personelArrayList.add(new Personel("Emirhan",450000.0,"Tufan",28));
		personelArrayList.add(new Personel("Emine",450000.0,"Sakin",28));
		
		/*
		* Bu sınıf içine bir Comparator yazınız.
		* Bu Comparator ile personelArrayList'i ad'a göre a->z ye sıralayalım.
		* Eğer adlar aynı ise soyada göre z->a'ta sıralayalım.
		* */
		
		Comparator<Personel> personelComparator = new Comparator<Personel>() {
			@Override
			public int compare(Personel o1, Personel o2) {
				if (o1.getAd().equalsIgnoreCase(o2.getAd())){
					return o2.getSoyad().compareTo(o1.getSoyad());
				}
				else return o1.getAd().compareTo(o2.getAd());
			}
		};
		Collections.sort(personelArrayList, personelComparator);
		personelArrayList.forEach(System.out::println);
		
		//Personel isimlerinin uzunluğuna göre
		Comparator<Personel> personelLengthComparator = new Comparator<Personel>() {
			@Override
			public int compare(Personel o1, Personel o2) {
				return o1.getAd().length() - o2.getAd().length();
			}
		};
		System.out.println("----");
		Collections.sort(personelArrayList, personelLengthComparator);
		personelArrayList.forEach(System.out::println);
	
	}
}