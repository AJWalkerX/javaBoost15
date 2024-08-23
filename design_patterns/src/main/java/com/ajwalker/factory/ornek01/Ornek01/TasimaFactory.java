package com.ajwalker.factory.ornek01.Ornek01;

public class TasimaFactory {
	public static Tasima builder(TasimaTip tip){
		return switch (tip){
			case KARA -> new Kamyon();
			case DENIZ -> new Gemi();
			case HAVA -> new Ucak();
			default -> new Kamyon();
		};
	}
}