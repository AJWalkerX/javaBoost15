package com.ajwalker.srp.srp_uygun2;

public class MaasManager {
	public void maasHesapla(Calisan calisan){
		double vergi = calisan.getBrutMaas()*0.2;
		double netMaas = calisan.getBrutMaas()-vergi;
		System.out.println(calisan.getAd()+" maası: "+ netMaas);
	}
}