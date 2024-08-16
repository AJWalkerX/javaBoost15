package com.ajwalker.week06.map.hashmap.ogrenci;

public class Ogrenci {
	private Integer ogrenciNo;
	private String ad;
	private String soyad;
	
	public Ogrenci(String ad, Integer ogrenciNo, String soyad) {
		this.ad = ad;
		this.ogrenciNo = ogrenciNo;
		this.soyad = soyad;
	}
	
	public String getAd() {
		return ad;
	}
	
	public Integer getOgrenciNo() {
		return ogrenciNo;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	@Override
	public String toString() {
		return "Ogrenci{" + "ad='" + getAd() + '\'' + ", ogrenciNo=" + getOgrenciNo() + ", soyad='" + getSoyad() + '\'' + '}';
	}
}