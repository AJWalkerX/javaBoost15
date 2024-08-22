package com.ajwalker.lsp.lsp_uygun2;

public class Kare implements ISekil {
	int kenar;
	
	public void setKenar(int kenar) {
		this.kenar = kenar;
	}
	
	@Override
	public int alanHesapla() {
		return kenar*kenar;
	}
}