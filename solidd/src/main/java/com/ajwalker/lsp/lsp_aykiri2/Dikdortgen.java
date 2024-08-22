package com.ajwalker.lsp.lsp_aykiri2;


public class Dikdortgen {
	int genislik;
	int yukseklik;
	
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