package com.ajwalker.week06.list_interface.arr_list.arr_sort;

public class Ogrenci implements Comparable<Ogrenci>{
	private String ad;
	private Integer yas;
	private Double ort;
	
	public Ogrenci(String ad, Double ort, Integer yas) {
		this.ad = ad;
		this.ort = ort;
		this.yas = yas;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public Double getOrt() {
		return ort;
	}
	
	public void setOrt(Double ort) {
		this.ort = ort;
	}
	
	public Integer getYas() {
		return yas;
	}
	
	public void setYas(Integer yas) {
		this.yas = yas;
	}
	@Override
	public int compareTo(Ogrenci o) {
//		return (this.ort < o.ort)? -1 : (this.ort == o.ort)? 0 : 1;
		return this.ad.compareTo(o.ad);
	}
	
	@Override
	public String toString() {
		return "Ogrenci{" + "ad='" + getAd() + '\'' + ", yas=" + getYas() + ", ort=" + getOrt() + '}';
	}
	
}