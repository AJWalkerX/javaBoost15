package com.ajwalker.lsp.lsp_aykiri3;

public class Arac {
	public void calistir(){
		System.out.println("Araç çalıştı");
	}
	public void hizlan(){
		System.out.println("Araç hızlandı");
	}
}

class Araba extends Arac{
	@Override
	public void calistir() {
		System.out.println("Araba çalıştı");
	}
	
	@Override
	public void hizlan() {
		System.out.println("Araba hızlandı.");
	}
}

class Bisiklet extends Arac{
	@Override
	public void calistir() {
		//neyi çalıştırayım?
		throw new UnsupportedOperationException("Bu işlem desteklenmiyor.");
	}
	
	@Override
	public void hizlan() {
		super.hizlan();
	}
}