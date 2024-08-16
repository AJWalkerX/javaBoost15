package com.ajwalker.week06.list_interface.arr_list.arr_sort;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
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
		
		Collections.sort(sayilar);
		System.out.println("\nsayilar arraylist collection.sort methodundan sonra: ");
		for (Integer sayi: sayilar){
			System.out.print(sayi+ " ");
		}
		
		Ogrenci ogr1 = new Ogrenci("Ali", 50.0, 20);
		Ogrenci ogr2 = new Ogrenci("Zeynep", 40.0,15);
		Ogrenci ogr3 = new Ogrenci("Kaan", 30.5,22);
		ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
		ogrenciler.add(ogr1);
		ogrenciler.add(ogr2);
		ogrenciler.add(ogr3);
		System.out.println("\n"+ogrenciler);
		
		Collections.sort(ogrenciler); // ilk yazıldığında Ogrenci sınıfına Comparable interface'i imlimente olmadığı için hata veriyordu.
		System.out.println("ort göre sıralı: "+ ogrenciler);
	}
}