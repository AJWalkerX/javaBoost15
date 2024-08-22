package com.ajwalker.srp.srp_aykiri3;

public class ProductManager {
	//!Birden fazla işi aynı anda yapıyor. SRP kurallına uymaz
	public void managerProduct(String islemTuru, String product){
		if (islemTuru.equalsIgnoreCase("ekle")){
			System.out.println("ürün eklendi!");
		}
		else if (islemTuru.equalsIgnoreCase("sil")) {
			System.out.println("Ürün silindi!");
		}
		else if (islemTuru.equalsIgnoreCase("goruntule")) {
			System.out.println("Ürün görüntülendi!");
		}
	}
}