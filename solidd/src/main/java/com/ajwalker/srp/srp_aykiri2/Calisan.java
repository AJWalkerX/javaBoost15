package com.ajwalker.srp.srp_aykiri2;

public class Calisan {
	private String ad;
	private String id;
	private String departman;
	private Double brutMaas;
	
	public Calisan(String ad, String id, String departman, Double brutMaas) {
		this.ad = ad;
		this.id = id;
		this.departman = departman;
		this.brutMaas = brutMaas;
	}
	
	public String calisanBilgileriniYaz() {
		return "Calisan{" +
				"ad='" + ad + '\'' +
				", id='" + id + '\'' +
				", departman='" + departman + '\'' +
				", brutMaas=" + brutMaas + '}';
	}
	
	//!Burada olmamalı! SRP'ye uygun değildir.
	public void maasHesapla(){
		double vergi = brutMaas*0.2;
		double netMaas = brutMaas-vergi;
		System.out.println(ad+" maası: "+ netMaas);
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDepartman() {
		return departman;
	}
	
	public void setDepartman(String departman) {
		this.departman = departman;
	}
	
	public Double getBrutMaas() {
		return brutMaas;
	}
	
	public void setBrutMaas(Double brutMaas) {
		this.brutMaas = brutMaas;
	}
}