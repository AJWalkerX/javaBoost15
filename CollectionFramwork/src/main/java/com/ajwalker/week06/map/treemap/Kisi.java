package com.ajwalker.week06.map.treemap;

public class Kisi {
	private String ad;
	private String soyad;
	private String il;
	
	public Kisi(String ad, String soyad, String il) {
		this.ad = ad;
		this.soyad = soyad;
		this.il = il;
	}
	
	public String getAd() {
		return ad;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public String getIl() {
		return il;
	}
	
	@Override
	public String toString() {
		return getAd() + " " + getSoyad() + " " + getIl();
	}
}