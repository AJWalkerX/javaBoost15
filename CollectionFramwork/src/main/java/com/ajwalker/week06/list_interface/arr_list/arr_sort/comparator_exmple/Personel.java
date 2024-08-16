package com.ajwalker.week06.list_interface.arr_list.arr_sort.comparator_exmple;

public class Personel {
	private String ad ;
	private String soyad;
	private Integer yas;
	private  Double maas;
	
	public Personel(String ad, Double maas, String soyad, Integer yas) {
		this.ad = ad;
		this.maas = maas;
		this.soyad = soyad;
		this.yas = yas;
	}
	
	
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public Double getMaas() {
		return maas;
	}
	
	public void setMaas(Double maas) {
		this.maas = maas;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public Integer getYas() {
		return yas;
	}
	
	public void setYas(Integer yas) {
		this.yas = yas;
	}
	@Override
	public String toString() {
		return "Personel{" + "ad='" + getAd() + '\'' + ", soyad='" + getSoyad() + '\'' + ", yas=" + getYas() + ", maas=" + getMaas() + '}';
	}
}