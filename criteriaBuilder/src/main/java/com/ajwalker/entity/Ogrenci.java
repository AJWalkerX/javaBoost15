package com.ajwalker.entity;

import com.ajwalker.enums.ECinsiyet;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name ="tblogrenci")
public class Ogrenci {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(length = 11, unique = true)
	String tckimlik;
	
	@Column(length = 30)
	String ad;
	
	@Column(length = 30)
	String soyad;
	
	@Enumerated
	ECinsiyet cinsiyet;
	
	LocalDate dogumtarihi;
	
	public Ogrenci(String tckimlik, String ad, String soyad, ECinsiyet cinsiyet, LocalDate dogumtarihi) {
		this.tckimlik = tckimlik;
		this.ad = ad;
		this.soyad = soyad;
		this.cinsiyet = cinsiyet;
		this.dogumtarihi = dogumtarihi;
	}
	
	public Ogrenci() {
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTckimlik() {
		return tckimlik;
	}
	
	public void setTckimlik(String tckimlik) {
		this.tckimlik = tckimlik;
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
	
	public ECinsiyet getCinsiyet() {
		return cinsiyet;
	}
	
	public void setCinsiyet(ECinsiyet cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	
	public LocalDate getDogumtarihi() {
		return dogumtarihi;
	}
	
	public void setDogumtarihi(LocalDate dogumtarihi) {
		this.dogumtarihi = dogumtarihi;
	}
	
	@Override
	public String toString() {
		return "Ogrenci{" + "id=" + getId() + ", tckimlik='" + getTckimlik() + '\'' + ", ad='" + getAd() + '\'' + ", soyad='" + getSoyad() + '\'' + ", cinsiyet=" + getCinsiyet() + ", dogumtarihi=" + getDogumtarihi() + '}';
	}
}