package com.ajwalker.factory.ornek01.Ornek01;

public class Ucak extends Tasima {
	
	public Ucak() {
		super(TasimaTip.HAVA);
		tasi();
	}
	
	public void tasi(){
		System.out.println("Uçak taşıma işlemi yaptı...");
	}
}