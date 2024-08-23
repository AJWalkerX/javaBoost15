package com.ajwalker.factory.ornek01.Ornek01;
/*
Factory: Fabrika
Bazı nesneleri üretirken bağımlılıktan kaçınmak ve genişletilebilirliği sağlamak için üretimi başka bir sınıfa
(factory) bırakma
Detayları, nesnenin nasıl oluşturulacağını soyutlarsınız.
 */
public class Runner {
	public static void main(String[] args) {
		/*Kamyon kamyon = new Kamyon();
		kamyon.tasi();
		
		Gemi gemi = new Gemi();
		gemi.tasi();*/
		
		Tasima tasima=TasimaFactory.builder(TasimaTip.KARA);
		tasima=TasimaFactory.builder(TasimaTip.DENIZ);
		tasima=TasimaFactory.builder(TasimaTip.HAVA);
	 
	}
}