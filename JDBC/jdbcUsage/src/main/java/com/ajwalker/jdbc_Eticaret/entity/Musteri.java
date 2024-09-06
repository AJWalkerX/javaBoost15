package com.ajwalker.jdbc_Eticaret.entity;

import java.time.LocalDate;

//POJO -> Entity
public class Musteri extends BaseEntity {
	private Integer id;
	private String ad;
	private String soyad;
	private String cinsiyet;
	private LocalDate dtarih;
	private String tel;
	private String email;
	private String sehir;
	// boş constructor:
	public Musteri() {
	}
	// idsiz constructor:
	public Musteri(String ad, String soyad, String cinsiyet, LocalDate dtarih, String tel, String email, String sehir) {
		this.ad = ad;
		this.soyad = soyad;
		this.cinsiyet = cinsiyet;
		this.dtarih = dtarih;
		this.tel = tel;
		this.email = email;
		this.sehir = sehir;
	}
	// full constructor
	public Musteri(Integer id, String ad, String soyad, String cinsiyet, LocalDate dtarih, String tel, String email, String sehir) {
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.cinsiyet = cinsiyet;
		this.dtarih = dtarih;
		this.tel = tel;
		this.email = email;
		this.sehir = sehir;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public String getCinsiyet() {
		return cinsiyet;
	}
	
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	
	public LocalDate getDtarih() {
		return dtarih;
	}
	
	public void setDtarih(LocalDate dtarih) {
		this.dtarih = dtarih;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSehir() {
		return sehir;
	}
	
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	
	
	@Override
	public String toString() {
		return "Musteri{" + "id=" + getId() + ", ad='" + getAd() + '\'' + ", soyad='" + getSoyad() + '\'' +
				", cinsiyet='" + getCinsiyet() + '\'' + ", dtarih=" + getDtarih() + ", tel='" + getTel() + '\'' +
				", email='" + getEmail() + '\'' + ", sehir='" + getSehir() + '\'' + ", state=" + getState() +
				", createat=" + getCreateat() + ", updateat=" + getUpdateat() + '}';
	}
}