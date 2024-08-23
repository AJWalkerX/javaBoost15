package com.ajwalker.factory.ornek01.Ornek01;

public class Kamyon extends Tasima {
	
	public Kamyon() {
		super(TasimaTip.KARA);
		tasi();
	}
	
	@Override
	public void tasi(){
		System.out.println("Kamyon taşıma işlemi yaptı...");
	}
}