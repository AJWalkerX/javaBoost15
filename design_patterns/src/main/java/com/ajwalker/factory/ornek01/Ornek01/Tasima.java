package com.ajwalker.factory.ornek01.Ornek01;

public abstract class Tasima {
	private TasimaTip tip;
	
	public Tasima(TasimaTip tip) {
		this.tip = tip;
		// yapılması istenen ek işlemler
	}
	abstract void tasi();
	
	public TasimaTip getTip() {
		return tip;
	}
	
	public void setTip(TasimaTip tip) {
		this.tip = tip;
	}
}