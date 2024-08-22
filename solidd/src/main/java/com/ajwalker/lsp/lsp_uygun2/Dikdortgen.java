package com.ajwalker.lsp.lsp_uygun2;

public class Dikdortgen implements ISekil {
	int genislik;
	int yukseklik;
	
	@Override
	public int alanHesapla(){
		return genislik*yukseklik;
	}
	
	public int getGenislik() {
		return genislik;
	}
	
	public void setGenislik(int genislik) {
		this.genislik = genislik;
	}
	
	public int getYukseklik() {
		return yukseklik;
	}
	
	public void setYukseklik(int yukseklik) {
		this.yukseklik = yukseklik;
	}
}