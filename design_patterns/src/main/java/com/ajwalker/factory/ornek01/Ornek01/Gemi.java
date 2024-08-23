package com.ajwalker.factory.ornek01.Ornek01;

public class Gemi extends Tasima {
	
	public Gemi() {
		super(TasimaTip.DENIZ);
		tasi();
	}
	
	public void tasi(){
		System.out.println("Gemi taşıma işlemi yaptı...");
	}
}