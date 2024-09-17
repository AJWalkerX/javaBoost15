package com.ajwalker;

import com.ajwalker.entity.Ogrenci;
import com.ajwalker.enums.ECinsiyet;
import com.ajwalker.repository.OgrenciRepository;

import java.time.LocalDate;

public class Runner {
	public static void main(String[] args) {
		//Ogrenci o1=new Ogrenci("11122233344", "Arda", "Güler", ECinsiyet.ERKEK, LocalDate.of(2000,10,10));
		Ogrenci o2=new Ogrenci("11122233355", "Emre", "Mor", ECinsiyet.ERKEK, LocalDate.of(2000,10,10));
		//new OgrenciRepository().save(o1);
		new OgrenciRepository().save(o2);
		
		new OgrenciRepository().findAll().forEach(System.out::println);
	}
}